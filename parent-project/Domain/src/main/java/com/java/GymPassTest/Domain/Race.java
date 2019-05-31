package com.java.GymPassTest.Domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Race {

	public List<Lap> getLapList() {
		
		if (lapList == null) {
			lapList = new ArrayList<Lap>();
		}
		
		return lapList;
	}

	public List<Driver> getDriverList() {
		
		if (driverList == null) {
			driverList = new ArrayList<Driver>();
		}
		return driverList;
	}
	
	List<Lap> lapList;
	List<Driver> driverList;
	
	public Driver getWinner() {
		
		//Eliminate Drivers who didn't finish all laps and get the smallest completion time for the last lap
		
		int numberOfLaps = getNumberOfLaps();
		LocalTime time = null;
		Driver winner = null;
		
		for (Driver driver : driverList) {
			if (driver.getNumberOfLaps() == numberOfLaps) {
				if (time == null) {
					time = driver.getLastLap().getCompletionTime();
					winner = driver;
				}
				if (driver.getLastLap().getCompletionTime().compareTo(time) == -1 ) {
					time = driver.getLastLap().getCompletionTime();
					winner = driver;
				}
				
			}
		}
		
		return winner;
		
	}
	
	public int getNumberOfLaps() {
		int numberOfLaps = 0;
		for (Driver driver : driverList) {
			if (driver.getNumberOfLaps() > numberOfLaps) {
				numberOfLaps = driver.getNumberOfLaps();
			}
		}
		return numberOfLaps;
	}
	
	public String printResults() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("------------------------" + "\n");
		builder.append("- Race Winner - " + getWinner().getName() + "\n");
		builder.append(" - Finish hour - " + getWinner().getLastLap().getCompletionTime() + "\n");
		builder.append(" - Total race time - " + getWinner().getTotalTime() + "\n");
		builder.append(" - Fastest Lap - " + getWinner().getBestLap().toString() + "\n");
		builder.append(" ------------------------\n\n");
		
		builder.append("---- Drivers average speed ------" + "\n");
		for(Driver driver : driverList) {
			
			builder.append("- Driver - " + driver.getName() + " ");
			builder.append("- Average Speed - " + driver.getAverageSpeed() + "\n");	
		}
		
		builder.append(" ------------------------\n\n");
			
		
		builder.append("---- All Laps ------" + "\n");
		for (Lap lap : lapList) {
			builder.append(lap.toString() + "\n");
		}
		
		builder.append("------------------" + "\n");
		
		
		
		return builder.toString();
		
	}
	
}
