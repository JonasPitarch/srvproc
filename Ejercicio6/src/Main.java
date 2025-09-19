import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }
    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola");
        }
    }

    public void start() {
        JButton button1 = new JButton("Mega Button1");
        button1.setBounds(0,0, 400,200);
        add(button1);
        button1.addActionListener(new MyActionListener() {
        });

        var accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola perraco");
            }
        };
        JButton button2 = new JButton("Mega Button2");
        button2.setBounds(0,200, 400,200);
        add(button2);
        button2.addActionListener(accion);

        JButton button3 = new JButton("Mega Button3");
        button3.setBounds(0,400, 400,200);
        add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cabroooooooooooon");
            }
        });

        setSize(400,600);
        setLayout(null);
        setVisible(true);

    }
}