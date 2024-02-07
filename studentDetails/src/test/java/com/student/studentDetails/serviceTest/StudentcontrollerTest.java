//package com.student.studentDetails.serviceTest;
//
//import com.student.studentDetails.dto.StudentDto;
//import com.student.studentDetails.entity.Student;
//import com.student.studentDetails.serviceImpl.studentServiceImpl;
//
//
//
//import static com.student.StudentDtails.util.mockAndAssertion.buildStudent;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.notNullValue;
//import static org.hamcrest.CoreMatchers.nullValue;
//import static org.hamcrest.MatcherAssert.assertThat;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//public class StudentcontrollerTest {
//
//	 private static final String LOCALHOST = "http://localhost:";
//	  private static final String CONTEXT_PATH = "/students/";
//	  @Autowired
//	  private studentServiceImpl Service;
//	  @Autowired
//	  private TestRestTemplate restTemplate;
//	  @LocalServerPort
//	  private int port;
//
//	  @Test
//	  void postStudentSuccessful() {
//		  Student student = buildStudent();
//		  HttpEntity<Student> request = new HttpEntity<>(student);
//		  String loginUrl = LOCALHOST + port + CONTEXT_PATH;
//		    StudentDto response = restTemplate.exchange(loginUrl, HttpMethod.POST, request,
//		        new ParameterizedTypeReference <StudentDto>() {
//		        }).getBody();
////		    Student stu=new Student();
////		    StudentDto Dto =new StudentDto();
////		    StudentDto saved = Service.addStudent(stu);
//		    assertThat(response, is(notNullValue()));
//	  }
//
//	  @Test
//	void getStudentSuccesful() {
//		  Student student = buildStudent();
//		  HttpEntity<Student> request = new HttpEntity<>(student);
//		  String loginUrl = LOCALHOST + port + CONTEXT_PATH;
//		    StudentDto response = restTemplate.exchange(loginUrl, HttpMethod.GET, request,
//		        new ParameterizedTypeReference <StudentDto>() {
//		        }).getBody();
////		    Student stu=new Student();
////		    StudentDto Dto =new StudentDto();
////		    StudentDto saved = Service.getStudent(stu.getStudentId());
//		    assertThat(response, is(notNullValue()));
//	  }
//}
