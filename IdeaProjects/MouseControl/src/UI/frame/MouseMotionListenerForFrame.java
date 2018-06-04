package UI.frame;


import entity.AllFields;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class MouseMotionListenerForFrame implements MouseMotionListener {


    @Override
    public void mouseDragged(MouseEvent e) {
        //MathForSize.findRealSize(15.6);
        //System.out.println(MouseInfo.getPointerInfo().getLocation().x);
        System.out.println(System.currentTimeMillis());

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //AllFields.time = Math.abs(AllFields.startTime - System.currentTimeMillis())/1000.0;//-timeOnBut;

        /*if ((MouseInfo.getPointerInfo().getLocation().x < AllFields.startPosition - 100 ||
                MouseInfo.getPointerInfo().getLocation().x > AllFields.startPosition + 100) &&
                AllFields.admissionForSpeed )*/

        /*if(Math.abs(AllFields.startTime - System.currentTimeMillis())>1.0*//*&&AllFields.allDistance<1.9685*//*&&AllFields.admissionForSpeed){
            //System.out.println("inIf " +AllFields.time);
            System.out.println("Shirina " +AllFields.sizeOnePxWeight);
            System.out.println("tolch" + AllFields.sizeOnePxHeight);
            AllFields.timeInStartIf = System.currentTimeMillis();
            double cmInInch = 2.54;
            double mInInch=0.0254;
            //463 пикселя на дюйм проходит мышка или 217 пиксеей на сантиметр
            double distancePerX = Math.abs(AllFields.startPoint.x*AllFields.sizeOnePxWeight -
                    MouseInfo.getPointerInfo().getLocation().x*AllFields.sizeOnePxWeight)*mInInch;
            double distancePerY = Math.abs(AllFields.startPoint.y*AllFields.sizeOnePxHeight-
                    MouseInfo.getPointerInfo().getLocation().y*AllFields.sizeOnePxHeight)*mInInch;
          *//*  System.out.println("dist "+distance);
            System.out.println("time "+AllFields.time);*//*
            //System.out.println(AllFields.sizeOnePxWeight +"   " + AllFields.realSizeWeight);
            double radius = Math.sqrt(distancePerX*distancePerX+distancePerY*distancePerY);
            System.out.println("Rad "+radius);
            double speed = Math.abs(radius / AllFields.time);

            AllFields.averageSpeed = 0;

            for (int i = 0; i < AllFields.listSpeed.size(); i++) {
                AllFields.averageSpeed += Math.abs(AllFields.listSpeed.get(i));

            }

            double testValue = AllFields.averageSpeed / AllFields.listSpeed.size();

            AllFields.jLabel.setText(String.format("%.5f, m/s", ((float) Math.abs(testValue))));
            ;
            if (AllFields.indexForSpeedArray > AllFields.step-1)
                AllFields.indexForSpeedArray = 0;

            try {
                Robot robot = new Robot();
                robot.mouseMove(AllFields.startPoint.x, AllFields.startPoint.y + 50);

                if(AllFields.listSpeed.size()<AllFields.step) {
                    AllFields.listSpeed.add(AllFields.indexForSpeedArray++, speed);

                }else
                {
                    AllFields.listSpeed.set(AllFields.indexForSpeedArray++, speed);

                }
                //System.out.println(AllFields.listSpeed.size());
                //System.out.println(AllFields.indexForSpeedArray);
            } catch (AWTException e1) {
                e1.printStackTrace();
            }
            AllFields.allDistance+=radius;
            AllFi\elds.startTime = System.currentTimeMillis();
            AllFields.timeInEndIf = System.currentTimeMillis();

        }*/

        //  if(AllFields.allDistance>1);
        // System.out.println(AllFields.allDistance*2.54*AllFields.sizeOnePxWeight);
        long time = System.currentTimeMillis() - AllFields.startTime;
        if (time > 100) {
            /*AllFields.time = Math.abs(AllFields.startTime - System.currentTimeMillis()) / 1000.0;
            AllFields.allTime += AllFields.time;*/
            double x = Math.abs(AllFields.startPoint.x - MouseInfo.getPointerInfo().getLocation().x);
            double y = Math.abs(AllFields.startPoint.y - MouseInfo.getPointerInfo().getLocation().y);

            try {
                System.out.println(AllFields.index + " " + x + " " + y + " " + System.currentTimeMillis());
                AllFields.bufferedWriter.write(AllFields.index++ + " " + x + " " + y + " " + time+ "\n"/*+AllFields.allTime+" "+speed+"\n"*/);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            //if(Math.abs(AllFields.startTime-System.currentTimeMillis())>1/*Math.abs(AllFields.startTime-System.currentTimeMillis())>1*/&&AllFields.admissionForSpeed){

            try {
                Robot robot = new Robot();
                robot.mouseMove(AllFields.startPointForRes.x + 150, AllFields.startPointForRes.y + 50);
            } catch (AWTException e1) {
                e1.printStackTrace();
            }

           /* double rad = Math.sqrt(x * x + y * y)*0.0254*0.09*AllFields.sizeOnePxWeight;//0.1 для моей 0,16 для синей
            double speed = rad/AllFields.time;


            if (AllFields.indexForSpeedArray > AllFields.step-1) {
                AllFields.indexForSpeedArray = 0;
                System.out.println("time "+AllFields.time);
            }

            if(AllFields.listSpeed.size()<AllFields.step) {
                AllFields.listSpeed.add(AllFields.indexForSpeedArray++, speed);
            } else {
                    AllFields.listSpeed.set(AllFields.indexForSpeedArray++, speed);
            }
            AllFields.allSpeed.add(speed);
            //System.out.println(AllFields.listSpeed);
            AllFields.averageSpeed = 0;
            for (Double d: AllFields.listSpeed ) {
               AllFields.averageSpeed+=Math.abs(d);
            }
            double testValue = (AllFields.averageSpeed / AllFields.listSpeed.size());
*/
            // AllFields.jLabel.setText(String.format("%.5f, m/s", ((float) Math.abs(testValue))));


            AllFields.startTime = System.currentTimeMillis();
            AllFields.startPoint = MouseInfo.getPointerInfo().getLocation();
            // AllFields.allDistance+=rad;
        }
    }

    }

