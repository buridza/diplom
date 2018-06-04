package impl;

import javax.usb.event.UsbDeviceDataEvent;
import javax.usb.event.UsbDeviceErrorEvent;
import javax.usb.event.UsbDeviceEvent;
import javax.usb.event.UsbDeviceListener;

public class UsbDeviceListenerImpl implements UsbDeviceListener {
    @Override
    public void usbDeviceDetached(UsbDeviceEvent usbDeviceEvent) {
        System.out.println(1);
    }

    @Override
    public void errorEventOccurred(UsbDeviceErrorEvent usbDeviceErrorEvent) {
        System.out.println(2);
    }

    @Override
    public void dataEventOccurred(UsbDeviceDataEvent usbDeviceDataEvent) {
        System.out.println(3);
    }
}
