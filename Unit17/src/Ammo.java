//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public abstract class Ammo extends MovingThing
{
	private int speed;
	private int loc;

	public Ammo() {
		this(0, 0, 5);
	}

	public Ammo(int x, int y) {
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) {
		setPos(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		loc = 0;
		if (loc == 0){ window.setColor(Color.RED); loc = 1;}
		else if (loc == 1){ window.setColor(Color.ORANGE); loc = 2;}
		else if (loc == 2){ window.setColor(Color.YELLOW); loc = 3;}
		else if (loc == 3){ window.setColor(Color.GREEN); loc = 4;}
		else if (loc == 4){ window.setColor(Color.BLUE); loc = 5;}
		else if (loc == 5){ window.setColor(Color.CYAN); loc = 0;}
		
		window.fillRect(getX(), getY(), 5, 15);
	}

	public abstract void move();

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}
