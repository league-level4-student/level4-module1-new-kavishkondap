package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public static void scaryPopup () {
		JOptionPane.showMessageDialog(null, "YOU HAVE TRIGGERED A CRITICAL COMPUTER ERROR");
	}


    public static void testPositive (int num) throws Exception{
    	if (num < 0) {
    		throw new NegativeNumberException ();
    	}
    }
    
    public static void main(String[] args) {
		try {
			testPositive (-15);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			scaryPopup();
		}catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JOptionPane.showMessageDialog(null, "DON'T WORRY, YOUR COMPUTER IS OKAY");
		}
	}
}