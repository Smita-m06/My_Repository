package cst59_javaproject;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter two word String");
		 
		 String s=sc.nextLine();
		 
		 System.out.println(s);
		
		  int i=s.length();
		  System.out.println(i);
		  for(int j=0;j<s.length();j++)
		  {
			  char f=s.charAt(0);
			  //System.out.println(f);
			  
			  if((int)(s.charAt(j))==32)
			  {
				  char l=s.charAt(j+1);
				  //System.out.println("last="+l);
				  if(f==l)
				  {
					  System.out.println("true");
				  }
				  else
				  {
					  System.out.println("false"); 
				  }
			  }
		  }

	}

}
