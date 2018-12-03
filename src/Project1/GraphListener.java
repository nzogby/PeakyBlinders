package Project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphListener implements ActionListener{

	private JFrame _graphFrame;
	private JPanel _graphPanel;
	public SearchScreen _searchPanel;
	
	public GraphListener(SearchScreen searchPanel) {
		
		_searchPanel = searchPanel;
		
		_graphFrame = new JFrame("Graph");
		_graphFrame.setSize(600, 500);
		_graphPanel = new JPanel();
		
		_graphFrame.add(_graphPanel, BorderLayout.CENTER);
		_graphPanel.setBackground(Color.RED);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		String ticker = _searchPanel.getTicker();
		_graphPanel.removeAll();
		
		BufferedImage imageFile;
		try {
			
			imageFile = ImageIO.read(new File(ticker + ".jpeg"));
			JLabel imageLabel = new JLabel(new ImageIcon(imageFile));
			_graphPanel.add(imageLabel);
			
		} 
		
		catch (IOException e) {
			
			_graphPanel.add(new JLabel("Graph not found."));
			System.out.println("IOException.");
			
		}
		
		_graphPanel.revalidate();
		_graphPanel.repaint();
		_graphFrame.setVisible(true);
		
	}

}
