package Laptop_USB;

public class Laptop {
  void powerOn() {
    System.out.println("电脑已开机");
  }

  void powerOff() {
    System.out.println("电脑已关机");
  }

  void usbDevice(USB usb) {
    usb.open();
    if (usb instanceof Mouse mouse) {
        // 向下转型，目的是使用子类独有的内容
        mouse.click();
    } else if (usb instanceof Keyboard keyboard) {
        keyboard.kick();
    }
    usb.close();
  }
}
