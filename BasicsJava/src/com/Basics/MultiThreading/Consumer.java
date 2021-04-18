package com.Basics.MultiThreading;

public class Consumer implements Runnable {

Service service;
	
	
	
	public Consumer(Service service) {
		this.service = service;
	}



	public void run() {
		
		int i=0;
		while(i<10) {
		
			service.get();
			i++;
			
			
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				
			}
			
		}
	}
}
