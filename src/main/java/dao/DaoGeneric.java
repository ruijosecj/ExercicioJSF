package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import util.JPAUtil;

public class DaoGeneric <T>{
	
	public void salvar(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
		
		
	}
	
	public T merge(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		T retorno = entityManager.merge(entidade);
		
		entityTransaction.commit();
		entityManager.close();
		return retorno;
	}
}
