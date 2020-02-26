package Student_addmission;

abstract public class Branches {
   static int CS=10;
   static int IT=4;
   static int MCA=10;
   static int CE=5;
   static int ME=10;
   static int EEE=0;
   static int ECE=0;

	
	public Branches() {
		System.out.println("\t\tCHOSSE YOUR COURSE");
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		System.out.println(" ------------------------------------------");
		System.out.println("| 01 | COMPUTER SCIENCE (CS)         -: "+CS+" |");
		System.out.println("|------------------------------------------|");
		System.out.println("| 02 | INFORMATION_TECHNOLOGY (IT)   -: "+IT+"  |");
		System.out.println("|------------------------------------------|");
	    System.out.println("| 03 | MASTER_IN_COMPUTER   (MCA)    -:"+MCA+"  |");
	    System.out.println("|------------------------------------------|");
	    System.out.println("| 04 | CIVIL_ENGINEERING    (CE)     -: "+CE+"  |");
	    System.out.println("|------------------------------------------|");
	    System.out.println("| 05 | MECHANICAL_ENGINEERING (ME)   -: "+ME+" |");
	    System.out.println(" ------------------------------------------- ");
	   System.out.println();
	   
	   }
	abstract void check();	
   
}
