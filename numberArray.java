package Date2272020;

import java.util.Arrays;
import java.util.Scanner;

public class numberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:");
		int n=sc.nextInt();
		
		int num[]=new int[n];int sum=0,avg=0;
		System.out.println("Enter numbers:");
		for(int i=0; i<n; i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		avg=sum/n;
		Arrays.sort(num);
		System.out.println("Average number:"+avg);
		System.out.println("Two minimun values:"+num[0]+", "+num[1]);
		System.out.println("Two maximun values:"+num[num.length-2]+", "+num[num.length-1]);
	}

}
