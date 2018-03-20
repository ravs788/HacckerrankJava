package solutions.strings.javasubstring;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        if(S.length() >0 && start < end && end <= S.length() && start >= 0) System.out.println(S.substring(start, end));
        
        in.close();	
	}

}
