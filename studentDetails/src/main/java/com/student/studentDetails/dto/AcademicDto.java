package student.studentDetails.dto;



import javax.persistence.Entity;

import com.student.studentDetails.entity.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcademicDto {
	private int AcaId;
	private String Semester;
	private int rollno;
	private int cgpa;
	private int attendance;
	private Student student;
}
