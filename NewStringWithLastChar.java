package Date2272020;

import java.util.Scanner;

public class NewStringWithLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String s=sc.nextLine();
		char last_char=s.charAt(s.length()-1);
		
		System.out.println(last_char+s+last_char);
	}

}
