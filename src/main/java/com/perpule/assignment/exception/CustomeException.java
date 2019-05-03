package com.perpule.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NO_CONTENT, reason="Customer inforamtion not avaliable")
public class CustomeException extends RuntimeException{}
