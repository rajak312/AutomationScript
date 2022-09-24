package com.nt.test;

import com.nt.recuired.General;

public class TC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General general=new General();
		
		//Open the Application And Entering the Url
		general.openApplication();
		
		//Login into the Application
		general.login();
		
		//Enter Into the Frame
		general.enterIntoIFrame();
		
		// Add Employee Information
		general.addEmployee();
		
		//exit from the home
		general.exitFromIFrame();

		//Logout from the Application
		general.logOut();
				
	   //Close the Application
	   general.closeAppliacation();
	}

}
