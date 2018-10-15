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



public class StocksScreen extends JPanel {

	

	private TextField _searchbar;
	private JLabel _sectorsLabel;
	
	private String _searchedCompany;
	private JLabel _companyLabel;

	

	public StocksScreen() {

		//setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.GREEN);
		
		setVisible(true);

	}

	public void displayCompanyNames(String searchedCompany) {
		
		_searchedCompany = searchedCompany;
		_companyLabel = new JLabel(_searchedCompany, JLabel.CENTER);
		add(_companyLabel);

		_companyLabel.setVisible(true);
		_companyLabel.setFont(new Font("Monospaced", Font.BOLD, 16));

		repaint();
		
	}

}