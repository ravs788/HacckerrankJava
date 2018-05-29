package solutions.strings.javastringtokens;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();
        
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        String a1 = new String(aArr);
        String b1 = new String(bArr);
        if(a1.equals(b1)) return true;
        else return false;        
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
