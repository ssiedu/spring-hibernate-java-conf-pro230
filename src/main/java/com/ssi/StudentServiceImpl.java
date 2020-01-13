package com.ssi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	
	@Override
	public void createStudent(Student student) {

		dao.addStudent(student);

	}

	@Override
	public void changeStudentData(Student student) {
		dao.updateStudent(student);

	}

	@Override
	public Student getStudent(int rno) {
		// TODO Auto-generated method stub
		return dao.searchStudentById(rno);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.getAllStudents();
	}

	@Override
	public void deleteStudent(int rno) {
		dao.deleteStudent(rno);

	}

	@Override
	public String getGrade(int per) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return 0;
	}

}
