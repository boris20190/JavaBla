package Multithread.ThreadSafe;

public class DemoMain04 {
  public static void main(String[] args) {
    RunnableImpl03 run = new RunnableImpl03();
    Thread t1 = new Thread(run);
    Thread t2 = new Thread(run);
    Thread t3 = new Thread(run);
    t1.start();
    t2.start();
    t3.start();
  }
}
