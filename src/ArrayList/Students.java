package ArrayList;

public class Students {
  private String name;
  private int age;
  private float score;

  public Students(String name, int age, float score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }

  public Students() {}

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public float getScore() {
    return score;
  }
}
