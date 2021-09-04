package Multithread;

public class DemoMain02 {
  public static void main(String[] args) {

    RunnableImpl run = new RunnableImpl();
    Thread thread = new Thread(run);
    thread.start();

    for (int i = 0; i < 20; ++i) {
      System.out.println(Thread.currentThread().getName() + "-->" + i);
    }
  }
}
