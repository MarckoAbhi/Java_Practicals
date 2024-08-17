/*import java.sql.SQLOutput;

class Animal {
 void eat() {
     System.out.println("eating...");
 }
 class Dog extends Animal {
     void bark() {
         System.out.println("barking...");
     }
 }
 class Cat extends Animal{
     void meow(){
         System.out.println("meowing...");
     }
 class TestInheritance3{
        public void main(String args[]){
            Cat c = new Cat();
            c.meow();
            c.eat();
        }
 }
 }
}*/


public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3, j = 5;
        System.out.println(i++ + ++j);
        System.out.println(i + j);
        System.out.println(++i + j++);
        System.out.println("i=" + i + ", j=" + j);
    }
}