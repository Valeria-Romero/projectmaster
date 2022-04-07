package com.projectmaster.players.types;
import com.projectmaster.players.Human;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;	
	}
	
	
//	Setters
	public void steal(Human target) {
		target.health -= this.stealth;
		System.out.println(target + " health decreased " + this.stealth);
		this.health += this.stealth;
		System.out.println("Ninja's health increased " + this.stealth);
	}
	
    public void runAway() {
        this.health -= 10;
        System.out.println("Ninja's health: " + this.health);
    }
}
