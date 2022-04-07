package com.projectmaster.test;
import com.projectmaster.players.Human;

public class test {
	
	public static void main(String[] args) {
		
		Human cain = new Human();
		Human abel = new Human();
		
		cain.attack(abel);
		abel.getHealth();
	}
}
