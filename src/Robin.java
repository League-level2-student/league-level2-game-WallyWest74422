import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;

public class Robin extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	private Box box;
	Boolean batarangFound = false;
	Robin(int x, int y, int width, int length, Box box) {
		super(x, y, width, length);
		speed = 100;
		this.box=box;
		if (needImage) {
			loadImage("Robin.png");

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
		if (e.getX() > 330 && e.getX() < 480) {
			if (e.getY() > 220 && e.getY() < 385) {
				if(box.BoxOpened==0) {
					JOptionPane.showMessageDialog(null, "Batman needs my help! Can you help me find the remote to the Bat-Signal and my Batarang?");
				}else if((box.BoxOpened<5)&&(batarangFound == false)) {
					JOptionPane.showMessageDialog(null, "Batman needs my help! Can you help me find the remote to the Bat-Signal and my Batarang?");
				}else if ((box.BoxOpened<5)&& (batarangFound == true)){
					JOptionPane.showMessageDialog(null, "Thanks! Before I go, here's Batman's suitcase. I wasn't able to unlock it, but it might be of use to you.");
					x+=speed;
					x+=speed;
					x+=speed;
					box.BoxOpened = 10;
				}
			}
		}
		if (e.getX() > 220 && e.getX() < 270) {
			if (e.getY() > 300 && e.getY() < 380) {
				if(batarangFound == false) {
					JOptionPane.showMessageDialog(null, "You found a batarang inside the couch cushion!");
					batarangFound = true;
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
