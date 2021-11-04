package com.project.status.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason="This is a message of exception")
public class ForbiddenException extends RuntimeException {}