package com.student.studentDetails.exception;



public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {

        super("resource not found!!");

    }
    public ResourceNotFoundException(String student, String studentId) {

        super(student + " with " + studentId );

    }
}
