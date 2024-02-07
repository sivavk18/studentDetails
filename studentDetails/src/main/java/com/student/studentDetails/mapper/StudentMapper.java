package com.student.studentDetails.mapper;

import com.student.studentDetails.dto.StudentDto;
import org.mapstruct.Mapper;

import com.student.studentDetails.entity.Student;


@Mapper(componentModel = "spring")
public interface StudentMapper {
	Student toModel(StudentDto dto);
    StudentDto toDto(Student dto);
}
