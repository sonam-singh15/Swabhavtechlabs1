package com.techlab.composite;

import com.techalb.composite.test.File;
import com.techalb.composite.test.Folder;

public class CompositeTest {
	public static void main(String[] args) {
		Folder root = new Folder("movies");
		storeintoFolder(root);
		root.display("");
	}

	private static void storeintoFolder(Folder folder) {
		folder.addStorageItem(new File("spiderman.avi", 200));
		folder.addStorageItem(new File("fantastic beasts.mp4", 100));

		Folder comedy = new Folder("comedy");
		comedy.addStorageItem(new File("Phir Hera Pheri.mkv", 1000));
		comedy.addStorageItem(new File("Golmaal.mp4", 2000));
		folder.addStorageItem(comedy);

		Folder sciFi = new Folder("sci-fi");
		sciFi.addStorageItem(new File("Avengers.mp4", 1750));
		Folder ironMan = new Folder("Iron Man");
		ironMan.addStorageItem(new File("Iron Man 2.mkv", 800));
		sciFi.addStorageItem(ironMan);

		Folder fantasy = new Folder("fantasy");
		fantasy.addStorageItem(new File("oh My god.mp4", 3000));
		folder.addStorageItem(fantasy);

		folder.addStorageItem(new File("ghhj", 300));

	}

}
