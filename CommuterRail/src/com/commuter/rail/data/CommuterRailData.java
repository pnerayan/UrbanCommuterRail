/*
 * @(#)CommuterRailData.java		Jan 3, 2016	
 */
package com.commuter.rail.data;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import com.commuter.rail.domain.RailLine;
import com.commuter.rail.domain.Train;

/**
 *
 * @author  Prasad Nerayanuru
 */

public class CommuterRailData {
	
	public static RailLine getRailLineStatus(String lineName){
		RailLine railLine = new RailLine();
		railLine.setLineName(lineName);
		Random random = new Random();
		String lineStatus = RAIL_LINE_STATUSES[random.nextInt(RAIL_LINE_STATUSES.length)];
		railLine.setLineStatus(lineStatus);
		return railLine;
	}
	
	public static Train getTrainLocation(String trainNo) {
		Train train = new Train();
		train.setTrainNumber(trainNo);
		Random random = new Random();
		String trainLocation = TRAIN_LOCATIONS[random.nextInt(TRAIN_LOCATIONS.length)];
		train.setLocation(trainLocation);
		return train;
	}
	
	public static Train getNextTrain(String station){
		Train train = new Train();
		train.setLocation(station);
		Random random = new Random();
		train.setTrainNumber("" + 100 + random.nextInt(899));
		return train;
	}
	

	public static String[] RAIL_LINES = {"SilverLine", "OrangeLine", "RedLine"};
	
	public static String[] RAIL_LINE_STATUSES = {"Line Suspended", "Good", "Service Alert", "Planned Work"};
	
	public static String[] TRAIN_LOCATIONS = {"Wiehle-Reston East","McLean","Tysons Corner","Vienna/Fairfax-GMU","Dunn Loring-Merrifield","Ballston-MU",
			"Bethesda","Metro Center","Rockville","Shady Grove"};
	
	public static LinkedHashMap<String, List<String>> RAIL_LINE_STATIONS=
			new LinkedHashMap<String, List<String>>(){
				private static final long serialVersionUID = 9134319194088080062L;
		{
			put("SilverLine", Arrays.asList(new String[]{"Wiehle-Reston East","McLean","Tysons Corner"}));
			put("OrangeLine", Arrays.asList(new String[]{"Vienna/Fairfax-GMU","Dunn Loring-Merrifield","Ballston-MU"}));
			put("RedLine", Arrays.asList(new String[]{"Bethesda","Metro Center","Rockville","Shady Grove"}));
		}
	};
	
	public static LinkedHashMap<String, List<String>> RAIL_LINE_TRAINS = 
			new LinkedHashMap<String, List<String>>(){
		private static final long serialVersionUID = 5603100911418220644L;
		{
			put("SilverLine", Arrays.asList(new String[]{"111","222","333"}));
			put("OrangeLine", Arrays.asList(new String[]{"444","555","666"}));
			put("RedLine", Arrays.asList(new String[]{"777","888","999"}));
		}
	};
}
