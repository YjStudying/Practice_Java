package day0728;

public class TestDemo {

    /*
    public static void main(String[] args) {
        A a = new A();      //A是抽象的，无法直接进行实例化操作
    }
     */

    public static void main(String[] args) {
        A a = new B();      //向上转型
        a.print();          //被子类所覆写过的方法
    }

}
