/**
 * 
 */
package com;

/**
 * @author charles
 *
 */
public class Coordinate {
	int x;
	int y;
	
	public Coordinate(int horizontal, int vertical) {
		this.x = horizontal;
		this.y = vertical;
	}

	public final int getX() {
		return x;
	}

	public final int getY() {
		return y;
	}
	
	public final String toString() {
		return "horizontal: " + x + " vertical: " + y;
	}
	
}
