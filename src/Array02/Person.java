package Array02;

public class Person {
  private String name;
  private int age;

  public Person() {} // 有啥其他要执行的写这里面

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return null;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return null;
  }
}
