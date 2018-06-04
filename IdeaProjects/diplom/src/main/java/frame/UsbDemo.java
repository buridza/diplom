package frame;

import org.apache.poi.util.HexRead;
import org.usb4java.*;
import org.usb4java.javax.Services;
import org.usb4java.javax.adapter.UsbDeviceAdapter;

import javax.usb.UsbDevice;
import javax.usb.UsbException;
import javax.usb.UsbHub;
import javax.usb.UsbPort;
import javax.usb.event.UsbDeviceDataEvent;
import javax.usb.event.UsbDeviceErrorEvent;
import javax.usb.event.UsbDeviceEvent;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsbDemo extends Thread {
    @Override
    public void run() {
        super.run();
    }

    private static Context context;
    private static DeviceList devices;
    private static ConfigDescriptor configDescriptor;
    private static Map<Integer, Integer> longs;
    private static DeviceDescriptor deviceDescriptor;
    private static int result;
    private static ByteBuffer buffer;
    private static IntBuffer transfered;
    private static Transfer transfer;
    private static Services services;

    static {
        LibUsb.init(null);
        if (result != LibUsb.SUCCESS) throw new LibUsbException("Unable to initialize libusb.", result);
        transfer = LibUsb.allocTransfer();
        devices = new DeviceList();
        LibUsb.getDeviceList(null, devices);
        configDescriptor = new ConfigDescriptor();
        longs = new HashMap<>();
        deviceDescriptor = new DeviceDescriptor();
    }

    public static void main(String[] args) throws UsbException, InterruptedException {

        for (int i = 0; i < devices.getSize(); i++) {
            DeviceHandle deviceHandle = new DeviceHandle();
            Device device = devices.get(i);

            result = LibUsb.getDeviceDescriptor(device, deviceDescriptor);
            if (result != LibUsb.SUCCESS) throw new LibUsbException("Unable to read device descriptor", result);

            result = LibUsb.open(device, deviceHandle);

            if (result == 0) {
                some(device, deviceHandle);
            }

            if (longs.containsKey(LibUsb.getPortNumber(device))) {
                longs.put(LibUsb.getPortNumber(device), 1 + longs.get(LibUsb.getPortNumber(device)));
                continue;
            }
            longs.put(LibUsb.getPortNumber(device), 1);
        }
        longs.keySet().forEach(i -> System.out.println("key : " + i + " value : " + longs.get(i)));
    }


    public static void some(Device device, DeviceHandle deviceHandle) {

        System.out.println(Long.toHexString(deviceDescriptor.idVendor()));
        //System.out.println(configDescriptor);
        result = LibUsb.claimInterface(deviceHandle, 1);
        if (result != 0) System.out.println("ne poshlo");
        buffer = ByteBuffer.allocateDirect(8);
        byte[] bytes = {};
        int[] ints = {0, 0, 0, 0, 0, 0, 0, 0};
        buffer.put(bytes);
        transfered = IntBuffer.allocate(8);
        transfered.put(ints);
        LibUsb.getConfiguration(deviceHandle, transfered);
        for (byte i = 0; i < Byte.MAX_VALUE; i++) {
            for (byte j = 0; j < Byte.MAX_VALUE; j++) {
                for (byte k = 0; k < Byte.MAX_VALUE; k++) {
                    transferConfig(deviceHandle, i, j, 0x08,k, null);
                    ByteBuffer byteBuffer = LibUsb.controlTransferGetData(transfer);
                    if (byteBuffer.limit() > 0)
                        printByteBuffer(byteBuffer);
                }
            }
        }


        // int i = LibUsb.bulkTransfer(deviceHandle, (byte) 0x81, buffer, transfered, 1);
        /*for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; i++) {
            for (byte j = Byte.MIN_VALUE; j < Byte.MAX_VALUE; j++) {
                for (short v = Short.MIN_VALUE; v < Short.MAX_VALUE; v++) {
                    for (short x = Short.MIN_VALUE; x < Short.MAX_VALUE; x++) {
                        result = LibUsb.controlTransfer(deviceHandle, i, j, v, x, buffer, 0);
                        if (result != -2)
                            System.out.println(result);
                    }
                }
            }
        }*/


    }

    public static void transferConfig(DeviceHandle deviceHandle, byte endpoint, byte flag, int length, byte type, Object data) {
        transfer.setBuffer(buffer);
        transfer.setDevHandle(deviceHandle);
        transfer.setEndpoint(endpoint);
        transfer.setFlags(flag);
        transfer.setLength(length);
        transfer.setTimeout(1000);
        transfer.setType(type);
        transfer.setUserData(data);
    }

    public static void printByteBuffer(ByteBuffer buffer) {
        for (int j = 0; j < buffer.limit(); j++) {
            System.out.print(buffer.get(j) + " ");
        }
        System.out.println();
    }

    public static void printIntBuffer(IntBuffer buffer) {
        for (int j = 0; j < buffer.limit(); j++) {
            System.out.print(buffer.get(j) + " ");
        }
        System.out.println();
    }
}

