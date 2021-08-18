import java.awt.Graphics;
public class EscapeManager {
Batmobile Batcar;
Clock Clack;
Safe Saf;
Alfred Fred;
Table Lab;
Box Xob;
Broom Sweep;
Penny Benny;

EscapeManager(Batmobile a, Clock b, Safe c, Alfred d, Table e, Box f, Broom g, Penny h) {
	Batcar = a;
	Clack = b;
	Saf = c;
	Fred = d;
	Lab = e;
	Xob = f;
	Sweep = g;
	Benny = h;
}

void update() {
	Batcar.update();
	Clack.update();
	Saf.update();
	Fred.update();
	Lab.update();
	Xob.update();
	Sweep.update();
	Benny.update();
	}

public void draw(Graphics g) {
		// TODO Auto-generated method stub
Fred.draw(g);
Xob.draw(g);
	}
public void draw2(Graphics g) {
	Batcar.draw(g);
	Clack.draw(g);
	Lab.draw(g);
}
public void draw3(Graphics g) {
	Saf.draw(g);
	Sweep.draw(g);
	Benny.draw(g);

}

}
