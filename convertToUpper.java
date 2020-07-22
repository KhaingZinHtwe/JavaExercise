package Date2272020;

import java.util.Scanner;

public class convertToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower case string: ");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) { 
			  
            // If first character of a word is found 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                // If it is in lower-case 
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
            
   		}
		String st = new String(ch);
		 System.out.println(st);
	}

}
