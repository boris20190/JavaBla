package Collection;

import java.util.*;

public class UpdateStu02 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>(); // 创建map实例
    map.put("01", "Boris");
    map.put("02", "Steve");
    map.put("03", "Alex");

    Set<String> set = map.keySet(); // 构建Map集合中所有key对象的集合————key返回是一个Set————key不能有重复元素，因此用Set。
    // 用set的地方能用collection，但不能反过来！！！
    Iterator<String> it = set.iterator();
    System.out.println("key集合中的元素：");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    Collection<String> coll = map.values();
    // 构建Map集合中所有values值的集合————value是一个Collection————value可以有重复元素，因此用Collection
    it = coll.iterator();
    System.out.println("values集合中的元素：");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
