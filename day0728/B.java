package day0728;


//单继承
public class B extends A {      //B类是抽象类的子类，是一个普通类

    public B(){
        System.out.println("*****B类构造方法*****");
    }

    @Override
    public void print() {       //强制要求覆写
        System.out.println("Hello World！");
    }
}
