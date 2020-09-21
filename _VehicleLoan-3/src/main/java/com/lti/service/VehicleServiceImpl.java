package com.lti.service;

import java.util.List;

import com.lti.dao.VehicleDaoImpl;
import com.lti.model.Account;
import com.lti.model.AdminDetails;
import com.lti.model.Approved;
import com.lti.model.LoanAppTable;
import com.lti.model.UserAdvanced;
import com.lti.model.UserBasic;

public class VehicleServiceImpl 
{
	VehicleDaoImpl dao = new VehicleDaoImpl();
	
	//ADMINSTRATOR REGISTRATION
	//To create a administrator
	public void createAdmin(AdminDetails admin)
	{
		dao.beginTransaction();
		dao.adminRegistration(admin);
		dao.commitTransaction();
	}
	
	//USER REGISTRATION
	//To Register a user
	public void createUser(UserBasic userbasic)
	{
		dao.beginTransaction();
		dao.userRegistration(userbasic);
		dao.commitTransaction();
	}
	
	//LOAN APPLICATION FORM
	//To create the Loan Application Form 
	public void createLoanApplicationForm(UserAdvanced useradvanced,LoanAppTable loanapptable,UserBasic userbasic)
	{
		loanApplicationFormFillup(useradvanced, loanapptable, userbasic);
		dao.beginTransaction();
		dao.loanRegistration(loanapptable);
		dao.commitTransaction();
		
	}
	//Loan Application Form Fill up
	public void loanApplicationFormFillup(UserAdvanced useradvanced,LoanAppTable loanapptable,UserBasic userbasic)
	{
		userbasic.setUserdetails(useradvanced);
		loanapptable.setUser(useradvanced);
	}
	
	//APPROVED LOAN
	//To create the approved Loan Form and the account for the user
	public void createApprovedLoan(Approved approved,LoanAppTable loanapptable,Account account,UserAdvanced useradvanced)
	{
		setApproveLoan(approved, loanapptable, account, useradvanced);
		dao.beginTransaction();
		dao.approveLoan(approved);
		dao.commitTransaction();
	}
	//Approve Loan Application Form
	public void setApproveLoan(Approved approved,LoanAppTable loanapptable,Account account,UserAdvanced useradvanced)
	{
		approved.setLoanapp(loanapptable);
		account.setUser(useradvanced);
		approved.setAccount(account);
	}
	
	
	//Remove User Basic 
	public void removeUserBasic(UserBasic userbasic)
	{
		dao.beginTransaction();
		dao.deleteUserBasic(userbasic);
		dao.commitTransaction();
	}
	//Remove User Advanced
	public void removeUserAdvanced(UserAdvanced useradvanced)
	{
		dao.beginTransaction();
		dao.deleteUserAdvanced(useradvanced);
		dao.commitTransaction();
	}
	//Remove Application Form
	public void removeApplication(LoanAppTable loanapptable)
	{
		dao.beginTransaction();
		dao.deleteApplication(loanapptable);
		dao.commitTransaction();
	}
	//remove approved part
	public void removeApproved(Approved approved)
	{
		dao.beginTransaction();
		dao.deleteApproved(approved);
		dao.commitTransaction();
	}
	//remove Account part
	public void removeAccount(Account account)
	{
		dao.beginTransaction();
		dao.deleteAccount(account);
		dao.commitTransaction();
	}
	
	
	//USER SERVICES
	public List<UserBasic> viewUserRegistrationInformation(String email)
	{
		return dao.showUserRegistrationInformation(email);
	}
	public List<UserAdvanced> viewUserDetailsInformation(String email)
	{
		return dao.showUserDetailsInformation(email);
	}
	public List<LoanAppTable> viewUserLoanApplication(String email)
	{
		return dao.showUserLoanApplication(email);
	}
	public List<Approved> viewUserApprovedLoanApplication(String email)
	{
		return dao.showUserApprovedLoanApplication(email);
	}
	
	//ADMIN SERVICES
	public List<Object[]> viewAllRgeisteredUsers()
	{
		return dao.showAllRegisteredUser();
	}
	public List<LoanAppTable> viewAllLoanApplication()
	{
		return dao.showAllLoanApplication();
	}
	public List<Approved> viewAllApprovedLoans()
	{
		return dao.showAllApprovedLoans();
	}
}
