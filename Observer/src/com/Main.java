/**
 * 
 */
package com;

/**
 * @author charles 
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HordeHomeBase hordeHomeBase = new HordeHomeBase();
		
		HordeOutPost hordeOutPost1 = new HordeOutPost(hordeHomeBase);
		HordeOutPost hordeOutPost2 = new HordeOutPost(hordeHomeBase);
		
		Coordinate coordinate1 = new Coordinate(45, 95);
		Coordinate coordinate2 = new Coordinate(55, 111);
		
		hordeHomeBase.getCoordinateOfTarget(coordinate1);
		hordeHomeBase.getCoordinateOfTarget(coordinate2);
		
		
		

	}

}
