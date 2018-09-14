package io.full;

import java.util.Scanner;

public class Update_module implements Studentt_interface {
	
	//Student_function student_function=new Student_function();
	Scanner input=new Scanner(System.in);
	
void update_name() {
		Student_data student_data=new Student_data();
		System.out.println("Enter the I_D to update");
		//input.nextLine();
		String key=input.nextLine();
	if(map.containsKey(key)) {
			
			System.out.println("Enter the Name:");
			student_data.setName(input.nextLine());
			
			Student_data data2 = map.get(key);
			student_data.setId(data2.getId());
			student_data.setDept(data2.getDept());
			student_data.setSub(data2.getSub());
			map.put(key,student_data);
			System.out.println("Updated sucessfully...!");
		
		
		}else {
			System.out.println("Sorry the I_D not present in the list...!");
		}
		
	}
	
	
	void update_department() {
		
	}
	
	void update_sub() {
		
	}
	

}
