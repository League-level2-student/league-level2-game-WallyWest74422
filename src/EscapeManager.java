import java.awt.Graphics;
public class EscapeManager {
Batmobile Batcar;
Clock Clack;
Safe Saf;
Alfred Fred;
Table Lab;
Box Xob;
Broom Sweep;
Dino Rex;
Penny Benny;
Math Ematics;
Math2 School;
Suitcase Key;
Card Joker;
Robin Dick;
Computer Laptop;

EscapeManager(Batmobile a, Clock b, Safe c, Alfred d, Table e, Box f, Broom g, Dino h, Penny i, Math j, Math2 k, Suitcase l, Card m, Robin n, Computer o) {
	Batcar = a;
	Clack = b;
	Saf = c;
	Fred = d;
	Lab = e;
	Xob = f;
	Sweep = g;
	Rex = h;
	Benny = i;
	Ematics = j;
	School = k;
	Key = l;
	Joker = m;
	Dick = n;
	Laptop = o;
}

void update() {
	Batcar.update();
	Clack.update();
	Saf.update();
	Fred.update();
	Lab.update();
	Xob.update();
	Sweep.update();
	Rex.update();
	Benny.update();
	Ematics.update();
	School.update();
	Key.update();
	Joker.update();
	Dick.update();
	Laptop.update();
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
	Rex.draw(g);
	Benny.draw(g);
	Ematics.draw(g);
	Joker.draw(g);
}
public void draw4(Graphics g) {
	Key.draw(g);
	Dick.draw(g);
	Laptop.draw(g);
}

}
