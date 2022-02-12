import java.util.Scanner;

public class condition_else_if {

	public static void main(String[] args) {
     int marks;
     System.out.print("Enter marks Obtained");
     Scanner obj=new Scanner(System.in);
     marks=obj.nextInt();
     if (marks>=60 && marks<=100) {
    	 
         System.out.print("Pass with Distinction");

	}
     else if (marks>=45 && marks<=60) {
         System.out.print("Pass with First Calss");

	}
     else if (marks>=33 && marks<=45) {
         System.out.print("Pass with Second Calss");

	}
     else {
         System.out.print("Sorry! You are failed");

	}
		
	}

}
