package com.lti.ui;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Account;
import com.lti.model.AdminDetails;
import com.lti.model.Approved;
import com.lti.model.LoanAppTable;
import com.lti.model.UserAdvanced;
import com.lti.model.UserBasic;
import com.lti.service.VehicleServiceImpl;


public class Main {

	public static void main(String[] args) 
	{
		VehicleServiceImpl service = new VehicleServiceImpl();
//		Scanner o = new Scanner(System.in);
//		
//		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
//		System.out.println("WELCOME TO VEHICLE LOAN MANAGEMENT SYSTEM");
//		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
//		System.out.println("1: Create a new Admin");
//		System.out.println("2: Create a new User");
//		System.out.print("Please enter a choice : ");
//		int i = o.nextInt();
//		if(i==1)
//		{
//			AdminDetails admin = new AdminDetails("Bunta@gmail.com","Bunta","bunta");
//			service.createAdmin(admin);
//		}
//		else
//		{
//			UserBasic userbasic1 = new UserBasic("jeetonwheels@gmail.com","Arijeet","Male","8584915408","arijeet",22);
//			service.createUser(userbasic1);
//		}
//		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
//		
//		System.out.print("Enter '1' For Filling Loan Application Form");
//		int j = o.nextInt();
//		if(j==1)
		
		
		
		//OBJECTS
		//administrator object
		AdminDetails admin = new AdminDetails("takumi@gmail.com","Takumi","takumi");
		//UserBasic object
		UserBasic userbasic1 = new UserBasic("jeetonwheels@gmail.com","Arijeet","Male","8584915408","arijeet",22);
		UserBasic userbasic2= new UserBasic("arpanonwheels@gmail.com","Arpan","Male","9113329584","arpan",22);
		//UserAdvanced object
    	UserAdvanced useradvanced1 = new UserAdvanced("Shanti Valley","Jharkhand","Jamshedpur","831017","Manager",1000,"aadhar","pan","addressproof","salaryslip");
    	UserAdvanced useradvanced2 = new UserAdvanced("Behala","West Bengal","Kolkata","731000","Trainer",3000,"aadhar","pan","addressproof","salaryslip");
    	//Loan Application Table
    	LoanAppTable loanapptable1 = new LoanAppTable("1111",100,4,15,1000,new Date(),"pending","Toyota","AE-86","white",4,1000,2000);
    	LoanAppTable loanapptable2 = new LoanAppTable("1112",500,4,15,1000,new Date(),"pending","Toyota","AE-86","white",4,1000,2000);
    	
    	//Approved object
    	Approved approved1 = new Approved(1000,new Date());
    	Approved approved2 = new Approved(2000,new Date());
    	//Account object
    	Account account1 = new Account();
    	Account account2 = new Account();
    	
    	// 1:
    	service.createAdmin(admin);
    	
    	//2:
    	service.createUser(userbasic1);
    	service.createUser(userbasic2);
    	service.createLoanApplicationForm(useradvanced1, loanapptable1, userbasic1);
    	service.createLoanApplicationForm(useradvanced2,loanapptable2, userbasic2);
    	
    	// 3:
    	service.createApprovedLoan(approved1, loanapptable1, account1, useradvanced1);
    	
    	//service.removeApproved(approved1);
    	//service.removeAccount(account1);
    	//service.removeApplication(loanapptable2);
    	//service.removeUserBasic(userbasic1);
    	
//    	System.out.println("----------------------------------------------------------------------------------");
//    	List<UserBasic> list = service.viewUser("jeetonwheels@gmail.com");
//    	for(UserBasic i:list)
//    	{
//    		System.out.println(i.getEmail());
//    		System.out.println(i.getName());
//    		System.out.println(i.getUserdetails().getSalary());
//    	}
//    	System.out.println("----------------------------------------------------------------------------------");
//    	List<LoanAppTable> l1 = service.viewLoanApplication();
//    	for(LoanAppTable i:l1)
//    	{
//    		System.out.println(i.getChassisNo()+" "+i.getStatus());
//    	}
//    	
	}

}
