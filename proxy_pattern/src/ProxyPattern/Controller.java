package ProxyPattern;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
/**
 * Created by Lena on 25.05.2017.
 */
public class Controller
{
   public void printFile()
   {

       JFileChooser fc = new JFileChooser();
       fc.setCurrentDirectory(new java.io.File("C:/"));
       fc.setDialogTitle("Блокнот");
       fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

       if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
       {

           try {
               FileReader fr = new FileReader(fc.getSelectedFile());
               BufferedReader br = new BufferedReader(fr);

               String str;
               String text = "";
               while ((str = br.readLine()) != null)
               {
                   text += str;
                   System.out.println(str + "\n");

               }

               br.close();

           } catch (IOException e0)
           {
               System.out.println("Файл не найден!");

           }

       }

   }
}