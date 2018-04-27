import java.awt.Color;
import java.awt.Graphics;

public class BulletUp extends Ammo {
	public BulletUp(int i, int y, int j) {
		super(i,y,j);
	}

	@Override
	public void move() {
		
			setY(getY() - getSpeed());
		
	}
	
}
