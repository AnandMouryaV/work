package com.Basics.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloProgram {

	private int a = 10;

	public void printHello() {
		System.out.println("Hello World");
		double a = 10;
		System.out.println("Hello World " + a);

		int D = 25;
		double Div = 3;
		double q = D / Div;

		System.out.println("the value of q is ::" + q);

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		System.out.println(number);

	}
	public static void DoPrint(Base o) {
		o.Print();
	}
	
	  
	  public static void main(String[] args) { 
		  
			Base x = new Base();
			Base y = new Derived();
			Derived z = new Derived();
			DoPrint(x);
			DoPrint(y);
			DoPrint(z);
	  
	  }
	 

	public void executableActions(String actionName) {
		System.out.println("code is here");

		switch (actionName) {

		case "createSubacription": {
			System.out.println("the create subscription logic and new subscriptions are created");
			break;
		}
		case "setProductStartDateEndDate": {
			System.out.println("the setProductStartDateEndDate logic and ProductStartDateEndDate are modified");
			break;
		}
		case "Override": {
			System.out.printf("the override Amount is caluculated");
			break;
		}

		default: {
			System.out.printf("no actions provided");
			break;
		}
		}

	}

}

class Base {
	public void Print() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void Print() {
		System.out.println("Derived");
	}
}

class Main {
	

	public static void main(String[] args) {

	}
}
