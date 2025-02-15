package java_course;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Point2D;

import javax.swing.JButton;
public class graphics
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("graphics");
		f.setSize(600,600);
		
		JButton b=new JButton("ok");
		b.setBackground(Color.green);
		b.setBounds(50,150,95,60);
		f.add(b);
		JTextArea tx=new JTextArea();
		Font font=new Font("verdana",Font.BOLD,20);
		tx.setBounds(50,350,300,50);
		tx.setBackground(Color.BLUE);
		tx.setFont(font);
		f.add(tx);
		

		
		
		
		JTextField t1;
		t1=new JTextField("learning java");
		t1.setBounds(50,400,200,30);
		t1.setFont(font);
		f.add(t1);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}
