package Project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphListener implements ActionListener{

	private JFrame _graphFrame;
	private JPanel _graphPanel;
	
	public GraphListener() {
		
		_graphFrame = new JFrame("Graph");
		_graphFrame.setSize(300, 300);
		_graphPanel = new JPanel();
		
		_graphFrame.add(_graphPanel, BorderLayout.CENTER);
		_graphPanel.setBackground(Color.RED);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		_graphFrame.setVisible(true);
		
	}

}
