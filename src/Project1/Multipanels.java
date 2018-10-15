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
		JPanel _leftPanel = new JPanel();
		
		JPanel _menuPanel= new MenuScreen(); // bottom panel
		JPanel _searchPanel = new JPanel(); // left panel
		JPanel _stockPanel= new StocksScreen(); // right panel
		JButton click= new JButton("Menu");
		
		JLabel searchtext = new JLabel("Stock Search Bar");
		JLabel stockpanel = new JLabel ("Stock Panel");
		JLabel Sectors1 = new JLabel("Sectors");
			JButton J = new JButton("Sector 1");
	
		JButton K = new JButton("Sector 2");
		JButton L = new JButton("Sector 3");
		JButton M = new JButton("Panel");
		


		JTextField editArea = new JTextField("Search for your stock", 14); // text box
	//	editArea.addActionListener(new ActionListener());
	
		
		
		
		Multipanels(){
		
			_stockPanel.add((Sectors1),BorderLayout.WEST); // add jlabel saying "Sectors"
			
			_searchPanel.add(searchtext); // add jlabel saying "Search Bar" to left panel
			
			_searchPanel.setBackground(Color.BLUE); // give left panel a blue background
			
			window.add(_stockPanel, BorderLayout.EAST); // add right panel
			
			_leftPanel.setLayout(new BoxLayout(_leftPanel, BoxLayout.Y_AXIS));
			_leftPanel.add(_searchPanel);
			_leftPanel.add(_menuPanel);
			_leftPanel.setVisible(true);
			
			window.add(_leftPanel, BorderLayout.WEST);
			
			_stockPanel.add(J,BorderLayout.EAST); // add button to right panel saying "Sector 1"
			
			_searchPanel.add(editArea); // give left panel a text box
			K.setSize(4, 5); // set size of button saying "Sector 2"
			K.setAlignmentX(Component.RIGHT_ALIGNMENT);
			
			_stockPanel.add(K,BorderLayout.LINE_START); // add button saying "Sector 2"
			_stockPanel.add(L,BorderLayout.CENTER); // add button saying "Sector 3"
			
			window.setSize(600,600); // set size of jframe
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.setResizable(false); // not resizable
			
			editArea.addMouseListener(new MouseAdapter() { // add MouseListener to the text box that clears the text when you click on it
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