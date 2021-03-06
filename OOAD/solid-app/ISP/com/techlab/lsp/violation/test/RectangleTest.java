package com.techlab.lsp.violation.test;

import com.techlab.lsp.violation.Rectangle;
import com.techlab.lsp.violation.Square;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangles = new Rectangle(100, 5);
		shouldNotChangeWidthIfHeightIsModified(rectangles);

		System.out.println();

		Square squares = new Square(50);
		shouldNotChangeWidthIfHeightIsModified(squares);

	}

	public static void shouldNotChangeWidthIfHeightIsModified(Rectangle rect) {
		int before = rect.getWidth();
		rect.setHeight(rect.getHeight() + 10);
		int after = rect.getWidth();

		System.out.println("Width before :- " + before);
		System.out.println("Width after :- " + after);

		System.out.println(before == after);

	}
}
