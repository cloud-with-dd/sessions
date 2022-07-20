package com.webapi.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;



/**
 * 
 * 
 * @author  Deepesh Dhapola
 * @version 1.0
 * @since   2020-04-11
 * 
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/")

public class WebAPIController{

	
	/**
	 * Provides Service Heartbeat
	 * @return
	 */
    @GetMapping(value = "/", produces="text/html")
	public String home() {

		StringBuilder response = new StringBuilder("<html><head>" + 
		"<style>table { border-collapse: collapse;}" + 
		" td, th { border: 1px solid black;}</style> " + 
		"<title>Multi-Arch Container in EKS Cluster</title></head><Body style='font-family: sans-serif'><center>" +
		"<p>I'm a multi-arch container. This request was processed by:</p>");
		response.append("<table>");
		

		//sun.boot.library.path
		//os.arch
		//java.library.path
		//os.version
	
		response.append("\r\n<TR><TD>sun.boot.library.path</TD><TD>" + System.getProperty("sun.boot.library.path") + "</td></tr>");
		response.append("\r\n<TR><TD>os.arch</TD><TD>" + System.getProperty("os.arch") + "</td></tr>");
		response.append("\r\n<TR><TD>java.library.path</TD><TD>" + System.getProperty("java.library.path") + "</td></tr>");
		response.append("\r\n<TR><TD>os.version</TD><TD>" + System.getProperty("os.version") + "</td></tr>");
		/*
		Properties props = System.getProperties();
    	Enumeration<Object> keys = props.keys();
    	while(keys.hasMoreElements()){
        	Object key = keys.nextElement();
        	Object value = props.get(key);
			response.append("\r\n<TR><TD>" + key + "</TD><TD>" + value + "</td></tr>");
    	}
		 */
		
		response.append("<table/></center></body></html>");

		return response.toString();
	}

}