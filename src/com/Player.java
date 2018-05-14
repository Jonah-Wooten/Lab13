/**
 * 
 */
package com;

/**
 * @author jonahwooten
 *
 */
public abstract class Player {

	private String name;
	private int roshambo;

	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoshambo(int roshambo) {
		this.roshambo = roshambo;
	}

}
