package impl;

import entity.TimeLog;
import frame.Frame;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.query.Query;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class KeyListenerImpl extends Thread implements KeyListener {
    private Robot robot;
    private int nameIterator = 0;
    long timeMillis
            = System.currentTimeMillis();
    PointerInfo pointerInfo;
    int x;
    int y;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        pointerInfo = MouseInfo.getPointerInfo();

        x = pointerInfo.getLocation().x;
        y = pointerInfo.getLocation().y;
    }

    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode() + " " + (int) e.getKeyChar() + " " + e.getKeyChar());
        if (e.getKeyChar() == 's') {
            start();
        }
        if (e.getKeyChar() == 'i') {
            if (!super.getName().equals("robot 0")) {
                System.out.println("getName() : " + getName());
                System.out.println("не робот isInterrupted() : " + isInterrupted());
            }
            if (super.getName().equals("robot 0")) {
                System.out.println("робот isInterrupted() : " + isInterrupted());
            }
        }
        if (e.getKeyChar() == 'x') {
            Query<TimeLog> query = Frame.session.createQuery("select t from  TimeLog t", TimeLog.class);
            List<TimeLog> resultList = query.getResultList();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("MySqlDbWithDataFromMouse");
            XSSFRow row;
            XSSFCell cell;

            for (int i = 0; i < resultList.size(); i++) {
                if(resultList.get(i).getTime()>40||resultList.get(i).getTime()==0) {
                    resultList.remove(i);
                    i--;
                    continue;
                }
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(resultList.get(i).getTime());
            }
            try {
                workbook.write(new FileOutputStream(Frame.FILE));
                System.out.println("Таблица готова");
            } catch (IOException io) {
                io.printStackTrace();
            }
        }

        if (e.getKeyChar() == 'w' && !currentThread().isInterrupted()) {
            //not use
            try {
                wait();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("wait");
        }
        if (e.getKeyChar() == 'f' && !currentThread().isInterrupted()) {
            interrupt();
            System.out.println("stop");
        }
        if (e.getKeyChar() == 'o' || e.getKeyChar() == '/') {
            if (Frame.session == null || !frame.Frame.session.isOpen()) {
                frame.Frame.session = Frame.SESSION_FACTORY.openSession();
            }
            System.out.println("Frame.session.getTransaction().isActive() : " + Frame.session.getTransaction().isActive());
            if (Frame.session.getTransaction() == null || !Frame.session.getTransaction().isActive())
                Frame.session.beginTransaction();
        }
        if (e.getKeyChar() == 't') {
            if (Frame.session.getTransaction().isActive())
                Frame.session.getTransaction().commit();
            else
                robot.keyPress((int) 'o');
        }
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        setName("robot " + nameIterator);
        int x;
        int y;

        while (!isInterrupted()) {
            //robot.mouseMove(40, 40);

            x = MouseInfo.getPointerInfo().getLocation().x;
            y = MouseInfo.getPointerInfo().getLocation().y;

            if(x!=MouseInfo.getPointerInfo().getLocation().x || y!=MouseInfo.getPointerInfo().getLocation().y){
               System.out.println("in thread : " + (System.currentTimeMillis()-timeMillis));
               timeMillis=System.currentTimeMillis();
            }

            x = MouseInfo.getPointerInfo().getLocation().x;
            y = MouseInfo.getPointerInfo().getLocation().y;
        }
    }
}
