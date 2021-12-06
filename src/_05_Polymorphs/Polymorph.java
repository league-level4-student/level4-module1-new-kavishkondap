package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public int getX () {
    	return x;
    }
    
    public int getY () {
    	return y;
    }
    
    public void setX (int val) {
    	x = val;
    }
    
    public void setY (int val) {
    	y = val;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
