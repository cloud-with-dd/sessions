package com.webapi.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot entry point for WebAPI service
 * 
 * @author  Deepesh Dhapola
 * @version 1.0
 * @since   2022-06-04
 * 
 */
@SpringBootApplication
public class WebAPIApp {


	/**
	 * Main method, entry point for springboot application
	 * @param args
	 */
    public static void main(String[] args) {
		SpringApplication.run(WebAPIApp.class, args);
	}

}