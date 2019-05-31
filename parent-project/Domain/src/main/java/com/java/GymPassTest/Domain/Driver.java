package com.java.GymPassTest.Domain;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	private String name;
	private String code;
	private List<Lap> lapList;
	
	public List<Lap> getLapList() {
		if (lapList == null) {
			lapList = new ArrayList<Lap>();
		}
		return lapList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Lap getBestLap() {
		Lap bestLap = null;
		for(Lap lap : lapList) {
			if (bestLap == null) {
				bestLap = lap;
			}
			if (lap.getDuration().compareTo(bestLap.getDuration()) == -1) {
				bestLap = lap;
			}
		}
		
		return bestLap;
	}
	
	public Duration  getTotalTime() {
		Duration  totalTime = Duration.ZERO;
		for(Lap lap : lapList) {
			totalTime = totalTime.plus(lap.getDuration());
		}
			
		return totalTime; 
	}
	
	public int getNumberOfLaps() {
		return lapList.size();
	}
	
	public Lap getLastLap() {
		Lap lastLap = null;
		for (Lap lap : lapList) {
			if (lastLap == null) {
				lastLap = lap;
			}
			if (lap.getLapNumber() > lastLap.getLapNumber()) {
				lastLap = lap;
			}
				
		}
		return lastLap;
	}
	
	public double getAverageSpeed() {
		double total = 0;
		if (lapList.size() > 0) {
			for (Lap lap : lapList) {
				total = total + lap.getAverageSpeed();
			}
			return total / lapList.size();
		}
		else {
			return 0;
		}
	}
	
}
