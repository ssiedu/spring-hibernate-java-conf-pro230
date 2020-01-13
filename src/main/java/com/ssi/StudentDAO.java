package com.ssi;

import java.util.List;

public interface StudentDAO {
	//adding a new Student record
	public void addStudent(Student student);
	//updating an existing record
	public void updateStudent(Student student);
	//searching a student using its id
	public Student searchStudentById(int rno);
	//fetching all students data
	public List<Student> getAllStudents();
	//deleting a student using its id
	public void deleteStudent(int rno);
	//..
	//..
	//..
}
