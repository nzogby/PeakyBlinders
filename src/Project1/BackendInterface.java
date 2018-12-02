package Project1;

import java.util.*;
import java.io.*;
import com.eclipsesource.json.*;
//import com.google.gson;
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
			type_files.put(file.getName().replace("_", " ").replace(".json", ""), TYPE_FILES_PATH + file);
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

 public Arraylist<Arraylist<String>>  buttonReturn(String type){
  JsonObject json = getJsonFile(_type_files.get(type));
  Iterator comp = json.keys();
  Arraylist<Arraylist<String>> sector = new Arraylist<Arraylist<String>>();
  while(comp.hasNext()){
   Object key = comp.next();
   int value = json.getJsonObject(key).get(price);
   String name = json.getJsonObject(key).get(company).get(companyName);
   Arraylist<String> companyInfo = new Arraylist<String>();
   companyInfo.add(name); companyInfo.add(""+value);
   sector.add(companyInfo);
  }
  return sector;
 }

	public static JsonObject getJsonFile(File type){
		String jsonString = "";
		JsonObject JObj = Json.parse(jsonString).asObject();
		return JObj;
		}

	/*public ArrayList<String> grab_stocknames_from_type(String type){
		File type_file = _type_files.get(type);
		ArrayList<String> stock_names = new ArrayList<String>();

	}
*/
	
}


