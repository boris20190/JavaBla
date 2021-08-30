package Collection;
// 迭代器的使用
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
  public static void main(String[] args) {
    //      ArrayList<String> list = new ArrayList<>();
    Collection<String> list = new ArrayList<>();
    list.add("Boris");
    list.add("Alex");
    list.add("Steve");
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
