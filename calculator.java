package Date2272020;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String response="";
		do {
			System.out.println("Enter first number: ");
			int num1=sc.nextInt();
			
			System.out.println("Enter second number: ");
			int num2=sc.nextInt();
			
			System.out.println("Enter a operator(+,-,*,%): ");
			String op=sc.next();
			
			switch(op) {
			case "+": System.out.println("Sum of ("+num1+"+"+num2+") is "+(num1+num2));break;
			case "-": System.out.println("Subtract of ("+num1+"+"+num2+") is "+(num1-num2));break;
			case "*": System.out.println("Multiply of ("+num1+"+"+num2+") is "+(num1*num2));break;
			case "/": System.out.println("Divide of ("+num1+"+"+num2+") is "+(num1/num2));break;
			default: System.out.println("Your input is invalid!");
			}
			
			System.out.print("Continue? [y/n]: ");
	        response = sc.next();

    	}while(response != "n");          
		
	}

}
