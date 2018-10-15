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

			

			//
			setBackground(Color.GRAY);
			
			
			_menuLabel = new JLabel("Menu");
			_menuLabel.setForeground(Color.blue);
			add(_menuLabel);
			
			setSize(300,300);
			setVisible(true);
			//setBorder(BorderFactory.createLineBorder(Color.black));

		}

		

}