package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {
  public static void main(String[] args) {
    // 不区分大小写
    String content = "a11c8abcABC";
    String regStr = "(?i)abc"; // 前面加上(?!)表示不区分大小写
    // 如果是bc不区分大小写：a(?!)bc
    // 如果是b不区分大小写：a((?!)b)c
    // (?!)后面是区分大小写的，如果有括号，就是包含它的括号内不区分大小写
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);
    // 不区分大小写第二种方法：
    // 在Pattern.compile()括号中除去regStr再加上Pattern.CASE_INSENSITIVE,中间用 , 隔开
    while (matcher.find()) {
      System.out.println("找到：" + matcher.group(0));
    }
  }
}
