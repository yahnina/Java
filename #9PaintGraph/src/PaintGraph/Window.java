package PaintGraph;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lena on 28.04.2017.
 */
public class Window extends JFrame
{
    private JButton startPaintingButton;
    private JPanel mainPanel;
    private Function myFunction;

    public Window()
    {
        myFunction=new Function();
        add(mainPanel);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        int height=this.getHeight();//присваиваем переменной значение высоты
        int width=this.getWidth();//... ширины
        g2.drawLine(0,height/2,width,height/2);
        g2.drawLine(width/2,0,width/2,height);
        myFunction.setParameters(width,height);
        for (int x=0;x<width;x++){
            int y=myFunction.calcYPix(x);
            g2.drawLine(x,myFunction.calcYPix(x),x+1,myFunction.calcYPix(x+1));
        }
    }
}

