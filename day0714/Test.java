package day0714;
/*
java 运算符
*/

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        //算术运算符
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("查看  d++ 与 ++d 的不同：");
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        //关系运算符
        System.out.println("关系运算符：");
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        //位运算符
        int x = 60;     /* 60 = 0011 1100 */
        int y = 13;     /* 13 = 0000 1101 */
        int z = 0;
        z = x & y;      /* 12 = 0000 1100 */

    }
}
