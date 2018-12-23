/**
 * 
 */
package com;

/**
 * @author charles
 *
 */
public class HordeOutPost implements IOutPost{
	
	private Coordinate outPostCoordinate;
	
	private static int outPostCoordintateID = 0;
	
	private int outPostID;
	
	private IHomeBase hordeHomeBase;
	
	public HordeOutPost(IHomeBase hordeHomeBase) {
		this.hordeHomeBase = hordeHomeBase;
		this.outPostID = ++outPostCoordintateID;
		
		System.out.println("new outpost " + this.outPostID);
		hordeHomeBase.register(this);
	}

	@Override
	public void update(Coordinate coordinate) {
		this.outPostCoordinate = coordinate;
		System.out.println("Outpost " + outPostID + " updated ");
		printTheCoordinates();
		
	}
	
	public void printTheCoordinates() {
		System.out.println(outPostCoordinate.toString());
	}

	
}
