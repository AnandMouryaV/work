package com.Tutorials.SpringFrameWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical {

	private int wheels;
	private String brand;
	private String name;
	@Autowired private Tyre tyre;

	public void display() {
		System.out.println("This is a  car"+tyre.toString());
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", brand=" + brand + ", name=" + name + "]";
	}
	

}
