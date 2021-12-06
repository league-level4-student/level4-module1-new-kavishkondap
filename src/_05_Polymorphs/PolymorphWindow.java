package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


// * 1. Create new member variables for the width and height of Polymorph then 
// * initialize them in its constructor.
// * 
	
// * 2. Encapsulate the member variables of the Polymorph class. 
// * 
	
// * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
// * class with its width and height.
// * 
// * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
// * 
// * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
// * 
// * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
// * it by drawing it like the BluePolymorph.
// * 
// * 7. Create a new sub-class of the Polymorph class called MovingMorph.
// * 
// * 8. Add code to its update method to make MovingMorph objects move around
// * the screen.
// * 
// * 9. Create a MovingMorph object in your PolymorphWindow class and test it
// * by calling its draw and update methods.
// * 
// * 10. Now, delete all references to Polymorphs subclasses inside your
// * PolymorphWindow class.
// * 
// * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
// * 
// * 12. Initialize the ArrayList and add a bunch of different types of
// * Polymorph subclass objects to the ArrayList.
// * 
// * 13. Use loops to call the draw and update method for all the Polymorphs in 
// * the list.
// * 
// * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
// *  interface.
// * 
// * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
// *  clicked. Hint: MouseListener interface.
//

public class PolymorphWindow extends JPanel implements ActionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;
    
    ArrayList <Polymorph> morph = new ArrayList  ();
    MousePolymorph mouse = new MousePolymorph (50, 50, 50, 50);
    
    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addMouseMotionListener (mouse);
        window.pack();
        window.setVisible(true);
        timer = new Timer(1000 / 30, this);
        timer.start();
        for (int i = 0; i < 50; i++) {
        	if (i % 3== 0) {
        		morph.add(new MovingMorph ((int)(Math.random ()*900), (int)(Math.random ()*600), (int)(Math.random ()*75), (int)(Math.random ()*75)));
        	}else if (i % 3 == 1) {
        		morph.add(new RedPolymorph ((int)(Math.random ()*900), (int)(Math.random ()*600), (int)(Math.random ()*75), (int)(Math.random ()*75)));
        	}else {
        		morph.add(new BluePolymorph ((int)(Math.random ()*900), (int)(Math.random ()*600), (int)(Math.random ()*75), (int)(Math.random ()*75)));
        	}
        }
        
        morph.add(mouse);
    }

    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);
        for (Polymorph p : morph) {
        	p.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        for (Polymorph p : morph) {
        	p.update();
        }
    }
}
