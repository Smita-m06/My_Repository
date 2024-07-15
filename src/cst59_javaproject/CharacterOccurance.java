package cst59_javaproject;

import java.util.Scanner;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s= sc.nextLine();
		  
		  for(int i=0;i<s.length()-1;i++)
		  {int count=1;
			  
			  char a=s.charAt(i);
			  for(int j=i;j<s.length()-1;j++)
			  {
			  if(a==s.charAt(j+1))
			  {
				  count++;
			  }
			  }
			  System.out.println(a+" occures "+count+" times"); 
		  }
		  
		  

	}

}
