package Date2272020;

import java.util.Scanner;

public class commaDelimitedFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String s=sc.nextLine();
		
		String commaAddedString="";int count=0;
		for(int i=0; i<s.length(); i++) {
			if(count==2) {
				commaAddedString+=";"+s.charAt(i);
				count=1;
			}else {
				commaAddedString+=s.charAt(i);
				count++;
			}
		}
		System.out.println("New comma Delimited Format String:"+commaAddedString);
	}

}
