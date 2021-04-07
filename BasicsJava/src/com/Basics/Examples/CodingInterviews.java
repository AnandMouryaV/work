package com.Basics.Examples;

public class CodingInterviews {
	
	
	public void displayDuplicateElements() {
		
		int[] myArr= {1,2,2,4,1};
		
		System.out.println("the length of the array is :"+myArr.length);
		for(int i=0;i<myArr.length;i++) {
			
			for(int j=0;j<myArr.length;j++) {
				if(i!=j && myArr[i]==myArr[j]) {
					System.out.println("this is a dupliacate element :"+myArr[j]);
				}
			}
		}
	}
	
	
	public void displayProduct() {
		int[] myArr= {1,2,3,4,5,6};
		int[] newArr=new int[myArr.length];
		int product=1;
		
		for(int i=0;i<myArr.length-1;i++) {
			
			product=1;
			for(int j=0;j<myArr.length-1;j++) {
				if(i!=j) {
					System.out.println(myArr[j]);
					
					product=product*myArr[j];
				}
				
				
			}
			newArr[i]=product;
			System.out.println("the  product after math is::"+product);
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		CodingInterviews cd=new CodingInterviews();
		
		String name="Lalitha";
		String name1="Anand";
		name = name+" Sreem";
		 System.out.println(name.hashCode()); 
		  System.out.println(name1.hashCode());
		 
		
		switch (name) {
		
		case "Anand":
			System.out.println("Fullname is Anand Mourya::");
			break;
			
		case "Lalitha":
			System.out.println("Fullname is Lalitha Sreem::");
			break;
		case "Sindhu":
			System.out.println("Fullname is Vasavu SIndhura");
			break;
		
		}
	}

}
