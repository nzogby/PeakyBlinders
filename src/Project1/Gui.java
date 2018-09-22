package Project1;
import java.awt.*;
import java.awt.event.*;


public class Gui extends Frame implements ActionListener {
	/**
	 * 
	 */
	private Label stocks;
	private TextField searchbar;
	private Button Nasdaq;

	private static final long serialVersionUID = 1L;
	public Gui() {
		stocks= new Label("Stocks");
		add(stocks);
		

		searchbar = new TextField("",10);
		searchbar.setEditable(true);
		add(searchbar);
		
		Nasdaq= new Button("Nasdaq");
		add(Nasdaq);
		setVisible(true);
		
		Nasdaq.addActionListener(this);
		
		setTitle("NasDaq Predictor");
		setSize(1000,550);
		
		setVisible(true);
	}
	 public static void main(String[] args) {
	      new Gui();
	      
	   }
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub	}
			
	System.out.println("Success");
	
}
}
