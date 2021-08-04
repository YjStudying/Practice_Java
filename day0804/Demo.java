package day0804;

// 静态导包(不建议)
//  Math. --- 将Math中的所有静态资源导入，这时候可以直接使用里面的静态方法，而不用通过类名进行调用
//  如果只想导入单一某个静态方法，只需要将换成对应的方法名即可

import static java.lang.Math.*;


public class Demo {
    public static void main(String[] args) {
        int max = max(2,12);
        System.out.println(max);
    }
}
