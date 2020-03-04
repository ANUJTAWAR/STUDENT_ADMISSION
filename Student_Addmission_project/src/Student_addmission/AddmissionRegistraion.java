package Student_addmission;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddmissionRegistraion extends Branches {
   
	StudentDetails sd=new StudentDetails();
	void StudentDetails()
	{
	   Scanner scan=new Scanner(System.in);
       boolean Check_Name=true;
       while(Check_Name) { 
     	  try{
	     	  System.out.println(" ENTER NAME -:");
	          String Student_Name=scan.nextLine();
	       if(Student_Name.length()>=4 && Student_Name.length()<=20) {
              sd.setStudent_Name(Student_Name);
		      Check_Name=false;
             }
        else{
        	StudentException se=new StudentException();
		    System.out.println(se.invalidNameException());
	        throw se;
	        }
		   }
     	  catch(StudentException se)
		     {
			    System.out.println("------------------------------------------------------------------------");
			    Check_Name=true;
		     }}
	 
	boolean Check_age=true;
	while(Check_age)
	  {
		 try{
			  System.out.println(" ENTER AGE -:");
		      int Student_Age=scan.nextInt();
		      sd.setStudent_Age(Student_Age);
		      scan.nextLine();
		      Check_age=false; 
		    }
		catch(Exception e) {
			scan.nextLine();
			System.out.println("INVALID AGE TYPE");
			Check_age=true;
		 }
	   }
	boolean Check_Gender=true;
	 while(Check_Gender)
		{
		    try{
		    		System.out.println(" ENTER GENDER -:");
		    		String Student_Gender=scan.nextLine();
		    		Student_Gender= Student_Gender.toUpperCase();
		    	if(Student_Gender.equals("MALE") || Student_Gender.equals("FEMALE") || Student_Gender.equals("OTHERS")) {
		    		sd.setStudent_Gender(Student_Gender);
		    		Check_Gender=false;
		    		}
		    	else {
		    		StudentException se=new StudentException();
		    		System.out.println(se.invalidGenderException());
		    		throw se;
		    		}
		        }
		    catch(StudentException se) {
		    	System.out.println("------------------------------------------------------------------------");
		    	Check_Gender=true;
		    }
	    }
	boolean Check_Mobile=true;
	while(Check_Mobile) 
	  {
  		 try{ 
  			 System.out.println(" ENTER MOBILE_NO -:");
		     long Student_mobile_no=scan.nextLong();
		     if(Student_mobile_no>6000000000l && Student_mobile_no<10000000000l) {
		        sd.setStudent_mobile_no(Student_mobile_no);
		        Check_Mobile=false;}
		     else {
		    	 StudentException se=new StudentException();
			     System.out.println(se.invalidMobileNoException());
			     throw se;
		    }}
		 catch(StudentException se)
		 {
			System.out.println("------------------------------------------------------------------------");
			Check_Mobile=true;
		 }
  		 catch(InputMismatchException ime) {
  			 scan.nextLine();
                 System.out.println("wrong type MOBILE_NO");
                 Check_Mobile=true;
  		   }
      }
		
	boolean Check_Address=true;
	while(Check_Address)
		{
		 try{
			 System.out.println(" ENTER ADDRESS -:");
			scan.nextLine();
			 String Student_Address=scan.nextLine();
			 if(Student_Address.length()>=10 && Student_Address.length()<=50) {
        			 sd.setStudent_Address(Student_Address);
        			 Check_Address=false;}
			 else {
				   StudentException se=new StudentException();
		    	   System.out.println(se.invalidAddressException());
		    	   throw se;
			     }
		    }
			 catch(StudentException se){
			        System.out.println("------------------------------------------------------------------------");
			        Check_Address=true;
			 }
	   }
	}
	 
	void showDetails()
	  {
		sd.showDetails();
	  }
	void check()
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE COURSE NAME -:");
		String Course_name=scan.nextLine();
		Course_name = Course_name.toUpperCase();
	    sd.setCourse_name(Course_name);

		 switch(Course_name)
			{
			case ("CS") :
				if(CS<=0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'CS' SEAT NO -:"+CS);
					System.out.println("------------------------------------------------------------------------");
			         System.out.println();
			        StudentDetails();
			        CS--;
			        System.out.println("------------------------------------------------------------------------");
			        break;
			case("IT"):
				if(IT<=0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'IT' SEAT NO -:"+IT);
					System.out.println("------------------------------------------------------------------------");
			         StudentDetails();
			         IT--;
			         System.out.println("------------------------------------------------------------------------");
			        break;
			case("MCA"):
				if(MCA<=0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'MCA' SEAT NO -:"+MCA);
					System.out.println("------------------------------------------------------------------------");
			        StudentDetails();
			        MCA--;
			        System.out.println("------------------------------------------------------------------------");
			        break;
			case("CE"):
				if(CE<=0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'CE' SEAT NO -:"+CE);
					System.out.println("------------------------------------------------------------------------");
			        StudentDetails();
			        CE--;
			        System.out.println("------------------------------------------------------------------------");
			        break;
			case("ME"):
				if(ME<=0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'ME' SEAT NO -:"+ME);
					System.out.println("------------------------------------------------------------------------");
			        StudentDetails();
			        ME--;
					System.out.println("------------------------------------------------------------------------");
			        break;
			    default :
			    	System.out.println("INVALID COURSE NAME CHOOSE CORRECT ONE");
			        check();
			}	
		
	  } 
}
