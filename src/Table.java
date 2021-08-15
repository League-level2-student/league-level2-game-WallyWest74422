import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Table extends EscapeObject implements MouseListener{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	private Safe safe;
	Table(int x, int y, int width, int length, Safe safe) {
		super(x, y, width, length);
		speed =10;
		this.safe = safe;
		if (needImage) {
			    loadImage ("Table.png");
			
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
	if (e.getX()>410 && e.getX()<510) {
		if(e.getY()>275 && e.getY()<325) {
			System.out.println("Table is being clicked.");
			if(safe.opened) {
				JOptionPane.showMessageDialog(null, "You used Batman's mug to make a copy of Batman's fingerprint!");
				System.out.println("Everything works!");
			}else {
				JOptionPane.showMessageDialog(null, "Looks like some sort of lab equipment.");
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
