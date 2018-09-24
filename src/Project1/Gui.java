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

import Project1.Gui.Action;


	public class Gui extends JFrame implements ActionListener {
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
		public Gui() {
			setLayout(new GridLayout(3,3));
			add(_buttons = new JPanel());
			add(_bar = new JPanel());
			stocks= new Label("Stocks",JLabel.LEFT);
			setSize(800,600);
			setVisible(true);
			
//			Nasdaq_Frame= new JFrame();
//			add(Nasdaq_Frame);
//			setSize(200,200);
//			setVisible(true);

			searchbar = new TextField("Type Here");
			searchbar.setEditable(true);
			_bar.add(searchbar);
			searchbar.setSize(5,25);
			searchbar.setVisible(true);
			searchbar.addMouseListener(new MouseAdapter() {
				  @Override
				  public void mouseClicked(MouseEvent e) {
				    searchbar.setText("");
				  }
				});
			searchbar.addActionListener(this);
						
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			JButton Menu;
			
			_buttons.add(Menu= new JButton("Menu To be"));
			Menu.setVisible(true);
			setSize(200,200);
			setVisible(true);
			Menu.addActionListener(new Action());
			//searchbar.addTextListener(new Text());
			
		}static class Action implements ActionListener{
				
				public void actionPerformed (ActionEvent e) {
					JFrame menuframe = new JFrame("Menu to be");
					menuframe.setVisible(true);
					menuframe.setSize(750,750);
					JLabel menulabel= new JLabel("Menu that does nothing");
					JPanel menupanel = new JPanel();
					menuframe.add(menupanel);
					menupanel.add(menulabel);
				}
				
			
		}
		 public static void main(String[] args) {
		      new Gui();
		      
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

	}
	}
