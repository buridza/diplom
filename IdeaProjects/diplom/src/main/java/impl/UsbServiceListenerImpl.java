package impl;

import javax.usb.event.UsbServicesEvent;
import javax.usb.event.UsbServicesListener;

public class UsbServiceListenerImpl implements UsbServicesListener {
    @Override
    public void usbDeviceAttached(UsbServicesEvent event) {
        System.out.println("пришло");
    }

    @Override
    public void usbDeviceDetached(UsbServicesEvent event) {
        System.out.println("ушло");
    }
}
