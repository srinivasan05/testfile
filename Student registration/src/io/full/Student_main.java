package io.full;

import java.io.IOException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student_main ob= new Student_main();
ob.test();
	}	
	
	 void test() {
		
		Scanner input = new Scanner(System.in);
		Student_function student_function = new Student_function();
		while (true) {
			System.out.println("Choose the option from listed below");

			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:View");
			System.out.println("4:View an person register");
			System.out.println("5:Update");
			System.out.println("6:Exit");

			switch (input.nextInt()) {

			case 1:
				student_function.create();
				break;

			case 2:
				student_function.delete();
				break;

			case 3:
				try {
					student_function.viewall();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case 4:
				student_function.viewsingle();
				break;
				
			case 5:
				student_function.update();
				break;

			case 6:
				System.out.println("Your application has been terminated...!");
				System.exit(0);
				break;

			}

		}
		
	}

}
