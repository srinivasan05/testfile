package io.full;

import java.util.Scanner;

public class Update_module extends Student_function {
	
	//Student_function student_function=new Student_function();
	Scanner input=new Scanner(System.in);
	
	void update_name() {
		
		System.out.println("Enter the I_D to update");
		String key=input.nextLine();
//		if(map.containsKey(key)) {
//			
//			System.out.println("Enter the Name:");
//			student_data.setName(input.nextLine());
		Student_data data2 = map.get(key);
//			student_data.setId(student_data.getId());
//			student_data.setDept(student_data.getDept());
//			student_data.setSub(student_data.getSub());
			System.out.println(data2.getId()+" "+data2.getName());
		
		
//		}else {
//			System.out.println("Sorry the I_D not present in the list...!");
//		}
		
	}
	
	void update_id() {
		
	}
	
	void update_department() {
		
	}
	
	void update_sub() {
		
	}
	

}
