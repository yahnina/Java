package Threads;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Lena on 22.04.2017.
 */
public class myThread extends Thread {
    int mymaxcount;
    JProgressBar myProgressBar;

    public myThread(JProgressBar bar, int maxCount) {
        myProgressBar = bar;
        myProgressBar.setMaximum(maxCount);
        mymaxcount = maxCount;
    }
    @Override
    public void run() {
        for (int i = 0; i < mymaxcount; i++)
        {
            myProgressBar.setValue(i);
            try{
                java.lang.Thread.sleep(50);		//Приостанавливает поток на 50 секунд
            }
            catch(InterruptedException e){}

        }
    }
}
