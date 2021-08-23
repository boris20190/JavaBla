package Object;
// 匿名对象
// 只能用一次，没法重复用
// 适用于只用一次的地方
public class AnonymousObject01 {
  public static void main(String[] args) {
    // 正常调用方法
    Person person = new Person();
    person.name = "史蒂夫";
    person.printName();
    System.out.println("==================");
    // 使用匿名对象：
    new Person().name = "alx"; // 这里给name赋值alx但下面输出为null
    new Person().printName(); // 因为每次new出的都是彼此独立。匿名对象只能使用一次，用完就作废
  }
}
