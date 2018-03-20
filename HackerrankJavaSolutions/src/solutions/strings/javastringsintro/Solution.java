package solutions.strings.javastringsintro;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
        String Anew = "";
        for(int i=0; i<A.length(); i++)
        {
        	if(i==0) Anew += Character.toUpperCase(A.charAt(i));
        	else Anew+= A.charAt(i);
        }
        
        String Bnew = "";
        for(int i=0; i<B.length(); i++)
        {
        	if(i==0) Bnew += Character.toUpperCase(B.charAt(i));
        	else Bnew+= B.charAt(i);
        }
        System.out.println(Anew+" "+Bnew);
        
        sc.close();
	}

}
