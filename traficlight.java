package oopj24csb52;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
public class traficLight extends JFrame implements ActionListener{
	Color r_ed,g_reen,yello_w;
	JRadioButton radio1,radio2,radio3;
	traficLight(){
		radio1 = new JRadioButton("RED");
		radio2 = new JRadioButton("GREEN");
		radio3 = new JRadioButton("YELLOW");
		JPanel pael = new JPanel();
		ButtonGroup group = new ButtonGroup();
		
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		radio1.setBounds(100, 60, 60, 10);
		radio2.setBounds(120, 50,20, 10);
		radio3.setBounds(140, 30, 20, 10);

		pael.add(radio1);
		pael.add(radio2);
		pael.add(radio3);
		
		add(pael);
		
		r_ed = getBackground();
		g_reen = getBackground();
		yello_w = getBackground();
		
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
		radio1.addActionListener(this);
		radio2.addActionListener(this);
		radio3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(radio1.isSelected()) {
			r_ed = Color.red;
			g_reen = getBackground();
			yello_w = getBackground();
		}else if(radio2.isSelected()) {
			g_reen = Color.green;
			r_ed = getBackground();
			yello_w = getBackground();
		}else if(radio3.isSelected()) {
			r_ed = getBackground();
			g_reen = getBackground();
			yello_w = Color.orange;
		}
		repaint();
	}
	public void paint(Graphics g) {
		super.paint(g);
		//this line calls the super class implementation of paint method which clears the 
		// Previous drawings and prepares the component for fresh drawing 
		g.drawOval(50, 100, 50, 50);
		g.drawOval(50, 160, 50, 50);
		g.drawOval(50, 220, 50, 50);
		g.setColor(r_ed);
		g.fillOval(50, 100, 50, 50);
		g.setColor(yello_w);
		g.fillOval(50, 160, 50, 50);
		g.setColor(g_reen);
		g.fillOval(50, 220, 50, 50);
		
	}
	
	public static void main(String[] args) {
		new traficLight();
	}
}
