package com.Basics.CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;






public class ListInterfaceExamples {
	
 static Stack<String> stack=new Stack<String>();
	
	public static void main(String[] args) {
		
	 ArrayList<String> students=new ArrayList<String>();
	 
	 students.add("Ram");
	 students.add("rahim");
	 students.add("ravi");
	 
	 Iterator<String> s = students.iterator();
	 
	 while(s.hasNext()) {
			String k=s.next();
	if(k.equalsIgnoreCase("rahim")) {
		s.remove();
		
	}
		
	}
	 System.out.println(students.size());
}
}
