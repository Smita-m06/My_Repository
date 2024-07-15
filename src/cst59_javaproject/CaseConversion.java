package cst59_javaproject;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
		String fn=sc.nextLine();
		System.out.println("Enter Last name");
		String ln=sc.nextLine();
		
		String s=fn.substring(0,1).toUpperCase()+fn.substring(1);
		System.out.println("fn="+s);
		
		String s1=ln.substring(0, 1).toUpperCase()+ln.substring(1);
		System.out.println("ln="+s1);

	}

}
