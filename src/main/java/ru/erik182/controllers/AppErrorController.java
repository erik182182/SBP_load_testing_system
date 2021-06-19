package ru.erik182.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController {

    @Value("${error.message.404}")
    private String messageNotFound;
    @Value("${error.message.500}")
    private String messageInternalServerError;
    @Value("${error.message.other}")
    private String messageOtherError;

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            model.addAttribute("code", statusCode);
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                model.addAttribute("message", messageNotFound);
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                model.addAttribute("message", messageInternalServerError);
            } else model.addAttribute("message", messageOtherError);
        } else {
            model.addAttribute("code", "");
            model.addAttribute("message", messageOtherError);
        }
        return "error";
    }

}
