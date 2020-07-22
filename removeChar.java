package Date2272020;

import java.util.Scanner;

public class removeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("Enter remove position of character");
		int n=sc.nextInt();
		
		String st="";
		for(int i=0; i<s.length(); i++) {
			if(i==n) {
				char c=s.charAt(i);
			}else {
				st+=s.charAt(i);
			}
			
		}
		
		System.out.println("New String: "+st);
	}

}
