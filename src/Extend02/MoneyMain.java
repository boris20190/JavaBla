package Extend02;

import java.util.ArrayList;

public class MoneyMain {
  public static void main(String[] args) {
    // 声明各个成员并起名赋钱数
    Manager manager = new Manager("群主", 200);
    Member one = new Member("A", 0);
    Member two = new Member("B", 0);
    Member three = new Member("C", 0);
    Member four = new Member("D", 0);
    Member five = new Member("E", 0);
    Member six = new Member("F", 0);
    // 展示一下姓名和钱数
    manager.show();
    one.show();
    two.show();
    three.show();
    four.show();
    five.show();
    six.show();
    System.out.println("========================");
    // 创建redList变量，输入红包总面额和要分的份数
    ArrayList<Integer> redList = manager.send(50, 6);
    // 成员接收红包
    one.receive(redList);
    two.receive(redList);
    three.receive(redList);
    four.receive(redList);
    five.receive(redList);
    six.receive(redList);
    // 再次展示各个成员的姓名和金额
    manager.show();
    one.show();
    two.show();
    three.show();
    four.show();
    five.show();
    six.show();
  }
}
