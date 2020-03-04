package ejercicio_3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.*;

public class Tablero extends JFrame {

	public Tablero() {
		
		setBounds(500, 100, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	private String[][] tablero=new String[3][3];
	
}

class Lamina extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g; 
		
		Line2D line; 
	}
	
	
}