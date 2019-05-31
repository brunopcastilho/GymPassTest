package com.java.GymPassTest.Domain;

import java.time.Duration;
import java.time.LocalTime;

public class Lap {
	
	private LocalTime  completionTime;
	private Duration  duration;
	private Driver driver;
	private int lapNumber;
	private double averageSpeed;
	
	
	public LocalTime  getCompletionTime() {
		return completionTime;
	}
	public void setCompletionTime(LocalTime  completionTime) {
		this.completionTime = completionTime;
	}

	public Duration  getDuration() {
		return duration;
	}
	public void setDuration(Duration  duration) {
		this.duration = duration;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public int getLapNumber() {
		return lapNumber;
	}
	public void setLapNumber(int lapNumber) {
		this.lapNumber = lapNumber;
	}
	public double getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("- Lap Number - " + getLapNumber() );
		builder.append("- Driver - " + getDriver().getName());
		builder.append("- Duration - " + getDuration() + "\n");
		
		
		return builder.toString();
	}
	

}
