package day0804;

/*
    多个类的继承中初始化块、静态初始化块、构造器的执行顺序
在继承中，先后执行父类 BaseOne 的静态块、父类 BaseTwo 的静态块，最后子类的静态块
然后再执行父类 BaseOne 的非静态块和构造器，然后是 BaseTwo 类的非静态块和构造器，最后执行子类的非静态块和构造器
 */


public class BaseDemo {

    public static void main(String[] args) {
        BaseThree baseThree = new BaseThree();
        System.out.println("-----");
        BaseThree baseThree2 = new BaseThree();
    }

}
