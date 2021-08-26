package Lucky_Money01;

import java.util.ArrayList;
// 群主
public class Manager extends User {
  public Manager() {}

  public Manager(String name, int money) {
    super(name, money);
  }

  public ArrayList<Integer> send(int totalMoney, int count) { // 定义数值型集合方法
    ArrayList<Integer> redList = new ArrayList<>();

    int leftMoney = super.getMoney(); // 获取当前余额
    if (totalMoney > leftMoney) {
      System.out.println("余额不足！");
      return redList; // 返回空集合
    }

    super.setMoney(leftMoney - totalMoney); // 扣钱

    int avg = totalMoney / count; // 把钱分count份
    int mod = totalMoney % count; // 除不开的零头
    // 为了方便，把零头放入最后一个红包
    for (int i = 0; i < count - 1; i++) { // 把钱塞进红包
      redList.add(avg);
    }
    // 最后一个红包特殊处理
    int last = avg + mod;
    redList.add(last);

    return redList;
  }
}
