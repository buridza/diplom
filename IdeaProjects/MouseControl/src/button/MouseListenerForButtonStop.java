package button;

import entity.AllFields;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerForButtonStop implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        AllFields.admissionForSpeed = false;
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

