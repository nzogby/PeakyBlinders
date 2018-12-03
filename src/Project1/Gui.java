package Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gui {

	public static void main(String[] args) {
		if(args.length == 0){
			new Multipanels(0);
		}
		else{
			new Multipanels(FileIO.readFileToInt(args[0]));
		}
		
	}
}
