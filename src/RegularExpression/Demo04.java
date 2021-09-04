package RegularExpression;
// 验证整数或小数
// 考虑正负数
public class Demo04 {
  public static void main(String[] args) {
    String content = "3.14";
    String regStr = "-?\\d+\\.?\\d+"; // 负号可有可无，小数点可有可无，小数点前后数字不限制位数

    if (content.matches(regStr)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
