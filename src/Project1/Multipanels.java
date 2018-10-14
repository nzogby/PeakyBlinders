package Project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Multipanels implements ActionListener{

		JFrame window = new JFrame("Stock Predictor");
		JPanel panel_01= new JPanel();
		JPanel panel_02 = new JPanel();
		JPanel panel_03= new JPanel();
		JButton click= new JButton("Menu");
		JLabel searchtext = new JLabel("Search Bar");
		JLabel stockpanel = new JLabel ("Stock Panel");
		JLabel Sectors1 = new JLabel("Sectors");
			JButton J = new JButton("Sector 1");
	
		JButton K = new JButton("Sector 2");
		JButton L = new JButton("Sector 3");
		JButton M = new JButton("Panel");
		


		JTextField editArea = new JTextField("Search for your stock",14);
	//	editArea.addActionListener(new ActionListener());
	
		
		
		
		Multipanels(){
		
			panel_01.setBackground(Color.DARK_GRAY);
			panel_01.add(M);
			panel_03.add((Sectors1),BorderLayout.WEST);
			stockpanel.setForeground(Color.blue);
			panel_01.add(stockpanel);
			panel_02.add(searchtext);
			
			panel_02.setBackground(Color.BLUE);
			panel_03.setBackground(Color.GREEN);
			window.add(panel_03,BorderLayout.EAST);
			window.add(panel_01,BorderLayout.PAGE_END);
			window.add(panel_02, BorderLayout.WEST);
			panel_03.add(J,BorderLayout.EAST);
			
			panel_02.add(editArea);
			K.setSize(4, 5);
			K.setAlignmentX(Component.RIGHT_ALIGNMENT);
			panel_03.add(K,BorderLayout.LINE_START);
			panel_03.add(L,BorderLayout.CENTER);
			window.setSize(600,600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.setResizable(false);
			BackGroundImage b = new BackGroundImage();
			window.add(b);
			editArea.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(MouseEvent e) {
			        editArea.setText("");
			    }
			});
				}
			
			
		
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
		
