package Random;

public class GuessNumber {
  public static void main(String[] args) {
    int count = 0;
    int target = RandomNumber.randomNumber();
    System.out.println("猜数游戏现在开始！");
    int guess = UserPutIn.putIn();
    count++;
    while (!RandomNumber.check(guess, target)) {
      count++;
      RandomNumber.contrast(guess, target);
      guess = UserPutIn.putIn();
    }
    System.out.println("恭喜，猜对了！");
    System.out.println("你一共猜了" + count + "次");
  }
}
