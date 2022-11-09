package mypackage;


class A {
    public int a;
    public A() {
        this(-1);
    }
    public A(int a) {
        this.a = a;
    }
    public String toString() {
        return "[ a= " + this.a + "]";
    }
}
public class ConstructorOverloading {
    public static void main(String args[]) {
        A a = new A(10);
        System.out.println(a);
        A a1 = new A();
        System.out.println(a1);
    }
}
