package Extend02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
  public Member() {}

  public Member(String name, int money) {
    super(name, money);
  }

  public void receive(ArrayList<Integer> list) {
    // 从那些红包中随机摇出一个
    int index = new Random().nextInt(list.size());
    // 把摇出的那个红包删除并且把里面的钱数赋值给delta
    int delta = list.remove(index);
    // 获取原有金额
    int money = super.getMoney();
    // 把加上delta的金额重新赋值回去
    super.setMoney(money + delta);
  }
}
