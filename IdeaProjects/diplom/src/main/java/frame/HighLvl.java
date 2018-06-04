package frame;

import impl.UsbDeviceListenerImpl;
import impl.UsbServiceListenerImpl;
import org.usb4java.javax.Services;

import javax.usb.*;
import java.util.List;

public class HighLvl {
    Services services;
    UsbHub rootUsbHub;
    UsbDevice usbDevice;
    UsbPort usbPort;

    HighLvl() throws UsbException {
        services = new Services();
        System.out.println("services.getImpDescription() : " + services.getImpVersion());
        rootUsbHub = services.getRootUsbHub();
        usbPort = rootUsbHub.getUsbPort((byte) 2);
        usbDevice = usbPort.getUsbDevice();
        usbDevice.addUsbDeviceListener(new UsbDeviceListenerImpl());
        services.addUsbServicesListener(new UsbServiceListenerImpl());
    }

    public static void main(String[] args) throws UsbException {
        HighLvl highLvl = new HighLvl();
        UsbConfiguration configuration = highLvl.usbDevice.getActiveUsbConfiguration();
        List<UsbInterface> usbInterfaces = configuration.getUsbInterfaces();
        usbInterfaces.forEach(System.out::println);
        UsbInterface iface = configuration.getUsbInterface((byte) 0);
        UsbHub rootUsbHub = highLvl.services.getRootUsbHub();
        System.out.println("хаб " + rootUsbHub);
        System.out.println("порты : "); rootUsbHub.getUsbPorts().forEach(o -> {
            UsbPort usbPort = (UsbPort)o;
            System.out.println(usbPort.getPortNumber());
            System.out.println(usbPort.isUsbDeviceAttached());
            System.out.println(usbPort.getUsbDevice());
            System.out.println(usbPort.getUsbDevice().getActiveUsbConfiguration().getUsbInterfaces());
        });
    }
}
