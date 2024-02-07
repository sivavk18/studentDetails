package com.student.studentDetails.controller;

import java.util.List;
import java.util.Map;

import com.student.studentDetails.dto.StudentDto;
import com.student.studentDetails.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentDetails.entity.Student;
import com.student.studentDetails.service.studentService;






@RestController
@RequestMapping("/api/v1")
@Service
public class studentController {

	@Autowired
	private studentService studentServices;

	
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	@PostMapping("{/student}")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse create(@RequestBody StudentDto studentDto) {
        return studentServices.createStudent(studentDto);
    }
}
