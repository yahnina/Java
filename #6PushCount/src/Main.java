import java.awt.*;


public class Main {

    public static void main(String[] args)
    {

        CountWindow mainWindow = new CountWindow();
        mainWindow.setPreferredSize(new Dimension(450, 485));
        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);

    }
}

