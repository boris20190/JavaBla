package Object;

import java.util.Scanner;

// 匿名对象同样可以用作方法参数
// 匿名对象作为返回值参见 Array01/returnArray.java
public class AnonymousObject03 {
  public static void main(String[] args) {
    putIn(new Scanner(System.in));
  }

  public static void putIn(Scanner scanner) {
    int num = scanner.nextInt();
    System.out.println("输入的数字是：" + num);
  }
}
