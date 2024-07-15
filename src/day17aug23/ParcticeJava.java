package day17aug23;

import java.util.Scanner;

public class ParcticeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] a= {1,2,4,3,5,6,7,8,10,18};
		 //int i=0;
		
		for(int i=0; i<a.length; i++)
		{
			 if(a[i]%2==0)
			 {
			   System.out.println(a[i]);
			   break;
			 }
			 else
			 {
				 System.out.println(a[i]+"  is not multiple of 2"); 
			 }
		}*/
		
	/*	int[] numbers=new int[5];
		numbers[0]=2;
		numbers[1]=4;
		numbers[2]=8;
		numbers[3]=9;
		numbers[4]=5;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length-1]);
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("Reverse Order");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println(numbers[i]);
		}

		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Smita");
		a.add("Ayush");
		System.out.println(a.get(0));
		
		
		for(String val:a)
		{
			System.out.println(val);
			
			
			
		}
		
		System.out.println(a.contains("Ayush"));
		
		System.out.println(a.contains("Printing String in Reverse Order"));
		
		String x="Ayush Morbale";
		for(int i=x.length()-1; i>0;i--)
		{
			System.out.println(x.charAt(i));
		}*/
		
		//Fibonacci Series
		System.out.println("Enter the number of elements in the fibonacci Series");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int num1=1;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		
		while(n>0)
		{	
		
		    int num3=num1+num2;
		    System.out.println(num3);
		    num1=num2;
		    num2=num3;
		    n--;
		}
	}

}
