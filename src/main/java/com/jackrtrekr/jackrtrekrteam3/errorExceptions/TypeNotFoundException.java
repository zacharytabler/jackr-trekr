package com.jackrtrekr.jackrtrekrteam3.errorExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Bad request, we cannot keep meeting like this. You need to get trekking.")
public class TypeNotFoundException extends Exception {
}
