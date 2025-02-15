
package java_course;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class using_hashmap
{
public static void main(String[] args) 
{
	JFrame f=new JFrame("text");
	f.setSize(600,600);
	JTextField t1=new JTextField();
	t1.setBounds(50,150,80,60);
	f.add(t1);
	int a=t1.getX();
	int b=t1.getY();
	int c=t1.getWidth();
	int d=t1.getHeight();
t1.addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
                  int clickx=e.getX();
                  int clicky=e.getY();
                  if(clickx>=0 && clickx<=c && clicky>=0 && clicky<=d) 
                  {
                	 System.out.println("Button 1 clicked at: X = " + e.getX() + ", Y = " + e.getY());
                  }
                //System.out.println("Button 1 clicked at: X = " + e.getX() + ", Y = " + e.getY());
            }
        });

f.setLayout(null);

        f.setVisible(true);
}
}
        
       
