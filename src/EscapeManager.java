import java.awt.Graphics;
public class EscapeManager {
Batmobile Batcar;
Clock Clack;
Safe Saf;
Alfred Fred;
Table Lab;
//int fingerprint;
EscapeManager(Batmobile x, Clock y, Safe z, Alfred a, Table t) {
	Batcar = x;
	Clack = y;
	Saf = z;
	Fred = a;
	Lab = t;
	//fingerprint = f;
}
void update() {
	Batcar.update();
	Clack.update();
	Saf.update();
	Fred.update();
	Lab.update();
	}

public void draw(Graphics g) {
		// TODO Auto-generated method stub
Fred.draw(g);
	}
public void draw2(Graphics g) {
	Batcar.draw(g);
	Clack.draw(g);
	Lab.draw(g);
}
public void draw3(Graphics g) {
	Saf.draw(g);
}

}
