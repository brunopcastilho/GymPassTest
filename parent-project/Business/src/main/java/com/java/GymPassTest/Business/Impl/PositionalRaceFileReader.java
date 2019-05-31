package com.java.GymPassTest.Business.Impl;

import java.io.File;
import java.util.ArrayList;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.beanio.builder.StreamBuilder;
import org.springframework.stereotype.Component;

import com.java.GymPassTest.Business.Interfaces.IFileRaceReader;
import com.java.GymPassTest.Domain.FileLap;

@Component
public class PositionalRaceFileReader implements IFileRaceReader{

	public Iterable<FileLap> getRaceInformation(String filePath) {
		
		StreamFactory factory = StreamFactory.newInstance();
		StreamBuilder builder = new StreamBuilder("laps").format("fixedlength").addRecord(FileLap.class);
		factory.define(builder);
		
		BeanReader in = factory.createReader("laps", new File(filePath));
		
		ArrayList<FileLap> lapList = new ArrayList<FileLap>();
		
		Object record = in.read();
		while(record != null) {
			
			FileLap lap = (FileLap) record;
			
			lapList.add(lap);
			
			record = in.read();
			
		}
		
		return lapList;
	
	}

}
