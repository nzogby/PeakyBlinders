package Project1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class SectorListener implements ActionListener{

	private String _sectorName;
	private JPanel _scrollPanel;
	
	public SectorListener(String sectorName, JPanel scrollPanel) {
		
		_sectorName = sectorName;
		_scrollPanel = scrollPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		_scrollPanel.removeAll();
		_scrollPanel.revalidate();
		_scrollPanel.repaint();
		
		if(_sectorName.equals("Basic Materials")) {}
		if(_sectorName.equals("Energy")) {}
		if(_sectorName.equals("Tech")) {}
		
	}

}
