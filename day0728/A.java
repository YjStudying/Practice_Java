package day0728;

abstract class A {

    public A(){
        System.out.println("*****A类构造方法*****");
    }

    public void fun() {     //普通方法
        System.out.println("存在方法体的方法");
    }
    public abstract void print();   //抽象方法，没有方法体，有abstract关键字做修饰
}
