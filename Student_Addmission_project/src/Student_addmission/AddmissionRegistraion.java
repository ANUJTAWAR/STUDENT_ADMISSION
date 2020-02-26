package Student_addmission;

import java.util.Scanner;

public class AddmissionRegistraion extends Branches {
   
	StudentDetails sd=new StudentDetails();
	void StudentDetails()
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" ENTER NAME -:");
		String Student_Name=scan.nextLine();
		sd.setStudent_Name(Student_Name);
		
		System.out.println(" ENTER AGE -:");
		int Student_Age=scan.nextInt();
		sd.setStudent_Age(Student_Age);
		
		System.out.println(" ENTER GENDER -:");
		scan.nextLine();
		String Student_Gender=scan.nextLine();
		sd.setStudent_Gender(Student_Gender);
		
		System.out.println(" ENTER MOBILE_NO -:");
		long Student_mobile_no=scan.nextLong();
		sd.setStudent_mobile_no(Student_mobile_no);
		
		System.out.println(" ENTER ADDRESS -:");
		scan.nextLine();
		String Student_Address=scan.nextLine();
		sd.setStudent_Address(Student_Address);
		System.out.println("------------------------------------------------------------------------");
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
	    sd.setCourse_name(Course_name);

		 switch(Course_name)
			{
			case ("CS") :
				if(CS<0)
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
				if(IT<0)
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
				if(MCA<0)
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
				if(CE<0)
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
				if(ME<0)
					System.out.println("NO SEATS IS REMAINING");
				else
					System.out.println("------------------------------------------------------------------------");
					System.out.println("YOU ARE ALLOCATED FOR 'ME' SEAT NO -:"+ME);
					System.out.println("------------------------------------------------------------------------");
			        StudentDetails();
			        ME--;
					System.out.println("------------------------------------------------------------------------");
			        break;
			     
			     
			}	
		
	  } 
}
