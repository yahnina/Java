import javax.swing.*;
import java.awt.event.*;


/**
 * Created by Lena on 22.04.2017.
 */
public class CountWindow extends JFrame {

    private JButton button1;
    private JScrollBar scrollBar1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JTextArea textArea1;
    private JLabel label1;
    private JPanel panel1;

    public CountWindow() {
        getContentPane().add(panel1);

        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        button1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                incCounter();

            }
        });
        radioButton1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                incCounter();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                incCounter();
            }
        });
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            /**
             * Invoked when the value of the adjustable has changed.
             *
             * @param e
             */
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                incCounter();
            }
        });
        panel1.addComponentListener(new ComponentAdapter() {
        });
    }

    public Integer count=0;
    public void incCounter()
    {
        count++;

        label1.setText(count.toString());


    }
}
