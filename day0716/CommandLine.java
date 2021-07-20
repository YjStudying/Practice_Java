package day0716;

/*  构造方法
        当一个对象被创建的时候，构造方法用来初始化该对象。
        构造方法和它所在类的名字相同，但构造方法没有返回值。

 */

public class CommandLine {
    public static void main(String[] args) {
        int len = args.length;
        for ( int i = 0; i < len ;i++) {
            System.out.println("args[" + i + "]：" + args[i]);
        }
    }
}
