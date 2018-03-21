package solutions.strings.javastringreverse;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        boolean bFlag = false;
        if(A.length() > 0)
        {
	        for(int i=0; i<A.length(); i++)
	        {
	        	for(int j=A.length()-1; j>=0; j--)
	        		if(A.charAt(i) == A.charAt(j)) bFlag = true;
	        		else bFlag = false;
	        }
	        
        }
        if(bFlag) System.out.println("Yes");
        else System.out.println("No");

        sc.close();

	}

}
