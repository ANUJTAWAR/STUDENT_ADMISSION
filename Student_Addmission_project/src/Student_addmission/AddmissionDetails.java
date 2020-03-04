package Student_addmission;

import java.util.Scanner;

public class AddmissionDetails {

	public static void main(String[] args) {
		
		for(int i=1;i<=1;i++)
		{
		Scanner scan=new Scanner(System.in);	
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\t\t\tWELCOME TO INSTITUTE");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("01 - ADDMISSION_REGISTRATION");
		System.out.println("02 - STUDENT_DETAILS");
		System.out.println("03 - EXIT");
		int n=scan.nextInt();
		if(n==1)
		{
			AddmissionRegistraion ar=new AddmissionRegistraion();
			ar.check();
			ar.showDetails();
			System.out.println("press -: 1  FOR BACK TO HOME");
			System.out.println("press -: 2  FOR EXIT");
			int a=scan.nextInt();
			if(n==1)
			{
			   System.out.println("------------------------------------------------------------------------");
			   System.out.println("YOUR ADDMISSION IS SUCCSESSFUL '-- CONGRATULATION'S --' ");
			   System.out.println("------------------------------------------------------------------------");	
			   i=0;
			}
			else
				System.exit(0);
		  
		}
		else if(n==2)
		{
			StudentDetails sd=new StudentDetails();
			sd.showDetails();
		}
		else
		{
			System.exit(0);
		}
		
		}
	}

}
