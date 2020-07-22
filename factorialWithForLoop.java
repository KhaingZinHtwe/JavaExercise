package Date2272020;

import java.util.Scanner;

public class factorialWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number for factorial:");
		int fact=s.nextInt();
		
		int result=1;
		if(fact==0) {
			result=1;
		}else {
			for(int i=1; i<=fact; i++) {
				result*=i;
			}
		}
		
		System.out.println("Factorial of "+fact+": "+result);
	}

}
