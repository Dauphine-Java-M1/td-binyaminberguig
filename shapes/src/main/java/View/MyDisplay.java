package View;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MyDisplay extends JPanel{
	@Override 
	public void paintComponent(Graphics g) {
		System.out.println("j'apparais");
		super.paintComponent(g);
		g.drawLine(0,20,1000,2000);
		
	}
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500)); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}

}
