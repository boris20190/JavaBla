package Multithread;
//通过继承Thread类来实现多线程
public class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("MyThread" + i);
    }
  }
}
