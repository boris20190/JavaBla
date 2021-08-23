package Array01;
// 方法返回值为数组
import java.util.Arrays;

public class returnArray {
  public static void main(String[] args) {
    int[] result = calculate(5, 16, 9);
    System.out.println(Arrays.toString(result)); // 将数组以字符串形式打印出来 [30,10]
    System.out.println(result[0]); // 结果：30
    System.out.println(result[1]); // 结果：10
  }

  public static int[] calculate(int a, int b, int c) {
    int sum = a + b + c;
    int avg = sum / 3;
    return new int[] {sum, avg}; // 一次只能有一个返回值，因此把两个数据打包形成数组 这里是使用了匿名对象
    /*      等价于：int[] result={sum,avg};
                   return result;
    */
  }
}
