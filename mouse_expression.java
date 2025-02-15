package java_course;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class mouse_expression extends Frame implements MouseMotionListener
{  
    TextField a;  
    mouse_expression()
    {  
    a=new TextField();  
    a.setBounds(20,40,100,20);  
    add(a);  
      
    addMouseMotionListener(this);
addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e)
        {
       	
          int keyCode = e.getKeyCode();
          if (keyCode == KeyEvent.VK_UP) 
          {
            System.out.println("Up Arrrow-Key is pressed!");
          }
          else if (keyCode == KeyEvent.VK_DOWN) 
          {
            System.out.println("Down Arrrow-Key is pressed!");
          }
          else if (keyCode == KeyEvent.VK_LEFT)
          {
            System.out.println("Left Arrrow-Key is pressed!");
          }
          else if (keyCode == KeyEvent.VK_RIGHT) 
          {
          System.out.println("Right Arrrow-Key is pressed!");
          }
        }
      });
    setSize(800,800);  
    setLayout(null);  
    setVisible(true); 
    }
public void mouseDragged(MouseEvent e) 
{  
    a.setText("X="+e.getX()+", Y="+e.getY());  
}  
public void mouseMoved(MouseEvent e)
{  
    a.setText("X="+e.getX()+", Y="+e.getY());  
    
}  

public static void main(String[] args)
{  
    new mouse_expression();  
}  
}
