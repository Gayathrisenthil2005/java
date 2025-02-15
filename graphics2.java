package java_course;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class graphics2 {
    static char operator;
    static int num1;
    static int num2;
    
    public static void main(String args[]) {
        JFrame f = new JFrame("calculator");
        f.setSize(600,600);
        f.setLayout(null);
        
        JButton add = new JButton("+");
        add.setBounds(200, 120, 50, 50);
        f.add(add);
        
        JButton one = new JButton("1");
        one.setBounds(50,120,50,50);
        f.add(one);
        
        JButton two = new JButton("2");
        two.setBounds(100,120,50,50);
        f.add(two);
        
        JButton three = new JButton("3");
        three.setBounds(150,120,50,50);
        f.add(three);
        
        JButton four = new JButton("4");
        four.setBounds(50,170,50,50);
        f.add(four);
        
        JButton five = new JButton("5");
        five.setBounds(100,170,50,50);
        f.add(five);
        
        JButton six = new JButton("6");
        six.setBounds(150,170,50,50);
        f.add(six);
        
        JButton sub = new JButton("-");
        sub.setBounds(200, 170, 50, 50);
        f.add(sub);
        
        JButton seven = new JButton("7");
        seven.setBounds(50,220,50,50);
        f.add(seven);
        
        JButton eight = new JButton("8");
        eight.setBounds(100,220,50,50);
        f.add(eight);
        
        JButton nine = new JButton("9");
        nine.setBounds(150,220,50,50);
        f.add(nine);
        
        JButton mul = new JButton("*");
        mul.setBounds(200, 220, 50, 50);
        f.add(mul);
        
        JButton zero = new JButton("0");
        zero.setBounds(50,270,50,50);
        f.add(zero);
        
        // Changed division button text from "%" to "/" and fixed the operator assignment.
        JButton div = new JButton("/");
        div.setBounds(100,270,50,50);
        f.add(div);
        
        JButton clear = new JButton("C");
        clear.setBounds(150,270,50,50);
        f.add(clear);
        
        JButton equal = new JButton("=");
        equal.setBounds(200,270,50,50);
        f.add(equal);
        
        JTextField tx = new JTextField();
        tx.setBounds(50,50,300,60);
        f.add(tx);
        
        f.setVisible(true);
        
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "1");   
            }
        });
        
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "2");   
            }
        });
        
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "3");   
            }
        });
        
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                num1 = Integer.parseInt(st);
                tx.setText("");  
                operator = '+';
            }
        });
        
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "4");   
            }
        });
        
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "5");   
            }
        });
        
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "6");   
            }
        });
        
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText("");   
                num1 = Integer.parseInt(st);
                operator = '-';
            }
        });
        
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "7");   
            }
        });
        
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "8");   
            }
        });
        
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "9");   
            }
        });
        
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText("");
                num1 = Integer.parseInt(st);
                operator = '*';
            }
        });
        
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText(st + "0");   
            }
        });
        
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                tx.setText("");
                num1 = Integer.parseInt(st);
                operator = '/';
            }
        });
        
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String st = tx.getText();
                num2 = Integer.parseInt(st);
                Integer result = 0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
                tx.setText(result.toString());
            }
        });
        
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tx.setText("");  // Clears the display
                num1 = 0;        // Resets the stored value
                num2 = 0;
            }
        });
    }
}
