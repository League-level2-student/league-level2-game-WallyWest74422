import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class EscapePanel extends JPanel implements KeyListener, ActionListener{
	
	Font menuFont;
	Font menuFont2;
	Timer frameDraw;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	EscapePanel(){
		addKeyListener(this);
		menuFont = new Font("Javanese Text", Font.PLAIN, 60);
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
		if (needImage){//&& (currentState == GAME)) {	
		    loadImage ("BatcaveBackground.png");
		} //else if ((needImage) && (currentState == GAME2)) {
			//loadImage ("BatcaveBackground2.png");
	//	}
	}
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} if (currentState == GAME) {
			drawGameState(g);
		}  if (currentState == GAME2) {
			drawGame2State(g);
		} if (currentState == GAME3) {
			drawGame3State(g);
		}if (currentState == END) {
			drawEndState(g);
		}
	}



	final int MENU = 0;
	final int GAME = 1;
	final int GAME2 = 2;
	final int GAME3 = 3;
	final int END = 4;
	int currentState = MENU;
	
	void updateMenuState() {
	}

	void updateGameState() {
	}
	
	void updateGame2State() {
	}

	void updateGame3State() {	
	}
	
	void updateEndState() {
	}
	
	void drawMenuState(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, GameHome.width, GameHome.height);
		{
			g.setFont(menuFont);
			g.setColor(Color.BLACK);
			g.drawString("ESCAPE   THE ", 70, 115);
			menuFont2 = new Font("Lucida Bright", Font.PLAIN, 80);
			g.setFont(menuFont2);
			g.drawString("BATCAVE", 100, 225);

		}
	}
	
	void drawGameState(Graphics g) {
		// TODO Auto-generated method stub
		if (gotImage) {
			g.drawImage(image, 0, 0, GameHome.width, GameHome.height, null);
		} else
		{
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, GameHome.width, GameHome.height);
		}
		//EscapeManager.draw(g);
	}
	
	void drawGame2State(Graphics g) {
		// TODO Auto-generated method stub
		//if (gotImage) {
		//	g.drawImage(image, 0, 0, GameHome.width, GameHome.height, null);
		//} else
		{
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, GameHome.width, GameHome.height);
		}
	}
	
	void drawGame3State(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	void drawEndState(Graphics g) {
		// TODO Auto-generated method stub
		
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//System.out.println(currentState);
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == GAME) {
			updateGameState();
		} else if (currentState == GAME2) {
			updateGame2State();
		} else if (currentState == GAME3) {
			updateGame3State();
		} else if (currentState == END) {
			updateEndState();
		}
		repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (currentState == GAME) {
				currentState = GAME2;
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
