package Multithread;
// 优先级相同，谁抢到谁执行
public class DemoMain01 {
  public static void main(String[] args) {

    MyThread mt = new MyThread();
    mt.start(); // 使用start()方法开启新线程，执行新方法
    for (int i = 0; i < 20; i++) {
      System.out.println("MainThread" + i);
    }
  }
}
