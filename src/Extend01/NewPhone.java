package Extend01;

public class NewPhone extends Phone {
  @Override
  public void show() {
    super.show(); // 使用父类中的对应方法，避免覆盖掉
    System.out.println("显示姓名");
    System.out.println("显示头像");
  }
}
