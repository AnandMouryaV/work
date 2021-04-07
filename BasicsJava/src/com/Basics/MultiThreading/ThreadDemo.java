package com.Basics.MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("this is a thread 1 hi");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		
		t2.start();
		
		System.out.println("this is a main thread :"+"BYE");
	}

}
