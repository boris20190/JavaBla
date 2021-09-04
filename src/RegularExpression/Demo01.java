package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {
  public static void main(String[] args) {
    String content = "a11c8";
    String regStr = "[a-z]"; // 匹配a-z任意一个字符
    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) { // matcher.find()用来判断
      System.out.println("找到：" + matcher.group(0)); // 匹配到的是储存在group中的
    }
  }
}
