package Laptop_USB;

public class Mouse implements USB {
  @Override
  public void open() {
    System.out.println("鼠标已连接");
  }

  @Override
  public void close() {
    System.out.println("鼠标已断开");
  }

  public void click() {
    System.out.println("鼠标可以点击");
  }
}
