package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class stuMain {
  public static void main(String[] args) {
    UpdateStu stu1 = new UpdateStu("Boris", 521);
    UpdateStu stu2 = new UpdateStu("Steve", 522);
    UpdateStu stu3 = new UpdateStu("Alex", 523);
    UpdateStu stu4 = new UpdateStu("Him", 524);

    TreeSet<UpdateStu> tree = new TreeSet<>();
    tree.add(stu1);
    tree.add(stu2);
    tree.add(stu3);
    tree.add(stu4);
    Iterator<UpdateStu> it = tree.iterator(); // 构建迭代器

    System.out.println("Set集合中所有元素：");

    while (it.hasNext()) {
      UpdateStu stu = it.next();
      System.out.println(stu.getId() + "\t" + stu.getName());
    }

    it = tree.headSet(stu3).iterator(); // 截取排在stu3之前的对象
    System.out.println("截取stu3前面的集合：");
    while (it.hasNext()) {
      UpdateStu stu = it.next();
      System.out.println(stu.getId() + "\t" + stu.getName());
    }

    it = tree.subSet(stu2, stu4).iterator(); // 截取排在stu2与stu4之间的对象（包括stu2，不包括stu4）
    System.out.println("截取stu2与stu4之间的集合：");
    while (it.hasNext()) {
      UpdateStu stu = it.next();
      System.out.println(stu.getId() + "\t" + stu.getName());
    }
  }
}
