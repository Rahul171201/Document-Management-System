import javax.swing.JPanel;
import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

@SuppressWarnings("serial")

public class Edit extends JPanel {

    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;

    public Edit() {

        Document d = new Document("Roys", 28);
        Topic tops = new Topic();
        Category c = new Category();
        Tag g = new Tag();

        setLayout(new GridLayout(6, 3));

        if (d.counter == 0) {
            System.out.println("There are no Documents currently for deletion ");

            JLabel label = new JLabel("There are no Documents currently for deletion ");
            this.add(label);
        }

        else {

            t = new JTextField("DOCUMENT LIST: ");
            t.setSize(300, 300);
            t.setEditable(true);

            t1 = new JTextField(" ");
            t1.setSize(300, 300);
            t1.setEditable(true);

            JButton j1 = new JButton("PROCEED");

            t2 = new JTextField("ENTER DOCUMENT ID: ");
            t2.setSize(300, 300);
            t2.setEditable(true);

            t3 = new JTextField("DOCUMENT TO BE EDITED: ");
            t3.setSize(300, 300);
            t3.setEditable(true);

            JButton j2 = new JButton("EDIT");

            t4 = new JTextField("ENTER NEW DOCUMENT NAME");
            t4.setSize(300, 300);
            t4.setEditable(true);

            t5 = new JTextField("UPDATED DOCUMENT NAME: ");
            t5.setSize(300, 300);
            t5.setEditable(true);

            JButton j3 = new JButton("UPDATE");

            t6 = new JTextField("ENTER NEW TOPIC");
            t6.setSize(300, 300);
            t6.setEditable(true);

            t7 = new JTextField("UPDATED TOPIC: ");
            t7.setSize(300, 300);
            t7.setEditable(true);

            JButton j4 = new JButton("UPDATE");

            t8 = new JTextField("ENTER NEW CATEGORY");
            t8.setSize(300, 300);
            t8.setEditable(true);

            t9 = new JTextField("UPDATED CATEGORY: ");
            t9.setSize(300, 300);
            t9.setEditable(true);

            JButton j5 = new JButton("UPDATE");

            t10 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t10.setSize(300, 300);
            t10.setEditable(true);

            t11 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t11.setSize(300, 300);
            t11.setEditable(true);

            JButton j6 = new JButton("MAIN PAGE");

            j1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s1 = " ";
                    for (int i = 0; i < d.counter; i++) {
                        int x = i + 1;
                        s1 = s1 + "id: " + x + " Document Name: " + d.doc_name[i] + " ";
                    }

                    t1.setText(s1);

                }
            });

            j2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = t2.getText();
                    int j = Integer.parseInt(s1);
                    t3.setText("DOCUMENT TO BE EDITED: " + d.doc_name[j - 1]);

                }

            });

            j3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = t4.getText();
                    String s2 = t2.getText();
                    int j = Integer.parseInt(s2);
                    d.doc_name[j - 1] = s1;
                    t5.setText("NEW DOCUMENT NAME: " + d.doc_name[j - 1]);

                }
            });

            j4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = t6.getText();
                    String s2 = t2.getText();
                    int j = Integer.parseInt(s2);
                    tops.topic[j - 1] = s1;
                    t7.setText("NEW TOPIC NAME: " + tops.topic[j - 1]);

                }
            });

            j5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = t8.getText();
                    String s2 = t2.getText();
                    int j = Integer.parseInt(s2);
                    c.category[j - 1] = s1;
                    t9.setText("NEW CATEGORY NAME: " + c.category[j - 1]);

                }
            });

            j6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

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
            this.add(t8);
            this.add(j5);
            this.add(t9);
            this.add(t10);
            this.add(j6);
            this.add(t11);
        }

    }
}
