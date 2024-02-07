package com.student.studentDetails.mapper;

import com.student.studentDetails.dto.StudentDto;
import com.student.studentDetails.dto.StudentDto.StudentDtoBuilder;
import com.student.studentDetails.entity.Student;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-07T10:43:05+0530",
    comments = "version: 1.4.0.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toModel(StudentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Student student = new Student();

        student.setStudentId( dto.getStudentId() );
        student.setName( dto.getName() );
        student.setAddress( dto.getAddress() );
        student.setCity( dto.getCity() );

        return student;
    }

    @Override
    public StudentDto toDto(Student dto) {
        if ( dto == null ) {
            return null;
        }

        StudentDtoBuilder studentDto = StudentDto.builder();

        studentDto.studentId( dto.getStudentId() );
        studentDto.name( dto.getName() );
        studentDto.address( dto.getAddress() );
        studentDto.city( dto.getCity() );

        return studentDto.build();
    }
}
