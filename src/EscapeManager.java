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
Math Ematics;
Math2 School;

EscapeManager(Batmobile a, Clock b, Safe c, Alfred d, Table e, Box f, Broom g, Penny h, Math i, Math2 j) {
	Batcar = a;
	Clack = b;
	Saf = c;
	Fred = d;
	Lab = e;
	Xob = f;
	Sweep = g;
	Benny = h;
	Ematics = i;
	School = j;
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
	Ematics.update();
	School.update();
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
	School.draw(g);
}
public void draw3(Graphics g) {
	Saf.draw(g);
	Sweep.draw(g);
	Benny.draw(g);
	Ematics.draw(g);
}
public void draw4(Graphics g) {
	
}

}
