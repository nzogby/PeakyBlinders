package Project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveListener implements ActionListener{
		private Gui settings;
		public SaveListener(Gui g){
				settings = g;
		}
		@Override
		public void actionPerformed(ActionEvent arg0){
				FileIO.writeStringToFile(System.getProperty("user.name")+".set",settings.toString());
		}
}
