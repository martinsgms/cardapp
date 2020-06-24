package br.com.martinsgms.cardapio.config.validacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class FormErrorHandler {
    
    @Autowired
    private MessageSource messageSource;
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErrorFormDTO> parametrosInvalidos(final MethodArgumentNotValidException exception) {
       
        List<ErrorFormDTO> errorFormDTO = new ArrayList<>(
            exception.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(e -> new ErrorFormDTO(e.getField(), messageSource.getMessage(e, LocaleContextHolder.getLocale())))
                .collect(Collectors.toList())
        );

        return errorFormDTO;
    }
}