/**
 * 
 */
package com;

import java.util.ArrayList;


/**
 * @author charles
 *
 */
public class HordeHomeBase implements IHomeBase {
	
	private ArrayList<IOutPost> iOutPosts;
	private Coordinate coordinate;
	
	public HordeHomeBase() {
		iOutPosts = new ArrayList<IOutPost>();
	}
	

	@Override
	public void register(IOutPost newOutPost) {
		iOutPosts.add(newOutPost);
		
	}

	@Override
	public void unregister(IOutPost oldOutPost) {
		iOutPosts.remove(oldOutPost);
		System.out.println(oldOutPost + " deleted....");
		
	}
	

	@Override
	public void notifyObserver() {
		for(IOutPost iOutPost: iOutPosts) {
			iOutPost.update(this.coordinate);
		}
		
	}
	
	public void getCoordinateOfTarget(Coordinate newCoordinate) {
		this.coordinate = newCoordinate;
		notifyObserver();
	}
	

}
