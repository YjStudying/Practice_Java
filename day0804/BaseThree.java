package day0804;

public class BaseThree extends BaseTwo {

    public BaseThree() {
        System.out.println("BaseThree构造器");
    }

    {
        System.out.println("BaseThree初始化块");
    }

    static {
        System.out.println("BaseThree静态初始化块");
    }

}
