package Laptop_USB;

public class LaptopMain {
  public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.powerOn();
    // 向上转型，目的是使用接口公共部分
    USB usbMouse = new Mouse();
    USB usbKeyboard = new Keyboard();
    laptop.usbDevice(usbMouse);
    laptop.usbDevice(usbKeyboard);
    laptop.powerOff();
  }
}
