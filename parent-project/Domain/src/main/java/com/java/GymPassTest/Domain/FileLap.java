package com.java.GymPassTest.Domain;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record(minOccurs=0, maxOccurs=-1)
public class FileLap {

	 @Field(at=0, length=12)
	private String completionDate;
	 @Field(at=18, length=3)
	 private String driverNumber;
	 @Field(at=24, length=34)
	 private String driverName;
	@Field(at=58, length=6)
	 private String lapNumber;
	 @Field(at=64, length=32)
	 private String duration;
	 @Field(at=96, length=5)
	private String averageSpeed;

	 public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDriverNumber() {
		return driverNumber;
	}
	public void setDriverNumber(String driverNumber) {
		this.driverNumber = driverNumber;
	}
	public String getLapNumber() {
		return lapNumber;
	}
	public void setLapNumber(String lapNumber) {
		this.lapNumber = lapNumber;
	}
	public String getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(String averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("completionDate - " + getCompletionDate() + "\n");
		builder.append("driverNumber  - " + getDriverNumber() + "\n");
		builder.append("driverName  - " + getDriverName() + "\n");
		builder.append("lapNumber  - " + getLapNumber() +  "\n");
		builder.append("duration - " + getDuration() + "\n");
		builder.append("averageSpeed - " + getAverageSpeed() + "\n");
		
		return builder.toString();
	}
	
}
