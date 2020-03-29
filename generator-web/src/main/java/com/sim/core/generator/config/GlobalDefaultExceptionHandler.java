package com.sim.core.generator.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sim.core.generator.entity.ReturnT;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ReturnT<Object> defaultExceptionHandler(HttpServletRequest req,Exception e) {
		e.printStackTrace();
		return new ReturnT<>(ReturnT.FAIL_CODE, e.getMessage());
	}
	
}
