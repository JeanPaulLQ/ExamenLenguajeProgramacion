package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class SubjectDaoImpl implements SubjectInterface{
	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("Examen01");
		em = factory.createEntityManager();
	}
	@Override
	public void create(Subject sub) {
		em.getTransaction().begin();
		em.persist(sub);
		em.getTransaction().commit();
	}
	
	@Override
	public void update(Subject sub) {
		try {
			em.getTransaction().begin();
			em.merge(sub);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Integer id) {
		Subject sub = find(id);
		em.getTransaction().begin();
		em.remove(sub);
		em.getTransaction().commit();
		
	}
	@Override
	public Subject find(Integer id) {
		return em.find(Subject.class, id);
	}

	@Override
	public List<Subject> findAll() {
		Query query = em.createNamedQuery("Subject.findAll");
		List<Subject> list = query.getResultList();
		return list;
	}



	
}
