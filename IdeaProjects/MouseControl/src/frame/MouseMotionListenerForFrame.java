package frame;


import entity.AllFields;



import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerForFrame implements MouseMotionListener {


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        AllFields.time = Math.abs(AllFields.startTime - System.currentTimeMillis())/1000.0;//-timeOnBut;
        //System.out.println("razn "+(AllFields.startTime - System.currentTimeMillis())/1000);
        //System.out.println(AllFields.time);
        /*if ((MouseInfo.getPointerInfo().getLocation().x < AllFields.startPosition - 100 ||
                MouseInfo.getPointerInfo().getLocation().x > AllFields.startPosition + 100) &&
                AllFields.admissionForSpeed )*/
        System.out.println("allDist " + AllFields.allDistance);
        if(Math.abs(AllFields.startTime - System.currentTimeMillis())>1.0/*&&AllFields.allDistance<1.9685*/){
            //System.out.println("inIf " +AllFields.time);
            double distance = Math.abs(AllFields.startPosition*AllFields.sizeOnePxWeight -
                    MouseInfo.getPointerInfo().getLocation().x*AllFields.sizeOnePxWeight)*0.0254;
            System.out.println("dist "+distance);
            System.out.println("time "+AllFields.time);
            //System.out.println(AllFields.sizeOnePxWeight +"   " + AllFields.realSizeWeight);
            double speed = Math.abs(distance / AllFields.time);

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
            AllFields.allDistance+=distance;
            AllFields.startTime = System.currentTimeMillis();

        }
    }
}
