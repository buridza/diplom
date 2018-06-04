package frame;

import com.sun.jna.Pointer;
import org.hid4java.HidDevice;
import org.hid4java.HidManager;
import org.hid4java.HidServices;
import org.hid4java.HidServicesListener;
import org.hid4java.event.HidServicesEvent;
import org.hid4java.jna.HidApi;
import org.hid4java.jna.HidDeviceInfoStructure;
import org.hid4java.jna.HidDeviceStructure;
import org.usb4java.DeviceDescriptor;
import org.usb4java.DeviceList;
import org.usb4java.LibUsb;

import java.util.Arrays;
import java.util.List;

public class HidDemo {
    private static DeviceList devices;

    public static void main(String[] args) {

        int result = LibUsb.init(null);
        devices = new DeviceList();
        LibUsb.getDeviceList(null, devices);
        DeviceDescriptor deviceDescriptor = new DeviceDescriptor();


        HidApi.init();
        HidDeviceInfoStructure hidDeviceInfoStructure = new HidDeviceInfoStructure();
        HidServices services = HidManager.getHidServices();
        services.start();
        List<HidDevice> attachedHidDevices = services.getAttachedHidDevices();
        HidDevice hidDevice = attachedHidDevices.get(attachedHidDevices.size() - 1);
        String lastErrorMessage = hidDevice.getLastErrorMessage();
        System.out.println(lastErrorMessage);
        byte[] bytes = new byte[8];

        System.out.println(Arrays.toString(bytes));



    }
}
