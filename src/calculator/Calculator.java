package calculator;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 * @author Benjamin L. Dundas
 *
 */
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ben Dundas's Calculator");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		
		GridLayout gl = new GridLayout(4,4);
		frame.setLayout(gl);
		gl.setHgap(10);
		gl.setVgap(10);
		
		JTextField displayScreen = new JTextField("0");
		frame.add(displayScreen);
		
		JButton btnZero = new JButton ("0");
		JButton btnOne = new JButton ("1");
		JButton btnTwo = new JButton ("2");
		JButton btnThree = new JButton ("3");
		JButton btnFour = new JButton ("4");
		JButton btnFive = new JButton ("5");
		JButton btnSix = new JButton ("6");
		JButton btnSeven = new JButton ("7");
		JButton btnEight = new JButton ("8");
		JButton btnNine = new JButton ("9");
		JButton btnPlus = new JButton ("+");
		JButton btnMinus = new JButton ("-");
		JButton btnMultiply = new JButton ("*");
		JButton btnDivide = new JButton ("/");
		JButton btnEquals = new JButton ("=");
		
		frame.add(btnSeven);
		frame.add(btnEight);
		frame.add(btnNine);
		frame.add(btnDivide);
		frame.add(btnFour);
		frame.add(btnFive);
		frame.add(btnSix);
		frame.add(btnMultiply);
		frame.add(btnOne);
		frame.add(btnTwo);
		frame.add(btnThree);
		frame.add(btnMinus);
		frame.add(btnPlus);
		frame.add(btnZero);
		frame.add(btnEquals);
		
		
	}

}
