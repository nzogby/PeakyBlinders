package Project1;

import java.awt.BorderLayout;
	
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javafx.scene.text.Font;


public class Multipanels extends StocksScreen implements ActionListener  {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JFrame _window = new JFrame("Stock Predictor");
		JPanel _leftPanel = new JPanel();
		JButton _themebutton = new JButton("Theme Select");
		MenuScreen _menuPanel = new MenuScreen();
		SearchScreen _searchPanel = new SearchScreen();
		StocksScreen _stockPanel = new StocksScreen();
		StocksScreen _topLayer = new StocksScreen();
		
		
	
		public Multipanels(){
			
			_window.add(_stockPanel, BorderLayout.EAST);
			
			_leftPanel.setLayout(new BoxLayout(_leftPanel, BoxLayout.Y_AXIS));
			_leftPanel.add(_searchPanel);
			_leftPanel.add(_themebutton, BorderLayout.EAST);
			_leftPanel.add(_menuPanel);
			_leftPanel.setVisible(true);
			_window.add(_leftPanel, BorderLayout.WEST);
			
			_window.setSize(600,600);
			_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			_window.setVisible(true);
			_window.setResizable(false);
			_themebutton.addActionListener(new ActionListener(){
				
//Theme one
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame ThemeFrame = new JFrame("Themes Selector");
					JPanel ThemePanel = new JPanel();
					JButton Theme1 = new JButton("Theme 1");
					Theme1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							_leftPanel.setBackground(Color.decode("#A3D9FF"));
							_searchPanel.setBackground(Color.decode("#7E6B8F"));
							_menuPanel.setBackground(Color.decode("#96E6B3"));
							_stockPanel.setBackground(Color.decode("#F2E94E"));
							_scrollPanel.setBackground(Color.blue);
							java.awt.Font currentFont = Theme1.getFont();
							java.awt.Font newFont = currentFont.deriveFont(java.awt.Font.ITALIC,24f);
							Theme1.setFont(newFont);
						}
						
					});
//Theme Two
					JButton Theme2 = new JButton("Theme 2");
					
					Theme2.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							_scrollPanel.setBackground(Color.decode("#F02D3A"));
						_leftPanel.setBackground(Color.red);

							_searchPanel.setBackground(Color.decode("#DD0426"));
							_menuPanel.setBackground(Color.decode("#9197AE"));
							_searchPanel.setBackground(Color.decode("#273043"));
							java.awt.Font currentFont = Theme2.getFont();
							java.awt.Font newFont = currentFont.deriveFont(java.awt.Font.ITALIC,24f);
							Theme2.setFont(newFont);
							
						}
						
					});
					
//Theme Three
					JButton Theme3 = new JButton("Theme 3");
					Theme3.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							
							// TODO Auto-generated method stub
							_leftPanel.setBackground(Color.decode("#0197F6"));
							_searchPanel.setBackground(Color.decode("#02182B"));
							_menuPanel.setBackground(Color.decode("#7FCDCD"));
							_stockPanel.setBackground(Color.blue);
							java.awt.Font currentFont = Theme3.getFont();
							java.awt.Font newFont = currentFont.deriveFont(java.awt.Font.ITALIC,24f);
							Theme3.setFont(newFont);
							//techButton.setFont(newFont);
							
									
							
						}			
						
						
					});
					ThemeFrame.add(ThemePanel);
					ThemePanel.add(Theme1);
					ThemePanel.add(Theme2);
					ThemePanel.add(Theme3);
					ThemePanel.setBackground(Color.decode("#7FCDCD"));
					ThemeFrame.setSize(500, 500);
					ThemeFrame.setVisible(true);
					ThemeFrame.setResizable(false);
					ThemeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					
				}
			});

			
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
