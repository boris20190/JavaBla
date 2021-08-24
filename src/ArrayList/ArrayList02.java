package ArrayList;
// 生成6个1到33之间的随机整数
// 添加到ArrayList中
// 遍历这6个数
import java.util.ArrayList;
import java.util.Random;

public class ArrayList02 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      arrayList.add(randomNumber());
    }
    System.out.println(arrayList);
    System.out.println("======遍历======");
    for (Integer integer : arrayList) {
      System.out.println(integer);
    }
  }

  public static int randomNumber() {
    return new Random().nextInt(33) + 1;
  }
}
