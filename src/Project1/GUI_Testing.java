package Project1;

	import java.awt.*;
	import java.awt.event.*;
	import java.io.IOException;
	import java.net.URI;
	import java.net.URISyntaxException;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;


	public class GUI_Testing extends JFrame implements ActionListener {
		/**
		 * 
		 */
		private Label stocks;
		private TextField searchbar;
		private Button Nasdaq;
		private JFrame SearchFrame;
		
		//Stuff I am adding for later addition to master
		private String _searchie;
		private JPanel _buttons;
		private JPanel _bar;
		private JPanel _sPanel;
		
		private static final long serialVersionUID = 1L;
		public GUI_Testing() {
			setLayout(new GridLayout(3,3));
			add(_buttons = new JPanel());
			add(_bar = new JPanel());
			stocks= new Label("Stocks",JLabel.LEFT);
			_buttons.add(stocks);
			JButton j;
			_buttons.add(j = new JButton("Do Nothing"));
			j.setVisible(true);
			setSize(200,200);
			setVisible(true);
			
//			Nasdaq_Frame= new JFrame();
//			add(Nasdaq_Frame);
//			setSize(200,200);
//			setVisible(true);

			searchbar = new TextField("Type Here");
			searchbar.setEditable(true);
			_bar.add(searchbar);
			searchbar.setSize(5,10);
			searchbar.setVisible(true);
			
			searchbar.addActionListener(this);
						
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		 public static void main(String[] args) {
		      new GUI_Testing();
		      
		   }
		@Override 
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub	}
		SearchFrame = new JFrame("Searched Stock");
		SearchFrame.setSize(800, 800); SearchFrame.setVisible(true);
		_sPanel = new JPanel();
		_sPanel.setVisible(true);
		_searchie = searchbar.getText();
		Label l; _sPanel.setLayout(new GridLayout(3,3));
		_sPanel.add(l = new Label(_searchie,JLabel.CENTER));
		_sPanel.add(l = new Label("Stock Info Coming Soon",JLabel.CENTER));
		l.setVisible(true);
		l.setFont(new Font ("Monospaced", Font.BOLD, 16));
		SearchFrame.add(_sPanel);
		System.out.println(_searchie);
//		Desktop browser= Desktop.getDesktop();
//		try {
//			browser.browse(new URI("https://www.nasdaq.com/"));
//		}
//		catch(IOException err) {
//			
//		} catch (URISyntaxException err) {
//			
//			System.exit(0);
//				
//		}
	}
	}
