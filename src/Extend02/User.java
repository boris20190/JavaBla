package Extend02;
// alt+insert直接构造函数
public class User {
  private String name; // 用户名
  private int money; // 当前用户拥有的钱数

  public User() {}

  public void show() {
    System.out.println("我叫：" + name + "，我有多少钱：" + money);
  }

  public User(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
}
