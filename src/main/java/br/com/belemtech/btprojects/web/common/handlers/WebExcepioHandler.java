package br.com.belemtech.btprojects.web.common.handlers;

import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class WebExcepioHandler {

    @ExceptionHandler(NoSuchElementException.class) 
    public ModelAndView handlerNoSuchElementException(NoSuchElementException e) {
        var model = Map.of("message", e.getMessage());

        return new ModelAndView("error/error", model);
    }

}
