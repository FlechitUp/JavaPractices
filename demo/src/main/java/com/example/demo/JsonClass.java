package com.example.demo;
import java.io.FileNotFoundException;

import org.apache.tomcat.util.json.JSONParser;
//package com.example.demo;


public class JsonClass {
	
	JSONParser parser = new JSONParser();
	
	try {
		
		Object obj =  parser.parse(new FileReader("myJSON.json"));
		JSONObject jsonObject = (JSONObject) obj;
		String name = (String) jsonObject.get("name");
		System.out.println("Name "+name);
		
		String location = (String) jsonObject.get("location");
		System.out.println("Location "+location);
		
		//loop array
		JSONArray coursesArray = (JSONArray) jsonObject.get("courses"); 
	}
	catch(FileNotFoundException e) {e.printStackTrace();}
	catch(IOException e) {e.printStackTrace();}
	catch(ParseException e) {e.printStackTrace();}
	catch(Exception e) {e.printStackTrace();}


}
