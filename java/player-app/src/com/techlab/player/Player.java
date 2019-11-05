package com.techlab.player;

public class Player {

	private String name;
	private int id;
	private int age;
	public static int noofplayers = 0;

	{

		noofplayers += 1;
	}

	public Player(String name, int age, int id) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Player(String name, int id) {
		this(name, id, 18);
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public Player whoIsElder(Player secondplayer) {
		if (secondplayer.age > this.age)
			return secondplayer;
		return this;

	}

 }
