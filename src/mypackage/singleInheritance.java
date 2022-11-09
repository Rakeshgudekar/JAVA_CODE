package mypackage;

public class singleInheritance {
    public static void main(String args[]){
        Animal d=new Animal();
       d.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("everyone have different sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("barking");}
}


