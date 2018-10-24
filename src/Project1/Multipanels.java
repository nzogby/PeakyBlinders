package Project1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Multipanels implements ActionListener{

		JFrame _window = new JFrame("Stock Predictor");
		JPanel _leftPanel = new JPanel();
		
		MenuScreen _menuPanel = new MenuScreen(); // bottom panel
		SearchScreen _searchPanel = new SearchScreen(); // left panel
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
			
			
			JButton searchButton = _searchPanel.getSearchButton();
			searchButton.addActionListener(this);
			
		}		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			JTextField searchBox = _searchPanel.getSearchBox();
			String searchText = searchBox.getText();
			JLabel searchedLabel = new JLabel(searchText);

			_menuPanel.getPanel().removeAll();
			_menuPanel.getPanel().add(searchedLabel, BorderLayout.SOUTH);
			_menuPanel.getPanel().revalidate();
			_menuPanel.getPanel().repaint();
			
		}
		
}