/*
 * @(#)CommuterRailService.java		Jan 3, 2016	
 */
package com.commuter.rail.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.commuter.rail.data.CommuterRailData;
import com.commuter.rail.domain.RailLine;
import com.commuter.rail.domain.Train;
 
@Path("/")

public class CommuterRailService {

	@Path("linestatus/{line}")
	@GET
	@Produces("application/xml")
	public String getRailLineStatus(@PathParam("line") String line) {
		System.out.println("Getting status of Rail Line->" + line);
		RailLine railLine = CommuterRailData.getRailLineStatus(line);
		String xmlContent = CommuterRailServiceHelper.getRailLineStatus(railLine);
 		return xmlContent;
	}
	
	@Path("trainlocation/{trainno}")
	@GET
	@Produces("application/xml")
	public String getTrainLocation(@PathParam("trainno") String trainNo) {
		System.out.println("Getting Location of Train->" + trainNo);
		Train train = CommuterRailData.getTrainLocation(trainNo);
		String xmlContent = CommuterRailServiceHelper.getTrainLocation(train);
 		return xmlContent;
	}
	
	@Path("nexttrain/{station}")
	@GET
	@Produces("application/xml")
	public String getNextTrain(@PathParam("station") String station) {
		System.out.println("Getting Next arriving Train at Station->" + station);
		Train train = CommuterRailData.getNextTrain(station);
		String xmlContent = CommuterRailServiceHelper.getNextTrain(train);
 		return xmlContent;
	}
}
