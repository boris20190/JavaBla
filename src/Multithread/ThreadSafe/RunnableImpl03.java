package Multithread.ThreadSafe;
// synchronized方法同步
public class RunnableImpl03 implements Runnable {
  private int num_ticket = 100;

  @Override
  public void run() {
    while (true) {
      payTicket();
    }
  }

  public synchronized void payTicket() {
    if (num_ticket > 0) {
      System.out.println(Thread.currentThread().getName() + "正在卖第" + num_ticket + "张票");
      num_ticket--;
    }
  }
}
