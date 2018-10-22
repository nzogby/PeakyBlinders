package Project1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchScreen extends JPanel{
	
	private JPanel _topLayer;
	
	private JLabel _searchtext;
	private JTextField _editArea;
	
	public SearchScreen() {
		
		setBackground(Color.BLUE);
		
		_topLayer = new JPanel();
		_topLayer.setLayout(new BoxLayout(_topLayer, BoxLayout.X_AXIS));
		_topLayer.setBackground(Color.BLUE);
		
		_searchtext = new JLabel("Enter Stock Symbol");
		_topLayer.add(_searchtext);
		
		_editArea = new JTextField("Search for your stock", 14);
		addListenerToSearchBox();
		_topLayer.add(_editArea);
		
		add(_topLayer);
		
		
	}
	
	public void addListenerToSearchBox() {
		
		_editArea.addMouseListener(new MouseAdapter() { // add MouseListener to the text box that clears the text when you click on it
		    
			@Override
		    public void mouseClicked(MouseEvent e) {
		        _editArea.setText("");
		    }
		    
		});
		
	}
		
}


