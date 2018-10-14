import java.io.*;
import java.util.*;
class run{
	public static void main(String[] args){
		BackendInterface test = new BackendInterface();
		ArrayList<String> list = test.grab_type_list();
		for(String item: list){
			System.out.println(item + "\n");
		}
	}

}
