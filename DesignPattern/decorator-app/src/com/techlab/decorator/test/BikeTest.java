package com.techlab.decorator.test;

import com.techlab.decorator.BasicBikeService;
import com.techlab.decorator.ChainAlignment;
import com.techlab.decorator.EngineClean;
import com.techlab.decorator.IBikeService;
import com.techlab.decorator.OilChange;

public class BikeTest {
	public static void main(String[] args) {
		IBikeService service = new ChainAlignment(new OilChange(new BasicBikeService()));
		System.out.println(service.getDescription());
		System.out.println(service.getCost());

		IBikeService service1 = new EngineClean(new OilChange(new ChainAlignment(new BasicBikeService())));
		System.out.println(service1.getDescription());
		System.out.println(service1.getCost());

	}

}
