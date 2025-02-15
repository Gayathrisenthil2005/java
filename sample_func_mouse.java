package java_course;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class sample_func_mouse 
{
    public static void main(String[] args)
    {
      
        JFrame f = new JFrame("Mouse Event Example");
        f.setSize(600, 600);
        f.setLayout(null);
    
     
        JTextField b1 = new JTextField();
        b1.setBounds(50, 150, 100, 40);
        f.add(b1);

      
        int width = b1.getWidth();
        int height = b1.getHeight();
        int x = b1.getX();
        int y = b1.getY();
        int a = x + width;
        int b = y + height;

       
        System.out.println("Top-left: " + x + "," + y);
        System.out.println("Top-right: " + a + "," + y);
        System.out.println("Bottom-left: " + x + "," + b);
        System.out.println("Bottom-right: " + a + "," + b);

       
        b1.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mouseEntered(MouseEvent e) 
            {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Mouse Exited");
            }

            @Override
            public void mousePressed(MouseEvent e) 
            {
                int clickX = e.getX() + b1.getX();
                int clickY = e.getY() + b1.getY();
                if (clickX >= x && clickX <= a && clickY >= y && clickY <= b) 
                {
                    System.out.println("Mouse Pressed at: " + clickX + ", " + clickY);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("Mouse Released");
            }
        });

        f.setVisible(true);
    }
}
