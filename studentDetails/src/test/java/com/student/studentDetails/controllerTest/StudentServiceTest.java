//package com.student.studentDetails.controllerTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.student.studentDetails.dto.StudentDto;
//import com.student.studentDetails.exception.StudentNotFoundException;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.student.studentDetails.entity.Student;
//import com.student.studentDetails.mapper.StudentMapper;
//import com.student.studentDetails.repository.studentRepository;
//import com.student.studentDetails.serviceImpl.studentServiceImpl;
//
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//public class StudentServiceTest {
//@MockBean
//private studentRepository studentRepo;
//
//@MockBean
//private StudentMapper studentMapper;
//@Autowired
//private studentServiceImpl Service;
//
//@Test
//public void addStudentDetails() {
//	Student stu =createStudent();
//	StudentDto Dto =createStudentDto();
//	when(studentMapper.toDto(stu)).thenReturn(Dto);
//Mockito.when(studentRepo.save(Mockito.any())).thenReturn(new Student());
//	Integer studentId =1;
//	doReturn(Optional.of(stu)).when(studentRepo).findById(studentId );
//	StudentDto dtos =Service.addStudent(stu)
//	assertEquals(1,student.getStudentId());
//	 Student stun = Student.builder().address("sector-18").name("siva").city("noida").studentId(1).build();
//	 studentRepo.save(student);
//	 StudentDto saved = Service.createStudent(Dto);
//	 assertEquals(saved.getName(),Dto.getName());
//	 assertEquals(saved.getAddress(),Dto.getAddress());
//	 assertEquals(saved.getCity(),Dto.getCity());
//}
//
//@Test
//public void studentById() throws StudentNotFoundException {
//Student stu =createStudent();
//StudentDto Dto =createStudentDto();
//when(studentMapper.toDto(stu)).thenReturn(Dto);
//Mockito.when(studentRepo.save(Mockito.any())).thenReturn(new Student());
//StudentDto saved = Service.findById(stu.getStudentId());
//assertEquals(saved.getStudentId(),Dto.getStudentId());
//}
//
//public void delete() {
//	Student stu =createStudent();
//	StudentDto Dto =createStudentDto();
//	when(studentMapper.toDto(stu)).thenReturn(Dto);
//	when(studentMapper.toModel(Dto)).thenReturn(stu);
//	Mockito.when(studentRepo.save(Mockito.any())).thenReturn(stu);
//}
//
//private Student createStudent() {
//	Student students =new Student();
//	students.setAddress("sector-18");
//	students.setCity("noida");
//	students.setName("siva");
//	return students;
//}
//
//private StudentDto createStudentDto() {
//	StudentDto dto =new StudentDto();
//	dto.setAddress("sector-18");
//	dto.setCity("noida");
//	dto.setName("siva");
//	return dto;
//}
//}
