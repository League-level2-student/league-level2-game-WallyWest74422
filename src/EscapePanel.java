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
	Font endFont;
	Font endFont2;
	Timer frameDraw;
	
	Safe Saf = new Safe(90, 390, 150,150);
	Table Lab = new Table(410, 275, 100, 50, Saf);
	Box Xob = new Box(170, 150, 50, 50, Lab);
	Suitcase Key = new Suitcase(350, 250, 120, 120, Xob);
	Batmobile Batcar = new Batmobile(165, 250, 85, 85, Key);
	Clock Clack = new Clock(320,25, 65, 65);
	Dino Rex = new Dino(450, 160, 140, 140);
	Penny Benny = new Penny(360, 150, 115, 115);
	Broom Sweep = new Broom(375, 170, 75, 75, Benny);
	Alfred Fred = new Alfred(125, 250, 150, 175, Sweep);
	Math Ematics = new Math(155, 200, 45, 45);
	Math2 School = new Math2(105, 120, 25, 25);
	Card Joker = new Card(260, 150, 90, 110);
	Robin Dick= new Robin(320, 220, 160, 175, Xob);

	EscapeManager EManager = new EscapeManager(Batcar, Clack, Saf, Fred, Lab, Xob, Sweep, Rex, Benny, Ematics, School, Key, Joker, Dick);
	public static BufferedImage image;
	public static BufferedImage image2;
	public static BufferedImage image3;
	public static BufferedImage image4;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public static boolean gameComplete = false;
	EscapePanel(){
		addKeyListener(this);
		
		menuFont = new Font("Javanese Text", Font.PLAIN, 60);
		endFont = new Font("Quest", Font.ITALIC, 60);
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
		if (needImage){
			
		 image = loadImage ("BatcaveBackground.png");  
		 image2 = loadImage("BatcaveBackground2.jpg");
		image3 = loadImage ("BatcaveBackground3.png");
		image4 = loadImage ("WayneManorBackground.jpg");
		}	
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
		}if(currentState == GAME4) {
			drawGame4State(g);
		}if (currentState == END) {
			drawEndState(g);
		}
	}



	final int MENU = 0;
	final int GAME = 1;
	final int GAME2 = 2;
	final int GAME3 = 3;
	final int GAME4 = 4;
	final int END = 5;
	int currentState = MENU;
	
	void updateMenuState() {
	}

	void updateGameState() {
	}
	
	void updateGame2State() {
	}

	void updateGame3State() {	
	}
	
	void updateGame4State() {
		
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
EManager.draw(g);
	}
	
	void drawGame2State(Graphics g) {
		 //TODO Auto-generated method stub
		if (gotImage) {
			g.drawImage(image2, 0, 0, GameHome.width, GameHome.height, null);
		} else
		{
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, GameHome.width, GameHome.height);
		}
		EManager.draw2(g);
	}
	
	void drawGame3State(Graphics g) {
		if (gotImage) {
			g.drawImage(image3, 0, 0, GameHome.width, GameHome.height, null);
		} else {
		// TODO Auto-generated method stub
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, GameHome.width, GameHome.height);
		}
		EManager.draw3(g);
	}
	
	void drawGame4State (Graphics g) {
		if (gotImage) {
			g.drawImage(image4, 0, 0, GameHome.width, GameHome.height, null);
		} else {
			// TODO Auto-generated method stub
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, GameHome.width, GameHome.height);
			}
			EManager.draw4(g);
	}

   void drawEndState(Graphics g) {
		// TODO Auto-generated method stub
	   g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, GameHome.width, GameHome.height);
		{
			g.setFont(endFont);
			g.setColor(Color.BLACK);
			g.drawString("CONGRATULATIONS! ", 70, 115);
			endFont2 = new Font("Quest", Font.PLAIN, 80);
			g.setFont(endFont2);
			g.drawString("You escaped the Batcave!", 100, 225);}
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
		} else if (currentState == GAME4) {
			updateGame4State();
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
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (currentState == GAME) {
				currentState = GAME2;
				addMouseListener(Batcar);
				addMouseListener(Clack);
				addMouseListener(Lab);
				removeMouseListener(Fred);
				removeMouseListener(Xob);
				if(gameComplete=true) {
					currentState = END;
				}
			} else if (currentState == GAME2) {
				currentState = GAME3;
				addMouseListener(Saf);
				addMouseListener(Benny);
				addMouseListener(Joker);
				addMouseListener(Rex);
				addMouseListener(Sweep);
				removeMouseListener(Batcar);
				removeMouseListener(Clack);
				removeMouseListener(Lab);
			}
				
		} if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (currentState == GAME2) {
				currentState = GAME;
				removeMouseListener(Batcar);
				removeMouseListener(Clack);
				removeMouseListener(Lab);
				addMouseListener(Fred);
				addMouseListener(Xob);
			} else if (currentState == GAME3) {
				currentState = GAME2;
				removeMouseListener(Saf);
				removeMouseListener(Benny);
				removeMouseListener(Joker);
				removeMouseListener(Rex);
				removeMouseListener(Sweep);
				addMouseListener(Batcar);
				addMouseListener(Clack);
				addMouseListener(Lab);
			}
			
		} if (e.getKeyCode() == KeyEvent.VK_UP) {
			if((Sweep.BroomTaken == 2) && (currentState == GAME)){
				currentState = GAME4;
				addMouseListener(Key);
				addMouseListener(Dick);
				removeMouseListener(Fred);
				removeMouseListener(Xob);
			}
		} if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			if(currentState == GAME4) {
				removeMouseListener(Key);
				removeMouseListener(Dick);
				addMouseListener(Fred);
				addMouseListener(Xob);
				currentState = GAME;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	BufferedImage loadImage(String imageFile) {
	    if (needImage) {
	        try {
	        	  gotImage = true;
	             return ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		  
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	    return null;
	}
}
