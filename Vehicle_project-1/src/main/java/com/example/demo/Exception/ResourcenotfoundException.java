package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourcenotfoundException extends  RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ResourceName;//Employee

	private String FieldName;//Id

	private Object FieldValue;//2

	public ResourcenotfoundException(String resourceName, String fieldName, Object fieldValue) {
		super(resourceName+" not found for"+fieldName+ " with value:" +fieldValue);
		ResourceName = resourceName;
		FieldName = fieldName;
		FieldValue = fieldValue;
	}

	public String getResourceName() {
		return ResourceName;
	}

	public void setResourceName(String resourceName) {
		ResourceName = resourceName;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public Object getFieldValue() {
		return FieldValue;
	}

	public void setFieldValue(Object fieldValue) {
		FieldValue = fieldValue;
	}


}
