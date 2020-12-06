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

public class Newclass extends JPanel {

    public Newclass(Add a, Container cPane) {

        setSize(800, 800);
        setLayout(new BorderLayout());
        JButton addDocument = new JButton("ADD DOCUMENT");
        this.add(addDocument, BorderLayout.NORTH);

        addDocument.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add add = new Add();
                add.setSize(getSize());
                next(cPane);
                cPane.add(add);
                cPane.revalidate();
                cPane.repaint();
            }
        });

        JButton deleteDocument = new JButton("DELETE DOCUMENT");
        this.add(deleteDocument, BorderLayout.WEST);

        deleteDocument.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delete delete = new Delete();
                delete.setSize(getSize());
                next(cPane);
                cPane.add(delete);
                cPane.revalidate();
                cPane.repaint();
            }
        });

        JButton editDocument = new JButton("EDIT DOCUMENT");
        this.add(editDocument, BorderLayout.EAST);

        editDocument.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Edit edit = new Edit();
                edit.setSize(getSize());
                next(cPane);
                cPane.add(edit);
                cPane.revalidate();
                cPane.repaint();
            }
        });

        JButton retreiveDocument = new JButton("RETREIVE DOCUMENT");
        this.add(retreiveDocument, BorderLayout.SOUTH);

        retreiveDocument.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retreive retreive = new Retreive();
                retreive.setSize(getSize());
                next(cPane);
                cPane.add(retreive);
                cPane.revalidate();
                cPane.repaint();
            }
        });

    }

    public void next(Container cPane) {
        cPane.remove(this);
    }

}
