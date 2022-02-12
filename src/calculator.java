import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
      int a,b,c,ch;
      System.out.print("Enter any two no.:");
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
 
      System.out.println("Enter choice");
      System.out.println("add 1");
      System.out.println("Sub 2");
      System.out.println("Mul 3");
      System.out.println("Div 4");

      
      ch=s.nextInt();
      
      switch (ch) {
	     case 1: c=a+b;
	      System.out.print("Addition  "+c);
	      break;
	     case 2: c=a-b;
	      System.out.print("Substraction  "+c);
	      break;
	     case 3: c=a*b;
	      System.out.print("Multiplication  "+c);
	      break;
	     case 4: c=a/b;
	      System.out.print("division  "+c);
	      break;
	default:System.out.print("Invalid Input");

		break;
	}
	}

}
