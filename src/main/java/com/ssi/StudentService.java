package com.ssi;

import java.util.List;


public interface StudentService {
	//creating a new Student record
	public void createStudent(Student student);
	//updating a Student record
	public void changeStudentData(Student student);
	//fetching single student using id
	public Student getStudent(int rno);
	//getting all students
	public List<Student> findAllStudents();
	//deleting students data
	public void deleteStudent(int rno);
	//method for computing the grade of Student
	public String getGrade(int per);
	//method for checking rank of student
	public int getRank();
}
