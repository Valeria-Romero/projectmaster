package com.projectmaster.players.types;
import com.projectmaster.players.Human;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
//	Setters
	
	public void heal(Human target) {
		target.health += this.intelligence;
		System.out.println(target + " health was increased to: " + target.health);
	}
	
	public void fireball(Human target) {
		target.health -= (this.intelligence * 3);
		System.out.println(target + " health was decreased to: " + target.health);
	}
}
