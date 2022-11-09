package mypackage;


class Animal2{
    void eat(){System.out.println("eating...");}
}
class Dogg extends Animal2{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal2{
    void meow(){System.out.println("meowing...");}
}
public class HirarchicalInheretance {


        public static void main(String args[]){
            Cat c=new Cat();
            c.meow();
            c.eat();

        }
}
