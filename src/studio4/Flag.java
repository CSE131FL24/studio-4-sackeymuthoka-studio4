package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.35);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.7, 0.7, 0.7, 0.1);
		
		Color darkGreen = new Color(0, 150, 0);
		StdDraw.setPenColor(darkGreen);
		StdDraw.filledRectangle(0.3, 0.3, 0.7, 0.1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(0.5, 0.5, 0.045, 0.12);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.5, 0.5, 0.020, 0.12);

		
		
		
		
		
		
		
		
		
	}
}