package solutions.introduction.javaloops2;

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        while(sc.hasNext())
        {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int n = sc.nextInt();
        	int sum = a;
        	for(int i=0; i<n; i++)
        	{
        		sum += (int)((Math.pow(2, i))*b);
        		System.out.print(sum+" ");        		
        	}
        	System.out.println();
        }
        sc.close();
    }
}
