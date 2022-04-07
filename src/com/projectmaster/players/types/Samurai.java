package com.projectmaster.players.types;
import com.projectmaster.players.Human;

public class Samurai extends Human{
	
	private static int numberOfSamurai = 0;
	
	public Samurai() {
		this.health =200;
		numberOfSamurai++;
	}
	
//	Setters
	public void deathBlow(Human target){
		target.health = 0;
		this.health = (this.health/2);
		System.out.println(target + "has been killed");
	}
	
	public void meditate() {
		this.health = this.health + (this.health/2);
		System.out.println("Samurai recovered some health, health is now " + this.health);
	}
	
	public static int howMany() {
		System.out.println("There are " +numberOfSamurai+ "registered in the system");
		return numberOfSamurai;
	}
}
