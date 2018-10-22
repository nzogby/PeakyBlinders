package Project1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multipanels implements ActionListener{

		JFrame _window = new JFrame("Stock Predictor");
		JPanel _leftPanel = new JPanel();
		
		JPanel _menuPanel = new MenuScreen(); // bottom panel
		JPanel _searchPanel = new SearchScreen(); // left panel
		StocksScreen _stockPanel = new StocksScreen(); // right panel
		
		Multipanels(){
		
			_window.add(_stockPanel, BorderLayout.EAST); // add right panel
			
			_leftPanel.setLayout(new BoxLayout(_leftPanel, BoxLayout.Y_AXIS));
			_leftPanel.add(_searchPanel);
			_leftPanel.add(_menuPanel);
			_leftPanel.setVisible(true);
			_window.add(_leftPanel, BorderLayout.WEST);
			
			_window.setSize(600,600); // set size of jframe
			_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			_window.setVisible(true);
			_window.setResizable(false); // not resizable
			
		}		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {}
		
}