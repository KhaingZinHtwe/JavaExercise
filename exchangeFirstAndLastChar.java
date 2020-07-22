package Date2272020;

import java.util.Scanner;

public class exchangeFirstAndLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String st=sc.nextLine();
		
		String s="";char first=st.charAt(0),last=st.charAt(st.length()-1);
		for(int i=1; i<st.length()-1; i++) {
			s+=st.charAt(i);
		}
		System.out.println("New String: "+last+s+first);
	}

}
