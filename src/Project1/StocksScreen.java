package Project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class StocksScreen extends JPanel{

	JPanel _topLayer;
	JPanel _scrollPanel;
	protected JLabel Sectors1;
	JButton materialsButton = new JButton("Basic Materials");
	JButton energyButton = new JButton("Energy");
	JButton techButton = new JButton("Tech");


	
	public StocksScreen() {

		//setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(new Color(0, 153, 0));
		
		_scrollPanel = new JPanel();
		_scrollPanel.setLayout(new BoxLayout(_scrollPanel, BoxLayout.Y_AXIS));
		//_scrollPanel.setBackground(new Color(0, 153, 0));
		_scrollPanel.setBackground(Color.decode("#F02D3A"));

		JScrollPane scrollPane = new JScrollPane(_scrollPanel);
		
		initializeTopLayer();
		add(scrollPane);
		setVisible(true);

	}

	 public void initializeTopLayer() {
		
		Sectors1 = new JLabel("Sectors:");
		
		_topLayer = new JPanel();
		_topLayer.setLayout(new BoxLayout(_topLayer, BoxLayout.X_AXIS));
		_topLayer.add((Sectors1),BorderLayout.WEST);
		
		materialsButton.addActionListener(new SectorListener(materialsButton.getText(), _scrollPanel));
		_topLayer.add(materialsButton, BorderLayout.EAST);
		
		energyButton.setSize(4, 5); // set size of button saying "Sector 2"
		energyButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		energyButton.addActionListener(new SectorListener(energyButton.getText(), _scrollPanel));
		_topLayer.add(energyButton, BorderLayout.LINE_START);
		
		techButton.addActionListener(new SectorListener(techButton.getText(), _scrollPanel));
		_topLayer.add(techButton, BorderLayout.CENTER);
		_topLayer.setBackground(Color.decode("#F02D3A"));

		//_topLayer.setBackground(new Color(0, 153, 0));
		_topLayer.setVisible(true);
		
		add(_topLayer);
		
	}
	
}