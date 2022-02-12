
public class nested_if_else {

	public static void main(String[] args) {
       int num1=2000,num2=400,num3=80;
       if (num1>num2) {// 
		   if (num2>num3) {
			   System.out.print("Maximum Number is:"+num1);
			
		   }
		   else {
			   System.out.print("Maximum Number is:"+num3);

		   }
	   }
       else {
		   if (num2>num3) {
			   System.out.print("Maximum Number is:"+num1);
		   }
		   else {
			   System.out.print("Maximum Number is:"+num3);

		   }
	   }
	}

}
