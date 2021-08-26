package Polymorphism;

public class PolyMain {
  public static void main(String[] args) {
    // 等号左边是谁，就优先用谁，没有就向上找
    Fu fu = new Zi();
    System.out.println(fu.num);
    System.out.println("=========");
    Zi zi = new Zi();
    System.out.println(zi.num);
    fu.draw(); // 输出：子类的draw。父类中有draw方法，于是从子类中调用同名方法
  }
}
