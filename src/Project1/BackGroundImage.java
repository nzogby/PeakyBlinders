package Project1;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class BackGroundImage extends Canvas{
	Image img;
	
	public BackGroundImage() {
		img= Toolkit.getDefaultToolkit().getImage("C:/Images/logo.jpg");
	}
		public void paint(Graphics g) {
			int width= getSize().width;
			int height = getSize().height;
		
			Graphics2D g2 = (Graphics2D)g;
			g2.drawImage(img, 0, 0, width, height, this);

}
}