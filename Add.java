import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

@SuppressWarnings("serial")

public class Add extends JPanel {

    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;

    public Add() {

        Document d = new Document("Roys", 28);
        Topic top = new Topic();
        Category c = new Category();
        Tag g = new Tag();

        setLayout(new GridLayout(4, 3));

        t = new JTextField("ENTER DOCUMENT NAME");
        t.setSize(300, 300);
        t.setEditable(true);

        t1 = new JTextField("DOCUMENT NAME: NONE");
        t1.setSize(300, 300);
        t1.setEditable(true);

        JButton j1 = new JButton("PROCEED");

        t2 = new JTextField("ENTER TOPIC");
        t2.setSize(300, 300);
        t2.setEditable(true);

        t3 = new JTextField("TOPIC: NONE");
        t3.setSize(300, 300);
        t3.setEditable(true);

        JButton j2 = new JButton("PROCEED");

        t4 = new JTextField("ENTER CATEGORY");
        t4.setSize(300, 300);
        t4.setEditable(true);

        t5 = new JTextField("CATEGORY: NONE");
        t5.setSize(300, 300);
        t5.setEditable(true);

        JButton j3 = new JButton("PROCEED");

        t6 = new JTextField("ENTER TAGS (IF ANY ELSE TYPE NIL)");
        t6.setSize(300, 300);
        t6.setEditable(true);

        t7 = new JTextField("TAGS: NONE");
        t7.setSize(300, 300);
        t7.setEditable(true);

        JButton j4 = new JButton("PROCEED");

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = t.getText();
                t1.setText("DOCUMENT NAME: " + s1);
                d.doc_name[d.counter] = s1;
            }
        });

        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = t2.getText();
                t3.setText("TOPIC: " + s1);
                top.topic[d.counter] = s1;
            }
        });

        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = t4.getText();
                t5.setText("CATEGORY: " + s1);
                c.category[d.counter] = s1;
                d.counter = d.counter + 1;
            }

        });

        j4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = t6.getText();
                t7.setText("TAGS: " + s1);
                g.tags[d.counter - 1] = s1;

                JFrame jFrame = new JFrame();
                jFrame.setTitle("CHOOSING PAGE");

                Add a = new Add();
                Container cPane = jFrame.getContentPane();
                Newclass template = new Newclass(a, cPane);
                jFrame.setSize(template.getSize());
                jFrame.setResizable(false);
                cPane.add(template);

                jFrame.setVisible(true);
                jFrame.setLocationRelativeTo(null);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        });

        this.add(t);
        this.add(j1);
        this.add(t1);
        this.add(t2);
        this.add(j2);
        this.add(t3);
        this.add(t4);
        this.add(j3);
        this.add(t5);
        this.add(t6);
        this.add(j4);
        this.add(t7);

    }

}
