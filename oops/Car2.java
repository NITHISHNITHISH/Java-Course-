package oops;

import java.util.Scanner;

public class Car2 {

	int gear;
	int speed;
	int maxGear;
	int maxSpeed;

	public Car2(int maxGear,int maxSpeed) {
		
		this.maxGear=maxGear;
		this.maxSpeed=maxSpeed;
	}
	
	public Car2(){
		
		System.out.println("Constructor invoked");
		maxGear =5;
		maxSpeed=100;
	}

	public void startCar() {
		gear = 1;
		speed = 10;
		System.out.println("Car Started");
	}

	public void changeGear() {
		gear++;
		if (gear <= maxGear) {
			System.out.println("Gear Changed ");
		} else {
			System.out.println("Already on Top Gear ");
		}
	}

	public void increaseSpeed(int speed) {
		this.speed += speed;
		if (this.speed <= maxSpeed)
			System.out.println("Currently your going  " + this.speed);
		else
			System.out.println("Already on Maximum Speed ");
	}

	public void applyBrake() {
		speed -= 10;
		System.out.println("Brake Applied ");
	}

	public void stopCar() {
		gear = 0;
		speed = 0;
		System.out.println("Car Stopped");
	}
	

}
