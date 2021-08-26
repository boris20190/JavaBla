package Polymorphism;

public class Zi extends Fu {
  int num = 20;

  @Override
  void draw() {
    super.draw();
    System.out.println("子类的draw");
  }
}
