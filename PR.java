package pbl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class PR extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JRadioButton rb1;
    JLabel l1,l2,l3,image;
    JTextArea t1;
    JTextField tf1;
    JPasswordField p1;
    public int a;
    PR(){
        setTitle("Login page");
        getContentPane().setBackground(Color.WHITE);
        setLayout((LayoutManager)null);
        p1=new JPasswordField();
        l1=new JLabel("Username");
        l1.setBounds(40, 70, 100, 20);
        add(l1);
        tf1= new JTextField();
        tf1.setBounds(125,70,100,20);
        add(tf1);
        l2=new JLabel("Password");
        l2.setBounds(40, 110, 100, 20);
        add(l2);
        p1=new JPasswordField();
        p1.setBounds(125,110,100,20);
        add(p1);
        l3=new JLabel();
        l3.setBounds(40, 120, 200, 200);
        add(l3);
        b1=new JButton("LOGIN");
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBounds(100,150,75,20);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener(this);
        ImageIcon i= new ImageIcon("C:\\Users\\NARENDAR KETHAVATH\\eclipse-workspace\\Pbl\\src\\pbl\\user.png");
        image=new JLabel(i);
        image.setBounds(250, 30,150 , 150);
        add(image);
        setSize(500,300);
        setLocation(350, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        {
            if(tf1.getText().equals("GCET") && p1.getText().equals("Gcet@123")){
                dispose();
                new App();
            }
            else{
               tf1.setText("");p1.setText("");
               l3.setText("Invalid username/password");
               l3.setForeground(Color.RED);
            }
        };
    }
    public static void main(String argr[]){
        new PR();
    }
}


