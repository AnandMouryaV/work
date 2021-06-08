package com.Basics.MultiThreading;

public class Demo {
	
	public static void main(String[] args) {
	Service service = new Service();
	
	
	Thread t1 = new Thread(new Producer(service));
	Thread t2 = new Thread(new Consumer(service));
	ExampleClass ex = new ExampleClass();
	
	ex.start();
	t1.start();
	t2.start();
	}

}
