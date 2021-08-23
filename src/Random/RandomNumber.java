package Random;

import java.util.Random;

public class RandomNumber {
  public static int randomNumber() {
    return new Random().nextInt(50) + 1;
  }

  public static boolean check(int num1, int num2) {
    return num1 == num2;
  }

  public static void contrast(int num1, int num2) {
    if (num1 < num2) {
      System.out.println("猜的数小了！");
    }
    if (num1 > num2) {
      System.out.println("猜的数大了！");
    }
  }
}
