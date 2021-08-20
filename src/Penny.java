import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Graphics;

public class Penny extends EscapeObject implements MouseListener {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	int PennyMoved = 0;

	Penny(int x, int y, int width, int length) {
		super(x, y, width, length);
		speed = 25;
		if (needImage) {
			loadImage("Penny.png");

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
		if (e.getX() > 360 && e.getX() < 475) {
			if (e.getY() > 150 && e.getY() < 265) {
				if (PennyMoved < 3) {
					x += speed;
					PennyMoved = PennyMoved + 1;
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
