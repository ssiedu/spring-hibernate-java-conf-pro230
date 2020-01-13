package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}

	@Override
	public void updateStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
	}

	@Override
	public Student searchStudentById(int rno) {
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class, rno);
		session.close();
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Student");
		List<Student> students=query.list();
		session.close();
		return students;
	}

	@Override
	public void deleteStudent(int rno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Student student=session.get(Student.class, rno);
		session.delete(student);
		tr.commit();
		session.close();

	}

}
