package com.student.studentDetails.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(Integer studentId){
		super();
    }
}
