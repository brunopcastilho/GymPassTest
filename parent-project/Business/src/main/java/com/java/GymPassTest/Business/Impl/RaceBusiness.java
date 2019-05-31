package com.java.GymPassTest.Business.Impl;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.GymPassTest.Business.Interfaces.IFileRaceReader;
import com.java.GymPassTest.Business.Interfaces.IRaceBusiness;
import com.java.GymPassTest.Domain.Driver;
import com.java.GymPassTest.Domain.FileLap;
import com.java.GymPassTest.Domain.Lap;
import com.java.GymPassTest.Domain.Race;

@Component
public class RaceBusiness implements IRaceBusiness{

	@Autowired
	IFileRaceReader fileReader;
	
	
	public Race getRaceInformation(String filePath) {
		// TODO Auto-generated method stub
		
		Iterable<FileLap> lapList = fileReader.getRaceInformation(filePath);
		return buildRace(lapList);
		
	}
	
	private Race buildRace(Iterable<FileLap> fileLapList) {
		
		ArrayList<Driver> driverList = new ArrayList<Driver>();
		HashMap<String, Driver> driverHash = new HashMap<String, Driver>();
		ArrayList<Lap> lapList = new ArrayList<Lap>();
		for (FileLap fileLap : fileLapList) {

			Lap lap = buildLap(fileLap);
			getOrPutDriver(fileLap.getDriverNumber(), fileLap.getDriverName(), driverHash, driverList , lap);
			lapList.add(lap);
		}
		Race race = new Race();
		race.getDriverList().addAll(driverList);
		race.getLapList().addAll(lapList);

		return race;
		
	}
	
	private Lap buildLap(FileLap fileLap) {

		Lap lap = new Lap();
		
		lap.setAverageSpeed(Double.parseDouble(fileLap.getAverageSpeed().trim().replace(',', '.')));
		lap.setCompletionTime(Util.getLocalTimeFromString(fileLap.getCompletionDate()));
		lap.setDuration(Util.getDurationFromString(fileLap.getDuration()));
		lap.setLapNumber(Integer.parseInt(fileLap.getLapNumber().trim()));
		
		return lap;
	}
	

	private Driver getOrPutDriver(String driverNumber, String driverName, HashMap<String, Driver> driverHash, ArrayList<Driver> driverList, Lap lap) {
		
		Driver driver= null;
		if (driverHash.containsKey(driverNumber)) {
			driver = driverHash.get(driverNumber);
		} else {
			driver = new Driver();
			driver.setCode(driverNumber);
			driver.setName(driverName);
			driverHash.put(driverNumber, driver);
			driverList.add(driver);
		}
		
		driver.getLapList().add(lap);
		lap.setDriver(driver);
		return driver;
		
	}

}
