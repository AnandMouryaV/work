package com.Basics.MultiThreading;

public class InterthreadCommunication {

	public int count=0;

	public  void setCount() throws InterruptedException {

		while (true) {
			count++;
			Thread.sleep(1000);
			System.out.println("Set count: " + count);
		}
	}
	

	public  void getCount() throws InterruptedException {

		
		while(true) {
			Thread.sleep(200);
			System.out.println("get count: " + count);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		InterthreadCommunication i = new InterthreadCommunication();
		Thread t1 = new Thread(()->{
			try {
				i.setCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(()->{
			try {
				i.getCount();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();

	}

}
