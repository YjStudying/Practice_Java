package day0716;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);

        /*
        调用系统类 System 中的标准输出对象 out 中的方法 println() 。
         */
        System.out.println("The maximum between " + i + " and " + j + " is " + k);
    }


    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
    /* 方法重载
        一个类的两个方法拥有相同的名字，但是有不同的参数列表
        Java 编译器根据方法签名判断那个方法应该被调用
        重载的方法必须拥有不同的参数列表，你不能仅仅依据修饰符或者返回类型的不同来重载方法。
     */
    public static double max(double num1, double num2) {

        if (num1 > num2)
            return num1;
        else
            return num2;
    }

}
