package impl;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@Slf4j
public class MouseListenerImpl implements MouseListener {
    static long timePr;
    static {
        timePr = System.currentTimeMillis();
    }
    static Logger logger = LoggerFactory.getLogger("logger.properties");
    public void mouseClicked(MouseEvent e) {
        log.info("mouseClicked");

    }

    public void mousePressed(MouseEvent e) {


    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
