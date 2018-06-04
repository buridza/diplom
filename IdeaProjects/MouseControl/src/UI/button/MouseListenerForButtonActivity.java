package UI.button;

import entity.AllFields;
import mathForSize.MathForSize;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

public class MouseListenerForButtonActivity implements MouseListener  {
    private double round(double number){
        return number = Double.valueOf(String.format("%.3f", number));
    }

    @Override
    public void mouseClicked(MouseEvent e){
        AllFields.startPoint = MouseInfo.getPointerInfo().getLocation();
        AllFields.startPointForRes = AllFields.startPoint;
        AllFields.startPosition = AllFields.startPoint.x;
        AllFields.admissionForSpeed = true;
        AllFields.admissionForBut = true;
        AllFields.count=0;
        AllFields.listSpeed = new ArrayList<Double>();
        AllFields.indexForSpeedArray= 0;
        MathForSize.findRealSize(15.6);
        System.out.println(" x " + AllFields.realSizeWeight+" y " + AllFields.realSizeHeight);
        AllFields.sizeOnePxWeight = AllFields.realSizeWeight/Toolkit.getDefaultToolkit().getScreenSize().width;
        AllFields.sizeOnePxHeight = AllFields.realSizeHeight/Toolkit.getDefaultToolkit().getScreenSize().height;
        AllFields.allDistance = 0;
        AllFields.allSpeed = new ArrayList<Double>();
        AllFields.index=0;
        AllFields.allTime = 0;


        Robot robot = null;
        try {
            robot = new Robot();
            AllFields.bufferedWriter.write("№  x    y time speed 2\n" );
        } catch (AWTException e1) {
            e1.printStackTrace();
        }catch (IOException e2){
            System.out.println("fall with write");
        }
        robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x+150,MouseInfo.getPointerInfo().getLocation().y+50);
        /*for (int i = 0; i < 1366; i++) {
            robot.mouseMove(i, MouseInfo.getPointerInfo().getLocation().y);
        }*/
        AllFields.startTime = System.currentTimeMillis();

        // double rectangle = y/diagInDuim;

        /*int weight = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        double attitudes = 16/9.0;
        double square = mathForSize.sqrt(weight*weight+height*height);
        *double weightInDuim = diagInDuim*diagInDuim/attitudes;
        *
        * 16/9=1.77
        * 15.6/1.77=8.81
        *
        *
        *
        *
        * */

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
