package Task1.com;

import java.util.Scanner;

public class javaTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Stundent ID:");
		int id=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String name=sc.next();
		
		System.out.println("Enter Stundent Marks:");
		int marks=sc.nextInt();
		
		System.out.println("Enter Fee Status:");
		boolean b=sc.nextBoolean();
		
		System.out.println();
		System.out.println("Details");
		System.out.println("===========================");
		System.out.println(id +" "+name);
		
		//Part 1:-student Result Pass/Fail
		if(marks>=40) {
			System.out.println("Student Passed");
		}else {
			System.out.println("Student Failed");
		}
		
		//Part 2:-Grade Assignment
		char g;
		if(marks>=85) {
			g='A';
			System.out.println("Grade:A");
		}else if(marks<=84 && marks>=70) {
			g='B';
			System.out.println("Grade:B");
		}else if(marks<=69 && marks>=50) {
			g='C';
			System.out.println("Grade:C");
		}else if(marks<=49 && marks>=0) {
			g='D';
			System.out.println("Grade:D");
		}else {
			g='E';
			System.out.println("Enter Valid Marks");
		}
		
		
		if(b==true) {
			System.out.println("Fees Paid");
		}else {
			System.out.println("Not Paid");
		}
		
		
		
		//Part 3:-Certificate Eligibility
		if(marks>=40 && b==true) {
			System.out.println("Eligible for Certificate");
		}else {
			System.out.println("Not Eligible for Certificate");
		}
		
		//Part 4:-Course Allocation
		switch(g) {
		case 'A':
			System.out.println("Data Science");
			break;
		case 'B':
			System.out.println("Java Full Stack");
			break;
		case 'C':
			System.out.println("Web Devolopment");
			break;
		case 'D':
			System.out.println("Basic Programming");
			break;
		default:
			System.out.println("Counseling");
				
		}

    }
}
