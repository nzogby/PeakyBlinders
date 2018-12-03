package Project1;

import java.util.*;
import java.io.*;
//import com.eclipsesource.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/*
 * Use this Class to interface with the backend stock data
 *
 *	Instantiating an object gathers a list of stock types with associated files
 *	
 *
 *
 * */

public class BackendInterface {
//PATH VARIABLES
	static String dir = System.getProperty("user.dir").replace("src/Project1", "data/data_files/");
	static String INDEX_FILE_PATH = dir + "index.json";
	static String TYPE_FILES_PATH = dir + "types/";
	
//VARIABLES USED TO STORE DATA REFERENCES	
	HashMap<String, File> _type_files; //maps stock types to json files
	File _index_file;

	// function which gathers stock types
	private HashMap<String, File> grab_type_files() {
		HashMap<String, File> type_files = new HashMap<String, File>();
		for (File file : (new File(TYPE_FILES_PATH).listFiles())){
			type_files.put(file.getName().replace("_", " ").replace(".json", ""),TYPE_FILES_PATH + file);
		}
		return type_files;
	}

//CLASS CONSTRUCTOR
	public BackendInterface(){ 
		_type_files = grab_type_files();
	       	_index_file = new File(INDEX_FILE_PATH); 
	}

	public ArrayList<String> grab_type_list(){
		ArrayList<String> type_list = new ArrayList<String>();
		for (String key: _type_files.keySet()){
			type_list.add(key);
		}
		return type_list;
	}

 public ArrayList<ArrayList<String>>  buttonReturn(String type){
//  	json_info_grabber jig = new json_info_grabber();
//		ArrayList<ArrayList<String>> list = jig.info_grabber(type);
	ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
	JSONParser parser = new JSONParser();
	File fil = new File(TYPE_FILES_PATH);
	File[] files = fil.listFiles();
	if(files !=null){
			String toParse = TYPE_FILES_PATH+type+".json";
			FileReader fr = new FileReader(toParse);
			JSONArray a = (JSONArray) parser.parse(fr);
			for(Object o :a){
				JSONObject company = (JSONObject) o;
				ArrayList<String> comp = new ArrayList<String>();
				for(Object key : company.keySet()){
					comp.add((String) company.get(key));
				}
				list.add(comp);
			}
	}
  return list;
 }

	public ArrayList<String> searching(String company){
		ArrayList<String> list = new ArrayList<String>();
		JSONParser parser = new JSONParser();
		FileReader fil = new FileReader(_index_file+".json");
		JSONArray a = (JSONArray) parser.parse(fil);		
		for(Object o : a){
			JSONObject jo = (JSONObject) o;
			if(jo.get("companyName").equals(company) || jo.get("symbol").equals(company)){
				ArrayList<String> comp = new ArrayList<String>();
				for(Object key: jo.keySet()){
					comp.add((String) jo.get(key));
				}
				return comp;
			}
			else{
				ArrayList<String> fail = new ArrayList<String>();
				fail.add("fail");fail.add(company);
				return fail;
			}
		}
	}
	
}


