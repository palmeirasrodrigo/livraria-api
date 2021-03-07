package com.estudos.rodrigo.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrror extends StandardError{

	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationErrror() {
		super();
	}

	public ValidationErrror(Long timestamp, Integer status, String error) {
		super(timestamp, status, error);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}
	
}
