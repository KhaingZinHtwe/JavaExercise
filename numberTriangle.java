package Date2272020;

import java.util.Scanner;

public class numberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number of line you want:");
		int n=s.nextInt();
		
		int num=1;
		for(int i=1; i<n+2; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(num++ +"\t");
			}
			System.out.println();
		}
	}

}
