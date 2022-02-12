import java.util.Scanner;

public class condition_If_else {

	public static void main(String[] args) {
		int pwd;
		System.out.print("Enter Password:");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		
		if (pwd==9763) 
		{
			System.out.println("  Name:Mahesh");
			System.out.println("  Contact:88087211890");
			System.out.println("  address:Pundliknagar");
			System.out.println("  food:Panipuri");

		}
		else {
			System.out.print("Sorry! you have enter wrong Password");

		}
	}

}
