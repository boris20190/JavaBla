package Error_Handling;

public class Demo02 {
  static int avg(int num1, int num2) throws MyException {
    if (num1 < 0 || num2 < 0) {
      throw new MyException("不能使用负数！"); // 使用MyException方法
    }
    if (num1 > 100 || num2 > 100) {
      throw new MyException("不能大于100！");
    }
    return (num1 + num2) / 2;
  }

  public static void main(String[] args) {
    try { // 探测异常
      int res = avg(102, 150);
      System.out.println(res);
    } catch (MyException e) {
      e.printStackTrace(); // 抛出异常信息
    }
  }
}
