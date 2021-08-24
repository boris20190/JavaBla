package ArrayList;
// ArrayList常用操作
// 尖括号<>中是泛型，只能是引用类型，不能是基本类型-->转成包装类
/*基本类   包装类
 * byte    Byte
 * short   Short
 * int     Integer
 * long    Long
 * float   Float
 * double  Double
 * char    Character
 * boolean Boolean
 */
import java.util.ArrayList;

public class ArrayList01 {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Alex");
    arrayList.add("Steve");
    arrayList.add("Boris");
    for (String s : arrayList) {
      System.out.println(s);
    }
    System.out.println("=====================");
    System.out.println("被删除的元素是：" + arrayList.remove(0));
    System.out.println("剩下的元素还有：");
    for (String s : arrayList) {
      System.out.println(s);
    }
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    System.out.println(arrayList1); // 默认toString转换，即使是空的，直接访问也会打印[]
    arrayList1.add(21);
    System.out.println(arrayList1); // 直接访问就打印[全部元素]
  }
}
