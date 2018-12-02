package Project1;

import java.atw.event.*;

public class SaveListener implemnets ActionListener{
		private Gui settings;
		public SaveListener(Gui g){
				setings = g;
		}
		@Override
		public void actionPerformed(ActionEvent arg0){
				FileIO.writeStringToFile(System.getProperty("user.name")+".set",settings.toString());
		}
}
