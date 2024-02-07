package com.student.studentDetails.dto;

import javax.persistence.Entity;

import com.student.studentDetails.entity.Student;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentDto {
	private Integer studentId;
	 private String name;
	 private String address;
	 private String city;
	 private Integer phoneno;
}
