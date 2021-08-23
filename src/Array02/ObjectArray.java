package Array02;

import java.util.Scanner;

// 对象数组，和C语言结构体差不多，
public class ObjectArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println('\t' + "录入个人信息");
    System.out.println("====================");
    System.out.println("输入要录入的人数：");
    int num = scanner.nextInt();
    System.out.println("====================");
    Person[] people = new Person[num];
    for (int i = 0; i < num; i++) {
      System.out.println("姓名：");
      String name = scanner.next();
      System.out.println("年龄：");
      int age = scanner.nextInt();
      people[i] = new Person(name, age);
      System.out.println("====================");
    }
    System.out.println("你输入的信息如下：");
    for (int i = 0; i < num; i++) {
      System.out.println(people[i].getName() + '\t' + people[i].getAge());
    }
  }
}
