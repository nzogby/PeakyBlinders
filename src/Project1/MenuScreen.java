package Project1;



import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MenuScreen extends JPanel {

		private JPanel _secondPanel;

		public MenuScreen() {

			setBackground(Color.GRAY);
			
			_secondPanel = new JPanel();
			_secondPanel.setBackground(Color.GRAY);
			add(_secondPanel, BorderLayout.SOUTH);
			
			setSize(300,300);
			setVisible(true);

		}
		
		public JPanel getPanel() {return _secondPanel;}

}