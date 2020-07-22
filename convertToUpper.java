package Date2272020;

import java.util.Scanner;

public class convertToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower case string: ");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		String st ="";
		for (int i = 0; i < s.length(); i++) { 
			  
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                
            } 
            st+=ch[i];
            
   		}
		 System.out.println(st);
	}

}
