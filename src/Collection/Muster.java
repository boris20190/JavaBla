package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
  public static void main(String[] args) {
    Collection<String> list = new ArrayList<>(); // 父类调用子类构造，多态
    list.add("Boris");
    list.add("Steve");
    list.add("Alex");
    Iterator<String> it = list.iterator(); // 创建迭代器
    while (it.hasNext()) {
      System.out.println(it.next()); // 输出，用了ArrayList，所以可以换成for循环
    }
  }
}
