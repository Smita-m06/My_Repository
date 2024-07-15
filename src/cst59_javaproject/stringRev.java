package cst59_javaproject;

import java.util.Scanner;

public class stringRev {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any sring which you want to be reverse");
		String s=sc.nextLine();
		
		 reverse(s);

	}
	
	 static void reverse(String n)
	 {
		 String rev=" ";
		 int size=n.length();
		 for(int i=size-1; i>=0;i--)
		 {
			// System.out.println("Reversed String="+n.charAt(i));
			  rev=rev+n.charAt(i);
			 // System.out.println("Reversed String="+rev);
		 }
		 
		 System.out.println("Reversed String="+rev);
	 }

}
