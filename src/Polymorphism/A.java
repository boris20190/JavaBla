package Polymorphism;
// 继承链中对象方法的调用的优先级：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
class A {
  public String show(D obj) {
    return ("A and D");
  }

  public String show(A obj) {
    return ("A and A");
  }
  /*  public String show(B obj){
    return ("QQQ");
  }*/
}

class B extends A {
  public String show(B obj) {
    return ("B and B");
  }

  public String show(A obj) {
    return ("B and A");
  }
}

class C extends B {}

class D extends B {}

class Demo {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    B b = new B();
    C c = new C();
    D d = new D();

    System.out.println("1--" + a1.show(b));
    System.out.println("2--" + a1.show(c));
    System.out.println("3--" + a1.show(d));
    System.out.println("4--" + a2.show(b)); // 为什么结果是B and A：
    // A中只有show（D）和show（A），因此只能在B中找show（D）和show（A），看有没有被重写
    // 但A中没有show（B），所以在B中看见show（B）也不能用。于是返回A中再次寻找show（B）
    // A中显然没有show（B），因此进入下一步————本类亲自上了，直接在B中寻找show（A）。找到，输出。
    // 假如没有找到哈，会回到A中找show（A），再没有就报错
    System.out.println("5--" + a2.show(c));
    System.out.println("6--" + a2.show(d));
    System.out.println("7--" + b.show(b));
    System.out.println("8--" + b.show(c));
    System.out.println("9--" + b.show(d));
  }
}
