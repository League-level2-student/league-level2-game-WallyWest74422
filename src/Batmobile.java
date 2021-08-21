import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Batmobile extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	private Suitcase suitcase;

	Batmobile(int x, int y, int width, int length, Suitcase suitcase) {
		super(x, y, width, length);
		speed = 10;
		this.suitcase = suitcase;
		if (needImage) {
			loadImage("Batmobile.png");

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
		if (e.getX() > 165 && e.getX() < 250) {
			if (e.getY() > 250 && e.getY() < 335) {
				if (suitcase.suitcaseOpened == false) {
					JOptionPane.showMessageDialog(null, "Looks like you need a key to turn it on.");
				}else if(suitcase.suitcaseOpened == true){
					JOptionPane.showMessageDialog(null, "You used the Batmobile to break out of the Batcave!");
					EscapePanel.gameComplete = true;
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
