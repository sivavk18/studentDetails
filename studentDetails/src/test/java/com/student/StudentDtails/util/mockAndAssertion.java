//package com.student.StudentDtails.util;
//
//import com.student.studentDetails.dto.StudentDto;
//import com.student.studentDetails.entity.Student;
//import io.github.benas.randombeans.EnhancedRandomBuilder;
//import io.github.benas.randombeans.api.EnhancedRandom;
//
//
//public class mockAndAssertion {
//
//
//	    protected mockAndAssertion() {
//
//	    }
//
//	    public static Student buildStudent() {
//
//	    	 final EnhancedRandom RANDOM = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
//	                 .overrideDefaultInitialization(true).collectionSizeRange(1, 1).build();
//	    	 final Student student = RANDOM.nextObject(Student.class);
//	         return student;
//	    }
//
//	    public static StudentDto buildStudentDto() {
//	    	 final EnhancedRandom RANDOM = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
//	                 .overrideDefaultInitialization(true).collectionSizeRange(1, 1).build();
//	    	 final StudentDto students = RANDOM.nextObject(StudentDto.class);
//	         return students;
//	    }
//}
