package day0804;

public class BaseTwo extends BaseOne {
    public BaseTwo() {
        System.out.println("BaseTwo构造器");
    }

    {
        System.out.println("BaseTwo初始化块");
    }

    static {
        System.out.println("BaseTwo静态初始化块");
    }

}
