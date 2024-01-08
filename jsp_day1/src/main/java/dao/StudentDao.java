package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory  =Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public Student save(Student student)
	{
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
		
	}
	public Student fetchByEmail(String email)
	{
		Query query=entityManager.createQuery("select s from Student s where s.email=?1");
		query.setParameter(1, email);
		Student student=(Student) query.getSingleResult();
		return student;
	}
	public List<Student> getallstudents()
	{
		Query query=entityManager.createQuery("select s from Student s");
		List<Student> students=query.getResultList();
		return students;
	}
	
	public boolean delete(int id)
	{
		Student student=entityManager.find(Student.class, id);
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
		}
		return false;
		
		
	}
	public Student update(Student student)
	{
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
	public Student getStudentsById(int id)
	{
		Student  student=entityManager.find(Student.class, id);
		return student;
	}
	
	

}
