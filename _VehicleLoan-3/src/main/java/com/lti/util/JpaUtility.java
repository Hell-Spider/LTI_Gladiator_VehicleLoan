package com.lti.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility 
{
	private static EntityManagerFactory factory = null;
	private static EntityManager entityManager = null;
	
	static 
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		if(entityManager == null)
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
