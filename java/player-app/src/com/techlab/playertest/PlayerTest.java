package com.techlab.playertest;

import com.techlab.player.Player;
import java.io.Serializable;

public class PlayerTest implements Serializable{
	public static void main(String[] args) {
		Player p1 = new Player("Sonam", 24, 101);
		printInfo(p1);

		System.out.println();

		Player p2 = new Player("Anjali", 102);
		printInfo(p2);

		System.out.println();

		Player elder = p1.whoIsElder(p2);
		printInfo(elder);
	}

	public static void printInfo(Player p) {	
		System.out.println("name:-" + p.getName());
		System.out.println("age :- " + p.getAge());
		System.out.println("id :- " + p.getId());
		System.out.println("Elder person is :- " + p.getAge());

	}


}
