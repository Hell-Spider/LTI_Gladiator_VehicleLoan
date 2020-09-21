package com.lti.ui;

import java.util.List;

import com.lti.model.Approved;
import com.lti.model.LoanAppTable;
import com.lti.model.UserAdvanced;
import com.lti.model.UserBasic;
import com.lti.service.VehicleServiceImpl;

public class Main2 
{
	public static void main(String[] args) 
	{
		VehicleServiceImpl service = new VehicleServiceImpl();
		
		//USER
		System.out.println("USER");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		List<UserBasic> userbasic = service.viewUserRegistrationInformation("jeetonwheels@gmail.com");
		System.out.println(userbasic);
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		List<UserAdvanced> useradvanced = service.viewUserDetailsInformation("jeetonwheels@gmail.com");
		System.out.println(useradvanced);
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		List<LoanAppTable> list1 = service.viewUserLoanApplication("jeetonwheels@gmail.com");
		for(LoanAppTable l:list1)
		{
			System.out.println(l);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		List<Approved> list2 = service.viewUserApprovedLoanApplication("jeetonwheels@gmail.com");
		for(Approved a:list2)
		{
			System.out.println(a);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		
		//ADMIN
		System.out.println("ADMIN");
		List<Object[]> list3 = service.viewAllRgeisteredUsers();
		for(Object[] i:list3)
		{
			System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		List<LoanAppTable> list4 = service.viewAllLoanApplication();
		for(LoanAppTable i:list4)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		service.modifyLoanApplicationStatus();

	}
}
