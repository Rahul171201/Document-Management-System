import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

@SuppressWarnings("serial")

public class Delete extends JPanel {

    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;

    public Delete() {
        Document d = new Document("Roys", 28);
        Topic tops = new Topic();
        Category c = new Category();
        Tag g = new Tag();

        setLayout(new GridLayout(4, 3));

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

            t2 = new JTextField("ENTER DOCUMENT ID");
            t2.setSize(300, 300);
            t2.setEditable(true);

            t3 = new JTextField("DELETED DOCUMENT: ");
            t3.setSize(300, 300);
            t3.setEditable(true);

            JButton j2 = new JButton("DELETE");

            t4 = new JTextField("UPDATED LIST: ");
            t4.setSize(300, 300);
            t4.setEditable(true);

            t5 = new JTextField("UPDATED LIST: ");
            t5.setSize(300, 300);
            t5.setEditable(true);

            JButton j3 = new JButton("UPDATE");

            t6 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t6.setSize(300, 300);
            t6.setEditable(true);

            t7 = new JTextField("CLICK TO GO TO MAIN PAGE");
            t7.setSize(300, 300);
            t7.setEditable(true);

            JButton j4 = new JButton("MAIN PAGE");

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
                    t3.setText("THE DELETED DOCUMENT IS: " + d.doc_name[j - 1]);

                    String[] doc = new String[100]; // Creating new array for document name
                    String[] top = new String[100]; // Creating new array for topic
                    String[] cat = new String[100]; // Creating new array for category
                    String[] gat = new String[100]; // Creating new array for tags

                    int count = 0;

                    for (int i = 0; i < d.counter; i++) // Deleteing the document name at specified index
                    {
                        if (i == j - 1)
                            continue;

                        else {
                            doc[count] = d.doc_name[i];
                            count++;
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        d.doc_name[i] = doc[i];
                    }

                    count = 0;

                    for (int i = 0; i < d.counter; i++) // Deleteing the topic at specified index
                    {
                        if (i == j - 1)
                            continue;

                        else {
                            top[count] = tops.topic[i];
                            count++;
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        tops.topic[i] = top[i];
                    }

                    count = 0;

                    for (int i = 0; i < d.counter; i++) // Deleteing the category at specified index
                    {
                        if (i == j - 1)
                            continue;

                        else {
                            cat[count] = c.category[i];
                            count++;
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        c.category[i] = cat[i];
                    }

                    count = 0;

                    for (int i = 0; i < d.counter; i++) // Deleteing the tags at specified index
                    {
                        if (i == j - 1)
                            continue;

                        else {
                            gat[count] = g.tags[i];
                            count++;
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        g.tags[i] = gat[i];
                    }

                    count = 0;
                    d.counter--;
                }
            });

            j3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s1 = " ";
                    for (int i = 0; i < d.counter; i++) {
                        int x = i + 1;
                        s1 = s1 + "id: " + x + " Document Name: " + d.doc_name[i] + " ";
                    }

                    t5.setText(s1);

                }
            });

            j4.addActionListener(new ActionListener() {
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
        }

    }
}
