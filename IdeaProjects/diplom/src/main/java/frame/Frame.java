package frame;

import com.sun.corba.se.impl.transport.ListenerThreadImpl;
import com.sun.java.accessibility.util.SwingEventMonitor;
import impl.KeyListenerImpl;
import impl.MouseListenerImpl;
import impl.MouseMousionListenerImpl;
import impl.WindowListenerImpl;
import javafx.event.Event;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.usb4java.javax.Services;

import javax.usb.UsbException;
import java.awt.AWTException;
import java.awt.Checkbox;

@Slf4j
public class Frame{

    static Logger logger = LoggerFactory.getLogger(Frame.class);
    private java.awt.Frame frame;
    public static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
    public static Session session;
    public static final String FILE = "ExcelSheet.xlsx";
    Checkbox checkbox;
    HighLvl highLvl;
    Services services;
    public Frame() throws AWTException, UsbException {
        frame = new java.awt.Frame();
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.addWindowListener(new WindowListenerImpl());
        frame.addKeyListener(new KeyListenerImpl());
        frame.addMouseMotionListener(new MouseMousionListenerImpl());
        frame.addMouseListener(new MouseListenerImpl());
        services = new Services();
        checkbox = new Checkbox();
        frame.add(checkbox);
        //highLvl = new HighLvl();

    }

    public static void main(String[] args) throws AWTException, UsbException {
        Frame frame = new Frame();
    }

    public static void main2(String[] args) {
        System.out.println();
    }
}
