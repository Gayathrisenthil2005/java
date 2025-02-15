package java_course;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.JButton;
public class graphics1
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("graphics");
		f.setSize(600,600);
		
		JButton b=new JButton("copy");
		b.setBackground(Color.green);
		b.setBounds(250,450,95,60);
		f.add(b);
		JTextField tx=new JTextField();
		tx.setBounds(50,150,300,60);
		f.add(tx);
		JTextField tx1=new JTextField();
		tx1.setBounds(400,150,300,60);
		f.add(tx1);

		f.setLayout(null);
		f.setVisible(true);
		 b.addActionListener
		    (
		    		new ActionListener()
		    		{  
		    				public void actionPerformed(ActionEvent e)
		    				{  
		    						String st=tx.getText();
		    						tx1.setText(st);  
		    				}  
		    	    }
		    );
		
	}
}
