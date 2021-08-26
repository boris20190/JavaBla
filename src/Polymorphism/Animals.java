package Polymorphism;

public class Animals {

    abstract static class Animal {
       abstract void eat();
    }

    static class Cat extends Animal {

        @Override
        void eat() {
      System.out.println("猫吃鱼");
        }

        void work() {
      System.out.println("猫抓老鼠");
        }
    }

    static class Dog extends Animal{

        @Override
        void eat() {
      System.out.println("狗吃肉");
        }

        void work() {
      System.out.println("狗看家");
        }
    }

    public static void show(Animal animal) {
        if(animal instanceof Cat cat) {
            cat.eat();
            cat.work();
        } else if (animal instanceof Dog dog) {
            dog.eat();
            dog.work();
        }
    }

    public static void main(String[] args){
        show(new Cat());
        show(new Dog());
    }
}
