package frame;

import button.MouseListenerForButtonActivity;
import button.MouseListenerForButtonStop;
import entity.AllFields;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class Frame extends JFrame {
    
    public Frame(){


        setSize(600, 300);
        setTitle("bugaga");
        AllFields.activity = new JButton("Start");
        AllFields.jLabel = new JLabel("Text: ");
        AllFields.stop = new JButton("Stop");
        AllFields.jPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
                g2.draw(circle);
            }
        };
        AllFields.jPanel.setVisible(true);
        //add(AllFields.jPanel);
        Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
        Box box = Box.createHorizontalBox();
        //box.add(circle);
        box.add(Box.createHorizontalGlue());
        box.add(AllFields.jLabel);
        box.add(Box.createHorizontalStrut(10));
        //box.add(AllFields.jPanel);
        box.add(AllFields.activity);
        box.add(AllFields.stop);
        box.add(Box.createHorizontalStrut(10));
        box.add(Box.createHorizontalGlue());
        Box boxVertical = Box.createVerticalBox();
        boxVertical.add(Box.createVerticalGlue());
        boxVertical.add(box);
        boxVertical.add(Box.createVerticalGlue());
        getContentPane().add(boxVertical);
        //getContentPane().add(AllFields.jPanel);
        AllFields.stop.addMouseListener(new MouseListenerForButtonStop());
        AllFields.activity.addMouseListener(new MouseListenerForButtonActivity());
        //AllFields.activity.addMouseListener(new MouseListenerForButtonActivity());
        addMouseMotionListener(new MouseMotionListenerForFrame());
        addMouseListener(new MouseListenerForFrame());
        //Shape circle = new Ellipse2D.Double(50,50,50,50);
        //AllFields.jPanel.paintComponents();
        //add(circle);

        //image.flush();
    }

    public static void main(String[] args) {


        Frame frame = new Frame();
        AllFields.time = Math.abs(AllFields.startTime - System.currentTimeMillis())/1000.0;//-timeOnBut;
        System.out.println("inFrame " + AllFields.time);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
    
}
