/*
 * @(#)Train.java		Jan 3, 2016	
 */
package com.commuter.rail.domain;

/**
 *
 * @author  Prasad Nerayanuru
 */

public class Train {

	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String trainNumber;
	private String location;
}
