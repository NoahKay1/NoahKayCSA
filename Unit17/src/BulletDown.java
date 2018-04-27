import java.awt.Color;
import java.awt.Graphics;

public class BulletDown extends Ammo {
	public BulletDown(int i, int y, int j) {
		super(i,y,j);
	}

	@Override
	public void move() {
		
			setY(getY() + getSpeed());
		
	}
	
}
