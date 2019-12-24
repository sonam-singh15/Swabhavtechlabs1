package com.techlab.ttt;

public class UserFactory {
	private final static String[] names = { "SONAM", "LISHA" };

	public static User[] getUsers(int userCount) {
		User[] users = new User[userCount];
		Mark[] marks = Mark.values();
		for (int i = 0; i < userCount; i++) {
			users[i] = new User(names[i], marks[i + 1], new Console());
		}
		return users;
	}
}