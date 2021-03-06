package Project1;

import java.io.*;
import java.util.Scanner;

public class FileIO{
				
		public static int readFileToInt(String filename){
				Scanner scan = null;
				String content = "";
				try{
						scan = new Scanner(new File(filename));
						while(scan.hasNextLine()){
								content = content+scan.nextLine();
						}
				}
				catch(FileNotFoundException e){
								System.err.println("File Not Found: "+filename);
		}
		finally{scan.close();}
		return Integer.parseInt(content);
	}
	
	public static boolean writeStringToFile(String filename, String toOutput){
				PrintStream stream = null;
				boolean result = false;
				try{
								stream = new PrintStream(filename);
								stream.format("%s%n",toOutput);
								result = true;
				}
				catch(FileNotFoundException e){
								System.err.println("File Not Found and Cannot Be Created: "+filename);
								System.out.println("HI");
				}
				finally{stream.close();}
				
				return result;
	}

	public static void main(String[] args){
				System.out.println(FileIO.writeStringToFile("settings.set",""+0));
				System.out.println(FileIO.readFileToInt("settings.set"));
	}
}

