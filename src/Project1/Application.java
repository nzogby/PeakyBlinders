package Project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class Application {

	public static void main(String[] args) {

		File file = new File(""); // put name of file here
		String jsonString = "";
		BufferedReader br = null;
		
		try {
			
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while( (line = br.readLine()) != null) {jsonString += line;}
			
		}
		
		catch (FileNotFoundException e) {System.out.println("File Not Found.");} 
		catch (IOException e) {System.out.println("IO Exception.");}
		
		try {br.close();}
		catch (IOException e) {System.out.println("IOException.");}
		catch (NullPointerException e) {System.out.println("File was probably never opened.");}
		
		JsonObject jsonObject = Json.parse(jsonString).asObject(); // turn the string into a json object
		
		JsonArray companies = jsonObject.get("name of array").asArray(); // get an array
		
		for (JsonValue company : companies) { // iterate through array

			// add company names to jlabels and display them on the jpanel
		
		}
		
		
		
	}

}
