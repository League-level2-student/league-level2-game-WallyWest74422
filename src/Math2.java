import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.Graphics;
public class Math2 extends EscapeObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	Math2(int x, int y, int width, int length) {
		super(x, y, width, length);
		speed = 25;
		if (needImage) {
			loadImage("12.jpg");

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

	
}
