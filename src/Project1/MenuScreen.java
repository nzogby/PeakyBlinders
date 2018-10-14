package Project1;



import java.awt.*;

	import java.awt.event.*;

	import java.io.IOException;

	import java.net.URI;

	import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JLabel;

	import javax.swing.JPanel;



public class MenuScreen extends JPanel {

		

		private JLabel _menuLabel;

	

		public MenuScreen() {

			

			_menuLabel = new JLabel("Menu that does nothing");
			add(_menuLabel);
			setVisible(true);
			setBorder(BorderFactory.createLineBorder(Color.black));

		}

		

}