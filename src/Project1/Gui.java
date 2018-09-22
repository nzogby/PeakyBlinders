package Project1;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Gui extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private Label stocks;
	private TextField searchbar;
	private Button Nasdaq;
	private Button Close;
	private JFrame Nasdaq_Frame;
	
	private static final long serialVersionUID = 1L;
	public Gui() {
		stocks= new Label("Stocks",JLabel.LEFT);
		add(stocks);
		setSize(200,200);
		setVisible(true);
		
//		Nasdaq_Frame= new JFrame();
//		add(Nasdaq_Frame);
//		setSize(200,200);
//		setVisible(true);

		searchbar = new TextField(10);
		searchbar.setEditable(true);
		add(searchbar);
		setSize(15,10);
		setVisible(true);
		searchbar.addActionListener(this);

		
		
		Nasdaq= new Button("Nasdaq");
		add(Nasdaq);
		setVisible(true);
		Nasdaq.addActionListener(this);
		setTitle("NasDaq Predictor");
		setSize(550,550);
		
		setVisible(true);
		
		Close= new Button("Close");
		add(Close);
		setVisible(true);
		setSize(550,550);
		setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		System.exit(0);
			
	}
}
}
