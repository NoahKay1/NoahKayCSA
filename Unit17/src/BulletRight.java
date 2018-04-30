import java.awt.Color;
import java.awt.Graphics;

public class BulletRight extends Ammo {
	private int loc;
	public BulletRight(int i, int y, int j) {
		super(i,y,j);
	}

	@Override
	public void move() {
		
			setX(getX() + getSpeed());
		
	}
	@Override
	public void draw(Graphics window) {
		
		if (loc == 0){ window.setColor(Color.RED); loc = 1;}
		else if (loc == 1){ window.setColor(Color.ORANGE); loc = 2;}
		else if (loc == 2){ window.setColor(Color.YELLOW); loc = 3;}
		else if (loc == 3){ window.setColor(Color.GREEN); loc = 4;}
		else if (loc == 4){ window.setColor(Color.BLUE); loc = 5;}
		else if (loc == 5){ window.setColor(Color.CYAN); loc = 0;}
		window.fillRect(getX(), getY(), 15, 5);
	}
}
