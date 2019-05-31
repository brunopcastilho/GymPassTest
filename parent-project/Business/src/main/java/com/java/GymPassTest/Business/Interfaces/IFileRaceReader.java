package com.java.GymPassTest.Business.Interfaces;

import java.util.List;

import com.java.GymPassTest.Domain.FileLap;

public interface IFileRaceReader {


	Iterable<FileLap> getRaceInformation(String filePath);
}
