package Error_Handling;

public class Error_Handling {
  public static void main(String[] args) {
    try { // 可能出问题的代码部分，探测。如果出问题就转catch
      String str = "lili";
      System.out.println(str + "的年龄是：");
      int age = Integer.parseInt("20L"); // 数据类型转换，字符串变int
      System.out.println(age);
    } catch (Exception e) { // 获取异常信息，同时可以写一些处理异常的代码
      e.printStackTrace(); // 输出异常性质,扔出报错信息
    }
    System.out.println("program over"); // 前面的错误处理不影响后续代码执行。————模块化
  }
}
