package com.company;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;

/**
 * Created by Lena on 22.04.2017.
 */
public class NotepadKiller extends JFrame
{

    private JMenuBar menuBar ;
    private JTextPane textPane1;
    private String myclipboard="";


    public NotepadKiller()
    {
        textPane1=new JTextPane();
        getContentPane().add(textPane1);
        menuBar= new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenuItem helpMenu = new JMenuItem("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        helpMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText("Killer notepad forever!");
            }
        });

        JMenuItem cutMenu = new JMenuItem("Cut");
        JMenuItem copyMenu = new JMenuItem("Copy");
        JMenuItem pasteMenu = new JMenuItem("Paste");
        JMenuItem delMenu = new JMenuItem("Delete");
        JMenuItem openMenu = new JMenuItem("Open");
        JMenuItem saveMenu = new JMenuItem("Save as");



                //JMenuItem openMenu= new JMenuItem("Open");
       // JMenuItem saveMenu = new JMenuItem("Save");

        fileMenu.add(openMenu);
        fileMenu.add(saveMenu);

        editMenu.add(cutMenu);
        editMenu.add(copyMenu);
        editMenu.add(pasteMenu);
        editMenu.add(delMenu);

        this.setJMenuBar(menuBar);


        copyMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myclipboard=textPane1.getSelectedText();
            }
        });

        pasteMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.replaceSelection(myclipboard);
            }
        });

        delMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.replaceSelection("");
            }
        });

        saveMenu.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=textPane1.getText();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:/"));
        fc.setDialogTitle("");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                FileWriter writer=new FileWriter(fc.getSelectedFile());
                writer.write(text);
                writer.close();

            }
            catch (  IOException ex )
            {
                ex.printStackTrace();
            }
        }
    }
});
        openMenu.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

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
                        String text="";
                        while ((str = br.readLine()) != null)
                        {
                            text+=str;
                            System.out.println(str + "\n");

                        }
                        textPane1.setText(text + "\n");
                                                br.close();

                    } catch (IOException e0)
                    {
                        System.out.println("Файл не найден!");

                    }

                }

            }
        });


                System.out.println("меню ок");

            }
}