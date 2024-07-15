package cst59_javaproject;

import java.util.Random;
import java.util.Scanner;

public class UniqueFileNameGeneration {
	static String genFileName(int n){
		String fn="";
		String validChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int len=validChar.length();
		System.out.println(len);
		Random rmd= new Random();
		for(int i=1;i<n;i++)
		{
			int index=rmd.nextInt(len);
			fn = fn + validChar.charAt(index);
			
		}
		return fn+".txt";

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of chars for a fileName : ");
		n = sc.nextInt();
		String fn = genFileName(n);
		System.out.println("fn : " + fn);
		sc.close();
		
	}

}
