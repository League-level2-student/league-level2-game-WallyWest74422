import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Alfred extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	private Broom broom;

	Alfred(int x, int y, int width, int length, Broom broom) {
		super(x, y, width, length);
		speed = 10;
		this.broom = broom;
		if (needImage) {
			loadImage("Alfred.png");

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
		if (e.getX() > 155 && e.getX() < 230) {
			if (e.getY() > 250 && e.getY() < 425) {
				if(broom.BroomTaken ==1) {
					JOptionPane.showMessageDialog(null, "Thank you so much! Here is the key to Wayne Manor. Use the UP key to access it." );
					broom.BroomTaken =2;
				}else if (broom.BroomTaken==0){
				JOptionPane.showMessageDialog(null, "I will help you if you can return my broom to me!");
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
