/*
 * @(#)RailLine.java		Jan 3, 2016	
 */
package com.commuter.rail.domain;

import java.util.List;

/**
 *
 * @author  Prasad Nerayanuru
 */

public class RailLine {
	private String lineName;
	private List<TrainStation> trainStations;
	private List<Train> trains;
	private String lineStatus;
	
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public List<TrainStation> getTrainStations() {
		return trainStations;
	}
	public void setTrainStations(List<TrainStation> trainStations) {
		this.trainStations = trainStations;
	}
	public List<Train> getTrains() {
		return trains;
	}
	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

}
