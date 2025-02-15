package java_course;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextField;

public class qus1_mouse extends Frame implements MouseMotionListener {

    TextField a;
    JTextField t1, t2, t3, t4, t5, t6;

    qus1_mouse() {
        setSize(800, 800);
        setLayout(null);

        a = new TextField();
        a.setBounds(20, 40, 200, 20);
        add(a);

        t1 = new JTextField();
        t1.setBounds(200, 120, 100, 50);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(200, 300, 100, 50);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(200, 400, 100, 50);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(300, 200, 100, 50);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(150, 220, 100, 50);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(400, 320, 100, 50);
        add(t6);

        // Add MouseListener to each JTextField
        addMouseListenerToTextField(t1, "1st");
        addMouseListenerToTextField(t2, "2nd");
        addMouseListenerToTextField(t3, "3rd");
        addMouseListenerToTextField(t4, "4th");
        addMouseListenerToTextField(t5, "5th");
        addMouseListenerToTextField(t6, "6th");

        addMouseMotionListener(this);
        setVisible(true);
    }

    private void addMouseListenerToTextField(JTextField textField, String textFieldName)
    {
        textField.addMouseListener(new MouseListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.out.println(textFieldName + " text field clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        a.setText("X=" + e.getX() + ", Y=" + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        int x = e.getX();
        int y = e.getY();
        a.setText("X=" + x + ", Y=" + y);
    }

    public static void main(String[] args) 
    {
        new qus1_mouse();
    }
}
