package com.Basics.MultiThreading;

public class MultiTHreadingExampleDemo implements Runnable{

	@Override
	public void run() {
		
		for ( int i=0;i<10;i++) {
		System.out.println("this is a thread 1 hi");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
