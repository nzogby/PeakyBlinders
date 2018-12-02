package Project1;

import java.io.*;
import java.util.Scanner;

public class FileIO{
				@param filename
				@return
		public static String readFileToString(String filename){
				Scanner scan = null;
				String content = "";
				try{
						scan = new Scanner(new File(filename));
						while(scan.hasNextLine()){
								content = content+scan.nextLine();
						}
				}
				catch(FileNotFoundException e){
								System.err.println(File Not Found: "+filename);
		}
		finally{scan.close();}
		return content;
	}
	

	@param filename
	@param toOutput
	@return

	public static boolean writeStringToFile(String filename, String toOutput){
				PrintStream stream = null;
				boolean result = false;
				try{
								stream = new PrintStream(filename);
								stream.format(%s%n,toOutput);
								result = true;
				}
				catch(FileNotFoundException e){
								System.err.println("File Not Found and Cannot Be Created: "+filename);
				}
				finally{stream.close();}
	
	}

	public static void main(String[] args){
				System.out.println(FileIO.writeStringToFile("settings.set","ex"));
				System.out.println(FileIO.readFileToString("settings.set"));
	}
}

