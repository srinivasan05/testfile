package io.full;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Student_function {
	Scanner input = new Scanner(System.in);
	Map<String, Student_data> map = new HashMap<String, Student_data>();

	void create() {

		Student_data student_data = new Student_data();

		System.out.println("Enter the I_d");
		String key = input.nextLine();
		student_data.setId(key);

		if (map.containsKey(key)) {
			System.out.println("You all ready registred...!");
		} else {
			System.out.println("Enter the name");
			student_data.setName(input.nextLine());
			System.out.println("Enter the Department");
			student_data.setDept(input.nextLine());
			System.out.println("Enter the fav Subject");
			student_data.setSub(input.nextLine());

			map.put(student_data.getId(), student_data);
		}

	}

	void delete() {

		System.out.println("Enter the I_d");
		String key = input.nextLine();
		if (map.isEmpty()) {
			System.out.println("Your list is empty...!");
		} else if (map.containsKey(key)) {
			map.remove(key);
			System.out.println("Your data has been removed sucessfully...!");

		} else {
			System.out.println("Given id is not in the list...!");
		}

	}

	void update() {
		try {
		if (!map.isEmpty()) {
			System.out.println("Enter the I_D to Update");
			if (map.containsKey(input.nextLine())) {
				Update_module update_module = new Update_module();
				System.out.println("1: Edit the I_d");
				System.out.println("2: Edit the Name");
				System.out.println("3: Edit the Department");
				System.out.println("4: Edit the Sub");
				System.out.println("5: Exit from update");
				while(true) {
				switch (input.nextInt()) {
				case 1:
					update_module.update_id();
					break;

				case 2:
					update_module.update_name();
					break;

				case 3:
					update_module.update_department();
					break;

				case 4:
					update_module.update_sub();
					break;
				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("Please choose your option from given list...!");

				}
				
				}

			} else {
				System.out.println("Sorry your data not present in the list...!");
			}

		} else {
			System.out.println("Your list is empty...!");
		}

	}catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println(e);
	}
		catch (Exception e) {
		// TODO: handle exception
		System.out.println("e");
	}
	}

	void viewall() throws IOException {
		if (map.isEmpty()) {
			System.out.println("Sorry your list is empty...!");
		} else {
			System.out.println("Registred Details...!");

			for (Map.Entry<String, Student_data> data : map.entrySet()) {
				Student_data data2 = data.getValue();
				System.out.println(data2.getId() + " " + data2.getName() + " " + data2.getDept() + " " + data2.getSub());
			}
		}

	}

	void viewsingle() {

		if (map.isEmpty()) {
			System.out.println("Sorry your list is empty...!");
		}
		System.out.println("Enter the I_D");
		String key = input.nextLine();
		if (map.containsKey(key)) {
			System.out.println("The person Details...!");
			Student_data data2 = map.get(key);
			System.out.println(data2.getId() + " " + data2.getName() + " " + data2.getDept() + " " + data2.getSub());

		} else {
			System.out.println("Sorry your id is not present in the list...!");
		}

	}
}
