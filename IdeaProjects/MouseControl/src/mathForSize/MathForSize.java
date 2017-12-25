package mathForSize;

import entity.AllFields;

import java.awt.*;

public class MathForSize {
    public static double x;
    public static double y;
    public static void findRealSize(double diag){
        double diagInDuim = diag;
        double attitude=0;//Toolkit.getDefaultToolkit().getScreenSize().width/Toolkit.getDefaultToolkit().getScreenSize().height;
        double widht = Toolkit.getDefaultToolkit().getScreenSize().width;
        double height = Toolkit.getDefaultToolkit().getScreenSize().height;
        attitude = widht/height;

        AllFields.realSizeHeight = java.lang.Math.sqrt((diagInDuim*diagInDuim)/(attitude*attitude+1));
        AllFields.realSizeWeight = AllFields.realSizeHeight*attitude;
        //System.out.println("Y " + AllFields.realSizeHeight + " X "+AllFields.realSizeWeight);
    }
}
