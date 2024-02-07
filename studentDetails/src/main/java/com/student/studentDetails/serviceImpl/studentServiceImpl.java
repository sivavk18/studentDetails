package com.student.studentDetails.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import com.student.studentDetails.dto.StudentDto;
import com.student.studentDetails.response.ApiResponse;
import org.springframework.stereotype.Service;
import com.student.studentDetails.entity.Student;
import com.student.studentDetails.exception.StudentNotFoundException;
import com.student.studentDetails.mapper.StudentMapper;
import com.student.studentDetails.repository.studentRepository;
import com.student.studentDetails.service.studentService;



@Service
public class studentServiceImpl implements studentService {
	
	public studentServiceImpl(studentRepository studentRepo, StudentMapper studentMapper) {
		super();
		this.studentRepo = studentRepo;
		this.studentMapper = studentMapper;
	}

	private final studentRepository studentRepo ;
	private  final StudentMapper studentMapper;
	@Override
	public ApiResponse createStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		Student student = studentMapper.toModel(studentDto);
        Student saved = studentRepo.save(student);
        ApiResponse messageResponseDTO = createMessageResponse("student successfully created with ID ", saved.getStudentId());
         return messageResponseDTO;
	}
	@Override
	public StudentDto findById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		 Student student = studentRepo.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	        return studentMapper.toDto(student);
	}
	@Override
	public List<StudentDto> listAll() {
		// TODO Auto-generated method stub
		 List<Student>student =studentRepo.findAll();
	        return student.stream()
	                .map(studentMapper::toDto)
	                .collect(Collectors.toList());
	}
	@Override
	public ApiResponse update(Integer studentId, StudentDto studentDto) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		 studentRepo.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	        Student studentUpdate = studentMapper.toModel(studentDto);
	        Student saved = studentRepo.save(studentUpdate);
	        ApiResponse messageResponseDTO = createMessageResponse("student successfully created with ID ", saved.getStudentId());
	        return messageResponseDTO;
	}
	@Override
	public void delete(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		 studentRepo.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	        studentRepo.deleteById(studentId);
		
	}
	 private ApiResponse createMessageResponse(String s, Integer id) {
	        return ApiResponse.builder()
	                .message(s + id)
	                .build();
	    }
	
		
	}
	
	


