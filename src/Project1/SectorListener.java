package Project1;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SectorListener implements ActionListener{

	private String _sectorName;
	private JPanel _scrollPanel;
	
	private ArrayList<ArrayList<String>> _basicMaterials;
	private ArrayList<ArrayList<String>> _energy;
	private ArrayList<ArrayList<String>> _technology;
	
	public SectorListener(String sectorName, JPanel scrollPanel) {
		
		_sectorName = sectorName;
		_scrollPanel = scrollPanel;
		
		_basicMaterials = new ArrayList<ArrayList<String>>();
		_energy = new ArrayList<ArrayList<String>>();
		_technology = new ArrayList<ArrayList<String>>();
		
		setUpCompanyLists();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { // when the buttons are pressed

		if(_sectorName.equals("Basic Materials")) {displayCompanyNames(_basicMaterials);}
		if(_sectorName.equals("Energy")) {displayCompanyNames(_energy);}
		if(_sectorName.equals("Tech")) {displayCompanyNames(_technology);}
		
	}
	
	public void displayCompanyNames(ArrayList<ArrayList<String>> companyList) {
		
		_scrollPanel.removeAll();
		for(int i = 0; i < companyList.size(); i++) {
		
			JLabel companyLabel;
			String companyName = companyList.get(i).get(0);
			String companyPrice = companyList.get(i).get(1);
			
			companyLabel = new JLabel(companyName + ", " + companyPrice, JLabel.CENTER);
			_scrollPanel.add(companyLabel);

			companyLabel.setVisible(true);
			companyLabel.setFont(new Font("Monospaced", Font.BOLD, 16));
			
		}
		
		_scrollPanel.revalidate();
		_scrollPanel.repaint();
		
	}
	
	public void setUpCompanyLists() { // the values are hardcoded for now just to show that there is some functionality with the buttons
		
		ArrayList<String> tempList = new ArrayList<String>(2);
		tempList.add("Google");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Apple");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Microsoft");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Samsung");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Oracle");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Cisco");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Adobe");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Twitter");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Tesla");
		tempList.add("");
		_technology.add(tempList);
		
		tempList = new ArrayList<String>(2);
		tempList.add("Facebook");
		tempList.add("");
		_technology.add(tempList);
		
	}

}
