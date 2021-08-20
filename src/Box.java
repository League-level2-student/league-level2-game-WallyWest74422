import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;

class Box extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	private Table table;
	int BoxOpened = 0;

	Box(int x, int y, int width, int length, Table table) {
		super(x, y, width, length);
		speed = 10;
		this.table = table;
		if (needImage) {
			loadImage("Box.png");

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
		if (e.getX() > 170 && e.getX() < 220) {
			if (e.getY() > 150 && e.getY() < 200) {
				if (BoxOpened < 2) {
					if (table.Science > 0) {
						JOptionPane.showMessageDialog(null,
								"You used the fingerprint to open the box and found the remote to the Bat Signal.");
						BoxOpened = BoxOpened + 1;
					} else {
						JOptionPane.showMessageDialog(null, "This box requires a fingerprint to unlock.");
					}
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
