package Project1;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;


public class Gui extends Frame implements ActionListener {
	/**
	 * 
	 */
	private Label stocks;
	private TextField searchbar;
	private Button Nasdaq;

	private static final long serialVersionUID = 1L;
	public Gui() {
		stocks= new Label("Stocks",JLabel.CENTER);
		add(stocks);
		setSize(20,20);
		setVisible(true);
	
		

		searchbar = new TextField("nas",10);
		searchbar.setEditable(true);
		add(searchbar);
		
		Nasdaq= new Button("Nasdaq");
		add(Nasdaq);
		setVisible(true);
		
		Nasdaq.addActionListener(this);
		
		setTitle("NasDaq Predictor");
		setSize(550,550);
		
		setVisible(true);
	}
	 public static void main(String[] args) {
	      new Gui();
	      
	   }
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub	}
			
	System.out.println("Success");
	Desktop browser= Desktop.getDesktop();
	try {
		browser.browse(new URI("https://www.nasdaq.com/"));
		
	}
	catch(IOException err) {
		
	} catch (URISyntaxException err) {
		// TODO Auto-generated catch block
	}
	
	System.exit(0);
}
}
