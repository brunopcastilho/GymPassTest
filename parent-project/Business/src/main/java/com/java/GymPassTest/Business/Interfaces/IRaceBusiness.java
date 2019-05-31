package com.java.GymPassTest.Business.Interfaces;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.GymPassTest.Domain.Race;

public interface IRaceBusiness {

	Race getRaceInformation(String filePath);	
	
}
