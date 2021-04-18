package com.Basics.MultiThreading;

public class Producer implements Runnable {
	
	Service service;
	
	
	
	public Producer(Service service) {
		this.service = service;
	}



	public void run() {
		
		int i=0;
		
		
		while(i<10) {
		
			service.set(i++);
			
			
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			
		}
	}

}
}