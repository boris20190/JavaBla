package Collection;

import java.util.*;

public class MapText {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    Emp emp1 = new Emp("351", "张三");
    Emp emp2 = new Emp("352", "张四");
    Emp emp3 = new Emp("353", "张五");
    Emp emp4 = new Emp("354", "张六");
    Emp emp5 = new Emp("355", "张七");

    map.put(emp4.getE_id(), emp4.getE_name());
    map.put(emp5.getE_id(), emp5.getE_name());
    map.put(emp1.getE_id(), emp1.getE_name());
    map.put(emp2.getE_id(), emp2.getE_name());
    map.put(emp3.getE_id(), emp3.getE_name());

    Set<String> set = map.keySet();
    Iterator<String> it = set.iterator();
    System.out.println("HashMap类实现的Map集合，无序：");
    while (it.hasNext()) {
      String str = it.next();
      String name = map.get(str); // 通过key找到name
      System.out.println(str + "\t" + name);
    }

    TreeMap<String, String> treeMap = new TreeMap<>(map); // TreeMap自带升序排列功能，把map放进去自动排好
    /*    相当于：
          TreeMap<String,String> treeMap = new TreeMap<>();
    treeMap.putAll(map);*/
    Iterator<String> iter = treeMap.keySet().iterator(); // 迭代器对key操作
    System.out.println("TreeMap类实现的Map集合，键对象升序：");
    while (iter.hasNext()) {
      String str = iter.next(); // str接过来key值
      String name = treeMap.get(str); // 通过key找到name
      System.out.println(str + "\t" + name);
    }
  }
}
