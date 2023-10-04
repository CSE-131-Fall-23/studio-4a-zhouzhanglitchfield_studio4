package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color lightblue = new Color(13, 210, 225);
		StdDraw.setPenColor(lightblue);
		StdDraw.setPenRadius(0.03);
		StdDraw.filledCircle(0.75, 0.75, 0.1);
		StdDraw.setPenColor(Color.black);
		StdDraw.point(.81, .8);
		StdDraw.point(.73, .8);
		StdDraw.setPenRadius(.001);
		StdDraw.arc(.75, .75, .05, 180, 0);
	}
}