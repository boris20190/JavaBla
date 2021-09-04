package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {
  public static void main(String[] args) {
    // 匹配邮箱：
    //   任意数字，字符，英文字母+@+任意字母.+任意字母
    String content = "borisklei@boris2019.onmicrosoft.com";
    String regStr = "^[\\w-]+@([\\w-]+\\.)+([a-zA-Z]+)$"; // 最好加上定位符^$,其中的()是分组的作用，对应的是.group中的组别1，2
    // group(0)是默认总字符

    if (content.matches(regStr)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    Pattern pattern = Pattern.compile(regStr);
    Matcher matcher = pattern.matcher(content);

    while (matcher.find()) {
      System.out.println(matcher.group(0)); // 输出borisklei@boris2019.onmicrosoft.com
      System.out.println(matcher.group(1)); // 输出onmicrosoft.
      System.out.println(matcher.group(2)); // 输出com
    }
  }
}
