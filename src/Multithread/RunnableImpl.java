package Multithread;
// 实现runnable接口来实现多线程
// 使用接口与实现继承：
// 使用接口可以做到设置线程任务与开启线程分离（解耦）
// 尽量使用接口方式开多线程
public class RunnableImpl implements Runnable {
  @Override
  public void run() {
    Thread.currentThread().setName("test1");
    for (int i = 0; i < 20; ++i) {
      System.out.println(Thread.currentThread().getName() + "-->" + i);
    }
  }
}
