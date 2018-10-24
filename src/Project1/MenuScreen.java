package Project1;



import java.awt.*;

	import java.awt.event.*;

	import java.io.IOException;

	import java.net.URI;

	import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JLabel;

	import javax.swing.JPanel;



public class MenuScreen extends JPanel {

		private JLabel _menuLabel;
		private JPanel _firstPanel;
		private JPanel _secondPanel;

		public MenuScreen() {

			setBackground(Color.GRAY);
			
			//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			_menuLabel = new JLabel("Menu");
			_menuLabel.setForeground(Color.blue);
			
			_firstPanel = new JPanel();
			_firstPanel.setBackground(Color.GRAY);
			_firstPanel.add(_menuLabel);
			add(_firstPanel);
			
			_secondPanel = new JPanel();
			_secondPanel.setBackground(Color.GRAY);
			add(_secondPanel, BorderLayout.SOUTH);
			
			setSize(300,300);
			setVisible(true);

		}
		
		public JPanel getPanel() {return _secondPanel;}

}