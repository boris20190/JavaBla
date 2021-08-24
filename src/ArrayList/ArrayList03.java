package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
  public static void main(String[] args) {
    ArrayList<Students> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入学生个数：");
    int num = scanner.nextInt();
    System.out.println("==========");
    System.out.println("开始录入：");
    for (int i = 0; i < num; i++) {
      System.out.println("姓名：");
      String name = scanner.next();
      System.out.println("年龄：");
      int age = scanner.nextInt();
      System.out.println("成绩：");
      float score = scanner.nextFloat();
      arrayList.add(new Students(name, age, score));
      System.out.println("==========");
    }
    System.out.println("已经录入的学生信息如下：");
    System.out.println("姓名：" + '\t' + "年龄：" + '\t' + "分数：");
    for (Students students : arrayList) {
      System.out.println(
          students.getName() + '\t' + students.getAge() + '\t' + '\t' + students.getScore());
    }
    System.out.println("==========");
    System.out.println("筛选：");
    System.out.println("分数大于100的学生有：");
    for (Students students : arrayList) {
      if (students.getScore() > 100) {
        System.out.println(students.getName());
      }
    }
  }
}
