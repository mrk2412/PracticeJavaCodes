import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
     int num;
     System.out.print("Enter Any number");
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     
     while (num>=0)
      {
    	 if (num%2==0) {
    	     System.out.print("Even Number");
    	     break;
		}
    	 else {
    	     System.out.print("odd number");
             break;
		}
     }
   
	}

}
