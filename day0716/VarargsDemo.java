package day0716;

/*  可变参数
    在方法声明中，在指定参数类型后加一个省略号(...)。
    一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在他之前声明。
 */

public class VarargsDemo {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(24,34,1,4,64.3);
        printMax(1,2,3);
    }

    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        int len = numbers.length;
        for (int i = 1; i < len;i ++) {
            if (numbers[i] > result ) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
