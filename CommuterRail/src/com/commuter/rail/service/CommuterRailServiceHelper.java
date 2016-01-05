/*
 * @(#)CommuterRailServiceHelper.java		Jan 3, 2016	
 */
package com.commuter.rail.service;

import com.commuter.rail.domain.RailLine;
import com.commuter.rail.domain.Train;

/**
 *
 * @author  Prasad Nerayanuru
 */

public class CommuterRailServiceHelper {

	static String getRailLineStatus(RailLine railLine){
		return "<CommuterRailService> \n <RailLine> \n " + 
				getElement("LineName", railLine.getLineName()) + 
				getElement("LineStatus", railLine.getLineStatus()) + 
				"</RailLine> \n </CommuterRailService>";			
	}
	
	public static String getTrainLocation(Train train) {
		return "<CommuterRailService> \n <Train> \n " + 
				getElement("TrainNumber", train.getTrainNumber()) + 
				getElement("Location", train.getLocation()) + 
				"</Train> \n </CommuterRailService>";
	}
	
	public static String getNextTrain(Train train) {
		return "<CommuterRailService> \n <Station> \n " + 
				getElement("StationName", train.getLocation()) + 
				getElement("NextTrain", train.getTrainNumber()) + 
				"</Station> \n </CommuterRailService>";
	}
	
	static String getElement(String name, String value){
		return "<" + name + ">" + value + "</" + name  + ">\n";
	}
}
