package Project1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchScreen extends JPanel{
	
	private JPanel _topLayer;
	
	private JLabel _prompt;
	private JTextField _searchBox;
	private JButton _searchButton;
	
	public SearchScreen() {
		
		setBackground(Color.BLUE);
		
		_topLayer = new JPanel();
		_topLayer.setLayout(new BoxLayout(_topLayer, BoxLayout.X_AXIS));
		_topLayer.setBackground(Color.BLUE);
		
		_prompt = new JLabel("Enter: ");
		_topLayer.add(_prompt);
		
		_searchBox = new JTextField("Search for your stock", 14);
		addListenerToSearchBox();
		_topLayer.add(_searchBox);
		
		_searchButton = new JButton("Search");
		_topLayer.add(_searchButton);
		
		add(_topLayer);
		
	}
	
	public void addListenerToSearchBox() {
		
		_searchBox.addMouseListener(new MouseAdapter() { // add MouseListener to the text box that clears the text when you click on it
		    
			@Override
		    public void mouseClicked(MouseEvent e) {
		        _searchBox.setText("");
		    }
		    
		});
		
	}
	
	public JTextField getSearchBox() {return _searchBox;}
	
	public String getTicker() {return _searchBox.getText();}
	
	public JButton getSearchButton() {return _searchButton;}
		
}


