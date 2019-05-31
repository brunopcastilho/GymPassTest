package com.java.GymPassTest.Business.Impl;

import java.time.Duration;
import java.time.LocalTime;

public class Util {

	public static LocalTime getLocalTimeFromString(String strDate) {
		
		String strMil = "000";
		String strSec = "00";
		String strMin = "00";
		String strHour = "00";
		
		String[] strSplitMil = strDate.split("\\.");
		if (strSplitMil.length > 1) {
			
			if (strSplitMil[1].length() < 3) {
				strSplitMil[1]  = strSplitMil[1] + "0";
			}
			
			strMil = strSplitMil[1]; 
		}
		String[] strTime =strSplitMil[0].split(":");
		if (strTime.length >= 3) {
			strSec = strTime[2];
			strMin = strTime[1];
			strHour = strTime[0];
		} else {
			strMin = strTime[0];
			strSec = strTime[1];
		}
		if (strHour.length() < 2) {
			strHour = "0" + strHour;
		}
		if (strMin.length() < 2) {
			strMin= "0" + strMin;
		}
		if (strSec.length() < 2) {
			strSec = "0" + strSec;
		}
		
		
		
		
		LocalTime  time = LocalTime .parse(strHour + ":" + strMin + ":" + strSec + "." + strMil);
		return time;
		
	}
	 
	public static Duration  getDurationFromString(String strDate) {
		
		String strMil = "000";
		String strSec = "00";
		String strMin = "00";
		String strHour = "00";
		
		String[] strSplitMil = strDate.split("\\.");
		if (strSplitMil.length > 1) {
			
			if (strSplitMil[1].length() < 3) {
				strSplitMil[1]  = strSplitMil[1] + "0";
			}
			
			strMil = strSplitMil[1]; 
		}
		String[] strTime =strSplitMil[0].split(":");
		if (strTime.length >= 3) {
			strSec = strTime[2];
			strMin = strTime[1];
			strHour = strTime[0];
		} else {
			strMin = strTime[0];
			strSec = strTime[1];
		}
		if (strHour.length() < 2) {
			strHour = "0" + strHour;
		}
		if (strMin.length() < 2) {
			strMin= "0" + strMin;
		}
		if (strSec.length() < 2) {
			strSec = "0" + strSec;
		}
		
		
		
		
		Duration  time = Duration.ZERO;
		time = time.plusHours(Long.parseLong(strHour));
		time = time.plusMinutes(Long.parseLong(strMin));
		time = time.plusSeconds(Long.parseLong(strSec));
		time = time.plusMillis(Long.parseLong(strMil));
		return time;
		
	}
	
}
