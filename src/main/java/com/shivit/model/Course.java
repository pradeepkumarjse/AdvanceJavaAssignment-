package com.shivit.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="course")
public class Course implements Serializable {
	@Id
	@SequenceGenerator(name="gen1",sequenceName="course_no_seq1",initialValue=3000,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
    private Integer courseId;;
    @NonNull
    private String courseName;
    
    //HAS-A Property
    @ManyToMany(targetEntity=Student.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name="Courses_Students",
    joinColumns=@JoinColumn(name="COURSE_ID",referencedColumnName="COURSEID"),
    inverseJoinColumns=@JoinColumn(name="STUDENT_ID",referencedColumnName="STUDENTID"))
    private Set<Student> students;
}
