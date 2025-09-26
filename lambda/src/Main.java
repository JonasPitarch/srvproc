import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {


    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {


        ActionListener miExpresion = (e) -> System.out.println("XXX " + e.getActionCommand());

        JButton button1 = new JButton("Mega Button1");
        button1.addActionListener(l-> System.out.println("Pulsaste el boton 1"));
        add(button1);


        JButton button2 = new JButton("Mega Button2");

        
        button2.addActionListener(miExpresion);
        add(button2);


        JButton button3 = new JButton("Mega Button3");
        button3.addActionListener(miExpresion);

        add(button3);

        setSize(600, 200);
        setLayout(new GridLayout(1, 3));
        setVisible(true);
    }
}