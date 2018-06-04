package impl;

import entity.TimeLog;
import frame.Frame;

import javax.usb.util.UsbUtil;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import static impl.MouseListenerImpl.timePr;

public class MouseMousionListenerImpl implements MouseMotionListener {


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {


        Frame.session.save(new TimeLog(System.currentTimeMillis()-timePr));
        timePr = System.currentTimeMillis();

    }
}
