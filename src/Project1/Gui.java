package Project1;

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
