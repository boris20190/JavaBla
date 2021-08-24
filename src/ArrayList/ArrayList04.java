package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList04 {
  public static void main(String[] args) {
    ArrayList<Integer> large = new ArrayList<>();
    ArrayList<Integer> small = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      large.add(new Random().nextInt(100) + 1);
    }

    for (Integer integer : large) {
      if (integer % 2 == 0) {
        small.add(integer);
      }
    }

    System.out.println(small);
  }
}
