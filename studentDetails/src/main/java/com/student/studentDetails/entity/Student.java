package com.student.studentDetails.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer studentId;
	 private String name;
	 private String address;
	 private String city;
	 private Integer phone;
	 @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private Set<Academic> academic = new HashSet<>();
}

 