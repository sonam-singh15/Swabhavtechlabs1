package com.techlab.playertest;

import com.techlab.player.Player;

public class PlayerCountTest {
	public static void main(String[] args) {
		Player p1 = new Player("Sonam", 24, 101);
		Player p2 = new Player("Sona", 26, 103);
		Player p3 = new Player("Anju", 27, 102);
		Player p4 = new Player("Anju", 27, 102);
		System.out.println("no of players:-" + Player.noofplayers);
	}

}
