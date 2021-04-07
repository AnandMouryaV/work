package com.Basics.CollectionAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class StudentDemo {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Student s1=new Student(127,"ravi",new Date("11/11/1992")); Student s2=new
		 * Student(124,"junkie",new Date("4/12/1992")); Student s3=new
		 * Student(125,"Jason",new Date("6/02/1992")); System.out.println(s3.getDob());
		 * 
		 * 
		 * ArrayList<Student> Students = new ArrayList<Student>(); Students.add(s1);
		 * Students.add(s2); Students.add(s3);
		 * 
		 * Collections.sort(Students,new Student());
		 * 
		 * System.out.println(Students);
		 * 
		 * writeObjectToStream(s1); readObjectFromStream();
		 */
		
	int x[] = {2,4,6,1,4,2,1,6,7};
	int y=3;
	
	System.out.println();
	
	for( int i=0;i<x.length;i++)
	{
		
		System.out.println(x[i]);
		
	
			int z[] = new int[y];
			
			if(i<y)
			z[i]=x[i];
		
	}
	
	}

	
	
	public static void writeObjectToStream(Student s) throws FileNotFoundException {
		
		try {
		FileOutputStream fileOutputSteam = new FileOutputStream("D:\\My Learnings\\write.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputSteam);
		objectOutputStream.writeObject(s);
		objectOutputStream.flush();
		objectOutputStream.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readObjectFromStream() throws FileNotFoundException {
		
		try {
			System.out.println("Reading object from stream");
	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\My Learnings\\write.txt"));
	Student s1 = (Student)objectInputStream.readObject();
		
	
	System.out.println(s1);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

class A{}

class B extends A{
	
}
class C extends B{
	
}

