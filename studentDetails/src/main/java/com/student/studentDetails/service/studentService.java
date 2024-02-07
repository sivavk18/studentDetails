package com.student.studentDetails.service;

import java.util.List;


import com.student.studentDetails.dto.StudentDto;
import com.student.studentDetails.exception.StudentNotFoundException;

import com.student.studentDetails.response.ApiResponse;



public interface studentService {

	public ApiResponse createStudent(StudentDto studentDto);
    public StudentDto findById(Integer studentId) throws StudentNotFoundException;
    public List<StudentDto> listAll();
    public ApiResponse update(Integer studentId, StudentDto studentDto) throws StudentNotFoundException;
    public void delete(Integer studentId) throws StudentNotFoundException;
		
}
