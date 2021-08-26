package Polymorphism;

public class Quadrangle {
  private final Quadrangle[] qtesst = new Quadrangle[6];
  private int nextIndex = 0;

  public void draw(Quadrangle q) {
    if (nextIndex < qtesst.length) {
      System.out.println(nextIndex);
      nextIndex++;
    }
  }

  static class Square extends Quadrangle {
    public Square() {
      System.out.println("正方形");
    }
  }

  static class Parallelogramgle extends Quadrangle {
    public Parallelogramgle() {
      System.out.println("平行四边形");
    }
  }

  public static void main(String[] args) {
    Quadrangle q = new Quadrangle();
    q.draw(new Square());
    q.draw(new Parallelogramgle());
  }
}
