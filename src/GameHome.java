//Clock on second screen will give code to unlock a safe on third screen, which will contain Batman's Mug. 
//Using the lab table with the mug will create a copy of Batman's fingerprint.
//The fingerprint will give access to a box, which will contain the remote to the Bat-Signal.
//Moving the giant penny three times will reveal Alfred's broom. 
//Giving it to him will unlock a fourth screen.
//Clicking on one of the couch cushions on the fourth screen will give the player a batarang. 
//Giving the batarang and the remote to the Bat-Signal will reveal a locked suitcase to the player.
//Once the correct code (taken from numbers throughout the first three screens) is entered, the suitcase will give the player the key to the Batmobile.
//The Batmobile can be clicked after the key is found to win the game and escape the Batcave.



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameHome implements ActionListener {
	public static void main(String[] args) {
		GameHome GameHome = new GameHome();
		GameHome.setup();
	}
JFrame frame;
JButton button;
JButton button2;
EscapePanel EPanel;
public static final	int width = 600;
public static final	int height = 600;
GameHome(){
	frame = new JFrame();
	button = new JButton("PLAY");
	button2 = new JButton("INSTRUCTIONS");
	EPanel = new EscapePanel();
	EPanel.setLayout(null);
	button.setBounds(200, 400, 200, 75);
	button2.setBounds(200, 310, 200, 75);
}
void setup() {
	frame.add(EPanel);
	EPanel.add(button);
	EPanel.add(button2);
	button.addActionListener(this);
	button2.addActionListener(this);
	frame.setSize(width, height);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.addKeyListener(EPanel);
}
@Override
public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
		if (EPanel.currentState == EPanel.MENU) {
			EPanel.currentState = EPanel.GAME;
			EPanel.remove(button);
			EPanel.remove(button2);
			frame.requestFocus();
		}
	} else if (e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, "Click on objects to find clues, which you can use to help you escape the Batcave. Use the Left and Right arrow keys to traverse between the different rooms. Good Luck ;)");
	}
}
}
