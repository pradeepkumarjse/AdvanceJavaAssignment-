package com.shivit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name="student")
public class Student implements Serializable {

	@Id
	@SequenceGenerator(name="gen1",sequenceName="student_no_seq1",initialValue=3000,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer studentId;
	@NonNull
	private String studentName;
	
	//HAS-A Property
	@ManyToMany(targetEntity=Course.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="students")
	private Set<Course> courses;
}
