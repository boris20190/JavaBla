package Random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

  public static int randomNumber(int min, int max) {
    int range = max - min + 1;
    return new Random().nextInt(range) + min;
  }

  public static void guess() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("猜数游戏现在开始！");
    System.out.println("请输入你想猜数范围的最小值：");
    int min = scanner.nextInt();
    System.out.println("请输入你想猜数范围的最大值：");
    int max = scanner.nextInt();
    int target = randomNumber(min, max);
    int count = 0;
    while (true) {
      System.out.println("请输入一个数字：");
      int num1 = scanner.nextInt();
      count++;
      if (num1 < target) {
        System.out.println("猜的数小了！");
      }
      if (num1 > target) {
        System.out.println("猜的数大了！");
      }
      if (num1 == target) {
        System.out.println("恭喜，猜中了！");
        System.out.println("你一共猜了" + count + "次");
        break;
      }
      if (count == 6) {
        System.out.println("你猜的次数太多了，最多猜10次");
        System.out.println("现在还剩4次机会");
      }
      if (count == 10) {
        System.out.println("机会都用完了，请重新开始！");
        break;
      }
      if (count > 6) {
        System.out.println("现在还剩" + (10 - count) + "次机会！");
      }
    }
  }
}
