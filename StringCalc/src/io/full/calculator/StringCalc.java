package io.full.calculator;

public class StringCalc {

	public static int add(String arg) {
		if(arg.isEmpty()) return 0;
		
		int sum=0;
		char a[]=arg.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			String s = String.valueOf(a[i]);
			if (s.hashCode() > 48 && s.hashCode() <= 57) {
				
				
				int j=Integer.parseInt(s);
				sum +=j;
				
			}
		}
		return sum;
	}
		
		
//		String s[] = arg.split("[.,!?:;+'\"-]+\\s*");
//		
//		
//		
//	
//		
//		
//		for(int i=0;i<s.length;i++) {
//			int j=Integer.parseInt(s[i]);
//			sum +=j;
//		}
//		
//		return sum;
		
		
	}
	
	
	
//}
