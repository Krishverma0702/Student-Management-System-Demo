package com.demo.student.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.demo.student.model.Student;

@Repository
public class StudentRepository {
	public String saveData(Student s) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction trans = session.beginTransaction();
		
		session.persist(s);
		
		trans.commit();
		session.close();
		sf.close();
		return "Data Saved Successfully";
	}
}
