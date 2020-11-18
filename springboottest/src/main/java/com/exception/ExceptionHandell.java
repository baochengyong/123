package com.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class ExceptionHandell {
	public static String ERROR_VIVE = "error";
	@ExceptionHandler(Exception.class)
	public Object errorHandle(HttpServletRequest request,HttpServletResponse response,Exception e) {
		e.printStackTrace();
		ModelAndView mav = new ModelAndView();
		mav.addObject("execption", e);
		mav.addObject("url", request.getRequestURI());
		mav.setViewName(ERROR_VIVE);
		return mav;
	}
}
