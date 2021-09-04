package Multithread.ThreadSafe;

public class DemoMain03 {
  public static void main(String[] args) {
    RunnableImpl02 run = new RunnableImpl02();
    Thread t1 = new Thread(run);
    Thread t2 = new Thread(run);
    Thread t3 = new Thread(run);
    t1.start();
    t2.start();
    t3.start();
  }
}
