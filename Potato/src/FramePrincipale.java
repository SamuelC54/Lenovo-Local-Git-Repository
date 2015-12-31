import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class FramePrincipale extends JFrame implements Runnable {
	private BufferedImage image;
	
	public FramePrincipale(){
		
		try {                
	    	image = ImageIO.read(new File(System.getProperty("user.dir")+"\\src\\potato.jpg"));
		} catch (IOException ex) {
			System.out.println("fail to open image");
		}
	}
	
	public void run() {
		
		this.setSize(new Dimension(700,400));
        setResizable(false);
        setTitle("Potato");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
