package com.techlab.man.test;

import com.techlab.man.Boy;
import com.techlab.man.IEmotionable;
import com.techlab.man.ISocializable;
import com.techlab.man.Man;

public class ManTest {
	public static void main(String[] args) {
		Man m = new Man();
		atTheParty(m);
		// atTheMovie(m);

		Boy b = new Boy();
		atTheParty(b);
		atTheMovie(b);
	}

	static void atTheParty(ISocializable obj) {
		obj.wish();
		obj.depart();

	}

	static void atTheMovie(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}

}
