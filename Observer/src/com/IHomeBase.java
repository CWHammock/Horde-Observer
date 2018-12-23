/**
 * 
 */
package com;

/**
 * @author charles 
 *
 */
public interface IHomeBase {

	public void register(IOutPost o);
	public void unregister(IOutPost o);
	public void notifyObserver();
}
