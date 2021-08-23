package Object;

import java.util.Scanner;

// 匿名对象作为方法参数
// 只想用一次的时候使用
public class AnonymousObject02 {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt(); // 这个输入就是用一次就不用了，省去对象命名，直接用匿名对象解决。但只能用一次
    System.out.println(num);
  }
}
