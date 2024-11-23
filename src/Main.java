import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setLayout(null);


        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);
        label1.setBackground(Color.blue);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);
        label2.setBackground(Color.green);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);
        label3.setBackground(Color.RED);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBounds(170,170,200,200);
        label4.setBackground(Color.yellow);


        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,500,500);
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);
        pane.add(label4);


        frame.add(pane);



    }
}