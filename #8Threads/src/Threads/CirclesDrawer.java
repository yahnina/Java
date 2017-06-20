package Threads;
/**
 * Created by Lena on 22.04.2017.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CirclesDrawer extends JFrame
{
    private JButton startThreadsButton;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JPanel jpanel1;
    private JPanel mainPanel;
    private myThread thread1;
    private myThread thread2;


    public CirclesDrawer() {

        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);


        startThreadsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1 = new myThread(progressBar1, 1000);
                thread2 = new myThread(progressBar2, 2000);
                thread1.start();
                System.out.println("синие шарики");
                thread2.start();
                System.out.println("красные шарики");
            }
        });
    }
}





