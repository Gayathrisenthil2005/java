package java_course;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class using_hashmap1 {
    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Text Field Example");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        
        JTextField textField = new JTextField();
        textField.setBounds(50, 150, 80, 60);
        textField.setName("TextField 1");
        frame.add(textField);
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(100, 250, 80, 60);
        textField.setName("TextField 2");
        frame.add(textField1);

        // Add MouseListener to detect clicks
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                System.out.println(textField.getName() + " clicked at: X = " + clickX + ", Y = " + clickY);
            }
        });
        
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                System.out.println(textField1.getName() + " clicked at: X = " + clickX + ", Y = " + clickY);
            }
        });
        frame.setVisible(true);
        
    }
}
