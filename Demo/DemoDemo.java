package Demo;

public class DemoDemo {

    public static void main(String[] args) {

        FinalDemo demo1 = new FinalDemo();
        FinalDemo demo2 = new FinalDemo();
        System.out.println("final修饰的 i=" + demo1.i);
        System.out.println("static修饰的 t=" + demo1.t);
        System.out.println("final修饰的  i=" + demo2.i);
        System.out.println("static修饰的 t=" + demo2.t);

        System.out.println("t+1= "+ ++demo2.t );
        //System.out.println( ++demo2.i);  //无法为最终变量 i 分配值
    }
}
