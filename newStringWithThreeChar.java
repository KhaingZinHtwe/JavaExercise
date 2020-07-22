package Date2272020;

import java.util.Scanner;

public class newStringWithThreeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		
		String firstThreeChar="";int i=0;
		if(s.length()<3) {
			for(i=0; i<s.length(); i++) {
				firstThreeChar+=s.charAt(i);
			}
			System.out.println("New String: "+firstThreeChar+s+firstThreeChar);
		}else {
			for(i=0; i<3; i++) {
				firstThreeChar+=s.charAt(i);
			}
			System.out.println("New String"+firstThreeChar+s+firstThreeChar);
		}
	}

}
