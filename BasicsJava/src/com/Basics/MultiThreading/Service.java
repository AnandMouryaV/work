package com.Basics.MultiThreading;

public class Service {
	
	private int i;
	boolean valueSet= false;
	
	
	public synchronized void get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		}
		System.out.println("consumer get : "+this.i);
		valueSet=false;
		notify();
		
		
	}
	
	public synchronized void set(int i) {
		
		while(valueSet) {
			try {
			wait();
			}
			catch (Exception e) {
			
			}
		}
		this.i=i;
		System.out.println("Producer put : "+i);
		valueSet =true;
		notify();
		
		
	}

}
