package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.model.Account;
import com.lti.model.AdminDetails;
import com.lti.model.Approved;
import com.lti.model.LoanAppTable;
import com.lti.model.UserAdvanced;
import com.lti.model.UserBasic;
import com.lti.util.JpaUtility;

public class VehicleDaoImpl {
	private EntityManager entityManager;

	//Constructor to initialize the Entity Manager
	public VehicleDaoImpl() 
	{
		entityManager = JpaUtility.getEntityManager();
	}

	//PERSISTING
	//Administrator Registration
	public void adminRegistration(AdminDetails admin)
	{
		entityManager.persist(admin);
	}
	//User Registration
	public void userRegistration(UserBasic userbasic)
	{
		entityManager.persist(userbasic);
	}
	//Loan Application Table Fill Up
	public void loanRegistration(LoanAppTable loanapptable)
	{
		entityManager.persist(loanapptable);
	}
	//Approved Loan Registration
	public void approveLoan(Approved approved)
	{
		entityManager.persist(approved);
	}
	
	
	//FETCHING DATA FROM THE DATABASE
	//USER
	public UserBasic showUserRegistrationInformation(String email)
	{
		String jpql = "select u from UserBasic u where u.email=:email";
		Query query = entityManager.createQuery(jpql).setParameter("email",email);
		UserBasic u = (UserBasic)query.getSingleResult();
		return u;
	}
	public UserAdvanced showUserDetailsInformation(String email)
	{
		String jpql = "select u from UserAdvanced u where u.userregister.email=:email";
		Query query = entityManager.createQuery(jpql).setParameter("email",email);
		UserAdvanced u = (UserAdvanced)query.getSingleResult();
		return u;
	}
	public void passwordReset(UserBasic u)
	{
		entityManager.merge(u);
	}
	public List<LoanAppTable> showUserLoanApplication(String email)
	{
		String jpql = "select l from LoanAppTable l where l.user.userId=(select u.userId from UserAdvanced u where u.userregister.email=:email)";
		TypedQuery<LoanAppTable> tquery = entityManager.createQuery(jpql,LoanAppTable.class).setParameter("email", email);
		List<LoanAppTable> list = tquery.getResultList();
		return list;
	}
	public List<Approved> showUserApprovedLoanApplication(String email)
	{
		String jpql = "select a from Approved a where a.loanapp.status='approved' and a.loanapp.user.userId=(select u.userId from UserAdvanced u where u.userregister.email=:email)";
		TypedQuery<Approved> tquery = entityManager.createQuery(jpql,Approved.class).setParameter("email",email);
		List<Approved> list = tquery.getResultList();
		return list;
	}
	public List<Approved> showApproved(String chassisNumber)
	{
		String jpql = "select a from Approved a where a.loanapp.chassisNo=:chassisNumber";
		TypedQuery<Approved> tquery = entityManager.createQuery(jpql, Approved.class).setParameter("chassisNumber", chassisNumber);
		List<Approved> list = tquery.getResultList();
		return list;
	}
	
	
	//ADMIN
	public List<Object[]> showAllRegisteredUser()
	{
		String jpql = "select u.email,u.name,u.age,u.gender,u.mobile from UserBasic u";
		Query tquery = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Object[]> list = tquery.getResultList();
		return list;
	}
	public List<LoanAppTable> showAllLoanApplication()
	{
		String jpql = "select l from LoanAppTable l";
		TypedQuery<LoanAppTable> tquery = entityManager.createQuery(jpql,LoanAppTable.class);
		List<LoanAppTable> list = tquery.getResultList();
		return list;
	}
	public void updateLoanApplicationStatus(LoanAppTable loanapptable)
	{
		entityManager.merge(loanapptable);
	}
	public List<Approved> showAllApprovedLoans()
	{
		String jpql = "select a from Approved a";
		TypedQuery<Approved> tquery = entityManager.createQuery(jpql,Approved.class);
		List<Approved> list = tquery.getResultList();
		return list;
	}
	
	//LOGIN
	public List<AdminDetails> showAllAdmin()
	{
		TypedQuery<AdminDetails> tquery = entityManager.createQuery("select a from AdminDetails a",AdminDetails.class);
		List<AdminDetails> list = tquery.getResultList();
		return list;
	}
	public List<UserBasic> showAllUser()
	{
		TypedQuery<UserBasic> tquery = entityManager.createQuery("select a from UserBasic a",UserBasic.class);
		List<UserBasic> list = tquery.getResultList();
		return list;
	}
	
	
	//REMOVING THE ENTITIES
	//Remove User Basic 
	public void deleteUserBasic(UserBasic userbasic)
	{
		entityManager.remove(userbasic);
	}
	//Remove User Advanced
	public void deleteUserAdvanced(UserAdvanced useradvanced)
	{
		entityManager.remove(useradvanced);
	}
	//Remove Application Form
	public void deleteApplication(LoanAppTable loanapptable)
	{
		entityManager.remove(loanapptable);
	}
	//remove approved part
	public void deleteApproved(Approved approved)
	{
		entityManager.remove(approved);
	}
	public void deleteAccount(Account account)
	{
		entityManager.remove(account);
	}
	
	
	//TRANSACTION FUNCTIONS
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
	}
}
