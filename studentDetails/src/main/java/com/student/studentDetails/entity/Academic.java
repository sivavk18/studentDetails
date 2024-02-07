package com.student.studentDetails.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Academic {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer AcaId;
private String Semester;
private Integer rollno;
private Integer cgpa;
private Integer attendanceP;
@ManyToOne(fetch = FetchType.LAZY)
private Student student;
}
