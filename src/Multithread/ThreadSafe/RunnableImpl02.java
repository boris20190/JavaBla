package Multithread.ThreadSafe;

public class RunnableImpl02 implements Runnable {

  private int ticket = 100;
  final Object obj = new Object();

  @Override
  public void run() {

    while (ticket > 2) {
      synchronized (obj) { // 线程没有执行完，不会归还锁，没有锁的线程即使抢到了执行权也无法执行，必须等待锁被归还
        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        ticket--;
        try { // sleep线程休眠
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
