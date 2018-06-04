package entity;

import mathForSize.MathForSize;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllFields {
    public static long startTime;
    public static JButton activity;
    public static JLabel jLabel;
    public static JLabel jLabel1;
    public static Point startPoint;
    public static JButton stop;
    public static int startPosition;
    public static boolean admissionForSpeed=false;
    public static boolean admissionForBut;
    public static JPanel jPanel;
    public static double time;
    public static int indexForSpeedArray;
    public static double averageSpeed = 0;
    public static ArrayList<Double> listSpeed;
    public static int count=0;
    public static boolean admission=true;
    public static double realSizeWeight = MathForSize.x;
    public static double realSizeHeight = MathForSize.y;
    public static double sizeOnePxWeight;
    public static double sizeOnePxHeight;
    public static int step = 100;
    public static double allDistance;
    public static long timeInEndIf;
    public static long timeInStartIf;
    public static Point startPointForRes;
    public static List<Double> allSpeed;
    public static List<Double> allDist = new ArrayList<>();;
    public static BufferedWriter bufferedWriter;
    public static int index;
    public static double allTime;
}
