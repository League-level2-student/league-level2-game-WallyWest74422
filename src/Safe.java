import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Safe extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	Boolean opened = false;
	Safe(int x, int y, int width, int length){
		super(x, y, width, length);
		speed =10;
	if (needImage) {
		    loadImage ("Safe.png");
		
	}
	}
	void update() {
		super.update();
	}
void draw(Graphics g) {
     if (gotImage) {
    		g.drawImage(image, x, y, width, height, null);
    	} else {
    		g.setColor(Color.BLUE);
    		g.fillRect(x, y, width, height);
    	}
}
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getX()>90 && e.getX()<240) {
		if(e.getY()>390 && e.getY()<540) {
			String answer =	 JOptionPane.showInputDialog("Please enter the 4-digit (No spaces) code to to unlock the safe.");
			int code = Integer.parseInt(answer);
			if (code == 1155) {
				System.out.println("Opened is true.");
				JOptionPane.showMessageDialog(null, "Opened is true.");
				//JOptionPane.showMessageDialog(null, "You found Batman's mug inside the safe!");
				opened = true;
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, that wasn't correct!");

			}
			}
		}
	}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
