import java.awt.Color;
import java.awt.Graphics;

public class BulletRight extends Ammo {
	public BulletRight(int i, int y, int j) {
		super(i,y,j);
	}

	@Override
	public void move() {
		
			setX(getX() + getSpeed());
		
	}
	@Override
	public void draw(Graphics window) {
		window.setColor(Color.PINK);
		window.fillRect(getX(), getY(), 15, 5);
	}
}
