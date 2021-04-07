package com.Basics.MultiThreading;

public class HelloThread implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		}
	}

}
