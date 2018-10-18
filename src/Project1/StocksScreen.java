package Project1;



import java.awt.*;

	import java.awt.event.*;

	import java.io.IOException;

	import java.net.URI;

	import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JLabel;

	import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class StocksScreen extends JPanel{

	

	private TextField _searchbar;
	private JLabel _sectorsLabel;
	
	private String _searchedCompany;

	public StocksScreen() {

		//setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.GREEN);
		setVisible(true);

	}

	public void displayCompanyNames(ArrayList<ArrayList<String>> companyList) {
		
		for(int i = 0; i < companyList.size(); i++) {
		
			JLabel companyLabel;
			String companyName = companyList.get(i).get(0);
			String companyPrice = companyList.get(i).get(1);
			
			companyLabel = new JLabel(companyName + ", " + companyPrice, JLabel.CENTER);
			add(companyLabel);

			companyLabel.setVisible(true);
			companyLabel.setFont(new Font("Monospaced", Font.BOLD, 16));
			
		}
		
		repaint();
		
	}

}