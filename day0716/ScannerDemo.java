package day0716;

import java.util.Scanner;

/*  以下实例我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，
通过输入非数字来结束输入并输出执行结果：
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        double sum = 0;
        double m = 0;

        while (scan.hasNextLine()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum/m));
    }
}
