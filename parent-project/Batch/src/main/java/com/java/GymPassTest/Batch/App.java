package com.java.GymPassTest.Batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.java.GymPassTest.Business.Interfaces.IRaceBusiness;


@SpringBootApplication
@ComponentScan({"com.java.GymPassTest.Business.Impl"})
public class App implements CommandLineRunner 
{
	
	@Autowired
	IRaceBusiness raceBusiness;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }

    public void run(String... args) {

    	
    	if (args.length != 1) {
    		System.out.print("The program must receive one parameter with the path to the input file");
    	} else {
    		
    		System.out.print(raceBusiness.getRaceInformation(args[0]).printResults());
    	}
    	
		
	}
}
