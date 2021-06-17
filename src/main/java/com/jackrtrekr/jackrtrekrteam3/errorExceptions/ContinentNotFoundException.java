package com.jackrtrekr.jackrtrekrteam3.errorExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT, reason = "Bad request, you cannot trek on like this.")
public class ContinentNotFoundException extends Exception {
}
