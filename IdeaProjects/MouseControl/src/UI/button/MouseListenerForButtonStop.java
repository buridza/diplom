package UI.button;

import entity.AllFields;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Collections;

public class MouseListenerForButtonStop implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        AllFields.admissionForSpeed = false;
        System.out.println(AllFields.allDistance);
        try {
            AllFields.bufferedWriter.flush();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println("allDist " + AllFields.allDist);
        System.out.println("1 " + AllFields.sizeOnePxWeight);
        System.out.println("2 " + AllFields.sizeOnePxHeight);
        System.out.println("max " + Collections.max(AllFields.allSpeed));
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

