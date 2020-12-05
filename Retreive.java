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

public class Retreive extends JPanel {

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

    String topicOP;
    String categoryOP;

    public Retreive() {

        Document d = new Document("Roys", 28);
        Topic tops = new Topic();
        Category c = new Category();
        Tag g = new Tag();

        setLayout(new GridLayout(5, 3));

        if (d.counter == 0) {
            System.out.println("There are no Documents currently for retreival ");

            JLabel label = new JLabel("There are no Documents currently for retreival ");
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

            t2 = new JTextField("ENTER TOPIC");
            t2.setSize(300, 300);
            t2.setEditable(true);

            t3 = new JTextField("TOPIC: ");
            t3.setSize(300, 300);
            t3.setEditable(true);

            JButton j2 = new JButton("SPECIFY");

            t4 = new JTextField("ENTER CATEGORY");
            t4.setSize(300, 300);
            t4.setEditable(true);

            t5 = new JTextField("CATEGORY: ");
            t5.setSize(300, 300);
            t5.setEditable(true);

            JButton j3 = new JButton("SPECIFY");

            t6 = new JTextField("CLICK TO RETREIVE");
            t6.setSize(300, 300);
            t6.setEditable(true);

            t7 = new JTextField("RETRIEVED DOCUMENT: ");
            t7.setSize(300, 300);
            t7.setEditable(true);

            JButton j4 = new JButton("RETREIVE");

            t8 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t8.setSize(300, 300);
            t8.setEditable(true);

            t9 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t9.setSize(300, 300);
            t9.setEditable(true);

            JButton j5 = new JButton("MAIN PAGE");

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
                    topicOP = s1;
                    t3.setText("TOPIC: " + topicOP);

                }

            });

            j3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = t4.getText();
                    categoryOP = s1;
                    t5.setText("CATEGORY: " + categoryOP);

                }
            });

            j4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    int j = -1, k = -1;

                    for (int i = 0; i < d.counter; i++) {
                        String s = tops.topic[i];
                        if (topicOP.equals(s)) {
                            j = i;
                        }
                    }

                    if (j < 0) {
                        System.out.println("Couldn't find the specified topic");
                        t7.setText("UNABLE TO FIND GIVEN TOPIC");
                    }

                    for (int i = 0; i < d.counter; i++) {
                        String p = c.category[i];
                        if (categoryOP.equals(p)) {
                            k = i;
                        }
                    }

                    if (k < 0) {
                        System.out.println("Couldn't find the specified category");
                        t7.setText("UNABLE TO FIND GIVEN CATEGORY");
                    }

                    if (j == k) {
                        System.out.println("Retrieved the document successfully ");
                        System.out.println("Here is your document: ");
                        int g = j + 1;
                        System.out.println("ID: " + g + "     Document Name: " + d.doc_name[j]);

                        t7.setText("RETREIEVED DOCUMENT: ID: " + g + "  Document Name: " + d.doc_name[j]);
                    } else {
                        System.out.println("Unable to retrieve the document ");
                        t7.setText("UNABLE TO FIND DOCUMENT");
                    }

                }
            });

            j5.addActionListener(new ActionListener() {
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

        }

    }

}
