import java.awt.Rectangle;

public class EscapeObject {
	 int x;
	 int y;
	 int width;
	 int height;
	 int speed = 0;
	 boolean isActive = true;
	 Rectangle collisionBox;
EscapeObject(int x, int y, int width, int length){
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=length;
	collisionBox = new Rectangle(x, y, width, length);
}
void update(){
	collisionBox.setBounds(x, y, width, height);
}
}
