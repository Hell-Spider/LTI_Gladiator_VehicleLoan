package com.lti.ui;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.lang.SuppressWarnings;
import com.lti.model.Account;
import com.lti.model.AdminDetails;
import com.lti.model.Approved;
import com.lti.model.LoanAppTable;
import com.lti.model.UserAdvanced;
import com.lti.model.UserBasic;
import com.lti.service.MailServiceImpl;
import com.lti.service.OTPServiceImpl;
import com.lti.service.VehicleServiceImpl;

public class Main3 {
	public static void main(String[] args) {
		VehicleServiceImpl service = new VehicleServiceImpl();
		Scanner o = new Scanner(System.in).useDelimiter("\n");
		Scanner p = new Scanner(System.in);

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("WELCOME TO VEHICLE LOAN MANAGEMENT SYSTEM");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");

		// REGISTERING A NEW ADMIN / USER FUNCTIONALITY
//		System.out.println("REGISTER IMPLEMENTATION");
//		System.out.println("1: Create a new Admin");
//		System.out.println("2: Create a new User");
//		System.out.print("Please Enter Your choice : ");
//		int i = p.nextInt();
//		if(i==1)
//		{
//			AdminDetails admin = new AdminDetails();
//			System.out.print("Enter the Email Id of the ADMIN : ");
//			admin.setEmail(o.next());
//			
//			int ras = 0;
//			List<AdminDetails> list = service.viewAllAdmin();
//			for(AdminDetails admins:list)
//			{
//				if(admins.getEmail().contentEquals(admin.getEmail()))
//				{
//					ras=1;
//					break;
//				}
//			}
//			if(ras==1)
//			{
//				System.out.println("You Are Already Registered With Us!");
//			}
//			else
//			{
//				System.out.print("Enter the Name of the ADMIN : ");
//				admin.setName(o.next());
//				System.out.print("Enter the Password for the ADMIN : ");
//				admin.setPassword(o.next());
//				service.createAdmin(admin);
//				System.out.println("Successfully Registered !");
//			}
//		}
//		else if(i==2)
//		{
//			UserBasic userbasic1 = new UserBasic();
//			System.out.print("Enter your Email Id : ");
//			userbasic1.setEmail(o.next());
//			
//			int rus = 0;
//			List<UserBasic> list = service.viewAllUser();
//			for(UserBasic user:list)
//			{
//				if(user.getEmail().contentEquals(userbasic1.getEmail()))
//				{
//					rus = 1;
//					break;
//				}
//			}
//			if(rus==1)
//			{
//				System.out.println("This Email ID is Already Registered With Us !");
//			}
//			else
//			{
//				System.out.print("Enter your Name : ");
//				userbasic1.setName(o.next());
//				System.out.print("Enter your Gender : ");
//				userbasic1.setGender(o.next());
//				System.out.print("Enter your Phone Number : ");
//				userbasic1.setMobile(o.next());
//				System.out.print("Enter your Password : ");
//				userbasic1.setPassword(o.next());
//				System.out.print("Enter your Age : ");
//				userbasic1.setAge(p.nextInt());
//				
//				service.createUser(userbasic1);
//				MailServiceImpl mail = new MailServiceImpl();
//				mail.send(userbasic1.getEmail(),"REGISTRATION SUCCESSFULL","<b>CONGRATULATIONS !</b> You have Successfully Registered with Wheels4Hope<br><p>Hope We will serve you better</p>");
//				System.out.println("Successfully Registered !");
//			}
//			
//			
//		}
//		System.out.println("----------------------------------------------------------------------------------------------------------------------------");

		
		
		
		// FORGOT PASSWORD IMPLEMENTATION
//		System.out.println("FORGOT PASSWORD IMPLEMENTATION");
//		System.out.print("Enter Your Email ID : ");
//		String a = o.next();
//		OTPServiceImpl otp = new OTPServiceImpl();
//		MailServiceImpl mail = new MailServiceImpl();
//		String cotp = otp.generateOTP();
//		mail.send(a, "OTP For Password Regeneration", "<p>Your <b>One Time Password</b> is : "+cotp+"</p>");
//		
//		System.out.print("Enter the OTP which you received in your Email ID : ");
//		int b = p.nextInt();
//		String bc = String.valueOf(b);
//		if(cotp.contains(bc))
//		{
//			UserBasic u = service.viewUserRegistrationInformation(a);
//			System.out.print("Enter the New Password : ");
//			String n = o.next();
//			u.setPassword(n);
//			service.modifyPassword(u);
//		}
//		else
//		{
//			System.out.println("Wrong OTP entered! Please Enter the Correct OTP");
//		}

		
		
		// LOGIN FUNCTIONALITY FOR ADMIN / USER
//		System.out.println("LOGIN IMPLEMENTATION");
//		System.out.println("1: Enter Admin Login Details");
//		System.out.println("2: Enter User Login Details");
//		System.out.print("Enter your Choice : ");
//		int j = p.nextInt();
//		
//		if(j==1)
//		{
//			System.out.print("Enter your Email Id : ");
//			String enteredAdminName = o.next();
//			System.out.print("Enter your Password : ");
//			String enteredAdminPassword = o.next();
//			
//			int las = 0;
//			List<AdminDetails> list = service.viewAllAdmin();
//			for(AdminDetails admins:list)
//			{
//				if(admins.getEmail().contentEquals(enteredAdminName) && admins.getPassword().contentEquals(enteredAdminPassword))
//				{
//					las = 1;
//					System.out.println("Successfully Logged In !");
//					break;
//				}
//			}
//			if(las==0)
//			{
//				System.out.println("You have Entered Wrong Credentials !");
//			}
//		}
//		
//		else if(j==2)
//		{
//			System.out.print("Enter your Email Id : ");
//			String enteredUserName = o.next();
//			System.out.print("Enter your password : ");
//			String enteredUserPassword = o.next();
//			
//			int lus = 0;
//			List<UserBasic> list = service.viewAllUser();
//			for(UserBasic user:list)
//			{
//				if(user.getEmail().contentEquals(enteredUserName) && user.getPassword().contentEquals(enteredUserPassword))
//				{
//					lus = 1;
//					System.out.println("Successfully Logged In !");
//					break;
//				}
//			}
//			if(lus==0)
//			{
//				System.out.println("You have Entered Wrong Credentials !");
//			}
//		}

		
		
		// USER DETAILS AND LOAN DETAILS
//		System.out.print("Enter Your Email Id : ");
//		String a = o.next();
//		UserBasic u = service.viewUserRegistrationInformation(a);
//		System.out.println("Enter Your Details");
//		if(u.getUserdetails() != null)
//		{
//			UserAdvanced ua = service.viewUserDetailsInformation(a);
//			System.out.println("LOAN DETAILS");
//			LoanAppTable l = new LoanAppTable();
//			System.out.print("Enter the Chassis Number : ");
//			l.setChassisNo(o.next());
//			System.out.print("Enter Your Existing EMI : ");
//			l.setExistingEMI(p.nextDouble());
//			System.out.print("Enter Loan Tenure : ");
//			l.setTenure(p.nextInt());
//			System.out.print("Enter Loan Interest : ");
//			l.setInterest(p.nextInt());
//			System.out.print("Enter Loan Amount : ");
//			l.setAmount(p.nextDouble());
//			System.out.print("Enter Vehicle Brand : ");
//			l.setBrand(o.next());
//			System.out.print("Enter Vehicle Model : ");
//			l.setModel(o.next());
//			System.out.print("Enter Vehicle Colour : ");
//			l.setColour(o.next());
//			System.out.print("Enter Vehicle Type : ");
//			l.setType(p.nextInt());
//			System.out.print("Enter Vehicle Ex ShowRoom Price : ");
//			l.setExShowPrice(p.nextDouble());
//			System.out.print("Enter Vehicle On Road Price : ");
//			l.setOnRoadPrice(p.nextDouble());
//			
//			l.setStatus("pending");
//			l.setAppdate(new Date());
//			
//			service.createLoanApplicationForm(ua, l, u);
//			System.out.println("Loan Details Added");
//		}
//		else
//		{
//			System.out.println("USER DETAILS");
//			UserAdvanced ua = new UserAdvanced();
//			System.out.print("User Address : ");
//			ua.setAddress(o.next());
//			System.out.print("User State : ");
//			ua.setState(o.next());
//			System.out.print("User City : ");
//			ua.setCity(o.next());
//			System.out.print("User Pin Code : ");
//			ua.setPin(o.next());
//			System.out.print("User Employement Type : ");
//			ua.setEmptype(o.next());
//			System.out.print("User Salary : ");
//			ua.setSalary(p.nextDouble());
//			System.out.print("User Aadhar URL : ");
//			ua.setAadhar(o.next());
//			System.out.print("User Pan URL : ");
//			ua.setPan(o.next());
//			System.out.print("User Salary Slip URL : ");
//			ua.setSalarySlip(o.next());
//			System.out.print("User Address Proof URL : ");
//			ua.setAddressProof(o.next());
//			
//			System.out.println("LOAN DETAILS");
//			LoanAppTable l = new LoanAppTable();
//			System.out.print("Enter the Chassis Number : ");
//			l.setChassisNo(o.next());
//			System.out.print("Enter Your Existing EMI : ");
//			l.setExistingEMI(p.nextDouble());
//			System.out.print("Enter Loan Tenure : ");
//			l.setTenure(p.nextInt());
//			System.out.print("Enter Loan Interest : ");
//			l.setInterest(p.nextInt());
//			System.out.print("Enter Loan Amount : ");
//			l.setAmount(p.nextDouble());
//			System.out.print("Enter Vehicle Brand : ");
//			l.setBrand(o.next());
//			System.out.print("Enter Vehicle Model : ");
//			l.setModel(o.next());
//			System.out.print("Enter Vehicle Colour : ");
//			l.setColour(o.next());
//			System.out.print("Enter Vehicle Type : ");
//			l.setType(p.nextInt());
//			System.out.print("Enter Vehicle Ex ShowRoom Price : ");
//			l.setExShowPrice(p.nextDouble());
//			System.out.print("Enter Vehicle On Road Price : ");
//			l.setOnRoadPrice(p.nextDouble());
//			
//			l.setStatus("pending");
//			l.setAppdate(new Date());
//			
//			service.createLoanApplicationForm(ua, l, u);
//			System.out.println("User and Loan Details Added");
//		}

		
		
		// DASHBOARD FUNCTIONALITY
		// ADMIN
//		System.out.println("ADMIN");
//		System.out.println("1: View All the Registered User");
//		System.out.println("2: View All the Loan Application Form Along with the User Details");
//		System.out.println("3: View All the Approved Loans");
//		System.out.print("Please Enter your Choice : ");
//		int k = p.nextInt();
//		
//		if(k==1)
//		{
//			List<Object[]> list3 = service.viewAllRgeisteredUsers();
//			for(Object[] i:list3)
//			{
//				System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]);
//			}
//		}
//		else if(k==2)
//		{
//			List<LoanAppTable> list4 = service.viewAllLoanApplication();
//			for(LoanAppTable i:list4)
//			{
//				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
//				System.out.println("User ID : "+i.getUser().getUserId());
//				System.out.println(i.getUser());
//				System.out.println(i);
//			}
//			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
//
//		}
//		else if(k==3)
//		{
//			List<Approved> list = service.viewAllApprovedLoans();
//			for(Approved i :list)
//			{
//				System.out.println(i);
//			}
//		}

		
		
		// DASHBORAD FUNCTIONALITY
		// USER
//		System.out.println("USER");
//		System.out.print("Enter Your Email Id : ");
//		String enteredUserEmail = o.next();
//		System.out.println("1 : To View Your Registration Information");
//		System.out.println("2 : To view Your Details");
//		System.out.println("3 : To view Your Loan Application");
//		System.out.println("4 : TO View your Approved Loan");
//		System.out.print("Please enter your choice : ");
//		int i = p.nextInt();
//		
//		if(i==1)
//		{
//			UserBasic userbasic = service.viewUserRegistrationInformation(enteredUserEmail);
//			System.out.println(userbasic);
//		}
//		else if(i==2)
//		{
//			UserAdvanced useradvanced = service.viewUserDetailsInformation(enteredUserEmail);
//			System.out.println(useradvanced);
//		}
//		else if(i==3)
//		{
//			List<LoanAppTable> list1 = service.viewUserLoanApplication(enteredUserEmail);
//			for(LoanAppTable l:list1)
//			{
//				System.out.println(l);
//			}
//		}
//		else if(i==4)
//		{
//			List<Approved> list2 = service.viewUserApprovedLoanApplication(enteredUserEmail);
//			for(Approved a:list2)
//			{
//				System.out.println(a);
//			}
//		}

		
		
		
		// ADMIN MODIFYING THE LOAN APPLICATION STATUS
//		System.out.println("Application Loans List");
//		List<LoanAppTable> list = service.viewAllLoanApplication();
//		List<Account> accounts = service.viewAllAccount();
//		int f = 0;
//		for (LoanAppTable i : list) {
//			System.out.println(
//					"------------------------------------------------------------------------------------------------------------------------------------");
//			System.out.println("User ID : " + i.getUser().getUserId());
//			System.out.println(i.getUser());
//			System.out.println(i);
//		}
//		System.out.println(
//				"------------------------------------------------------------------------------------------------------------------------------------");
//		System.out.print("Enter The Chassis Number : ");
//		String c = o.next();
//		for (LoanAppTable j : list) {
//			if (j.getChassisNo().contentEquals(c)) {
//				if (j.getStatus().contentEquals("pending")) {
//					System.out.print("Enter 1: for Approval and 2: for Rejection : ");
//					int k = p.nextInt();
//					if (k == 1) {
//						j.setStatus("approved");
//						Account a = new Account();
//						for (Account t : accounts) {
//							if (t.getUser().getUserId() == j.getUser().getUserId()) {
//								f = 1;
//								a = t;
//								break;
//							}
//						}
//
//						if (f == 1) {
//							service.modifyLoanApplicationLoan1(j);
//							Approved approved = new Approved(j.getAmount() * 1.5, new Date());
//							service.createApprovedLoan(approved, j, a, j.getUser());
//							System.out.println("Loan Approved");
//						} else {
//							service.modifyLoanApplicationLoan1(j);
//							Approved approved = new Approved(j.getAmount() * 1.5, new Date());
//							Account account = new Account();
//							service.createApprovedLoan(approved, j, account, j.getUser());
//							System.out.println("Loan Approved");
//						}
//					} else if (k == 2) {
//						j.setStatus("rejected");
//						System.out.println("Loan Rejected");
//					}
//				}
//			}
//		}

		o.close();
		p.close();
	}
}
