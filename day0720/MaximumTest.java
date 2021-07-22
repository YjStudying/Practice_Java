package day0720;

public class MaximumTest {
    //比较三个值并返回最大值
    public static < T extends Comparable<T> > T maximum(T x,T y,T z) {
        T max = x;  //假设x是初始最大值
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;     //返回最大对象
    }

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",3,4,5,maximum(3,4,5));

        System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "Max of %s, %s and %s is %s\n","pear", "apple", "orange", maximum( "pear", "apple", "orange" ) );
    }
}

/*  有界的类型参数的目的:
限制那些被允许传递到一个类型参数的类型种类范围。例如：一个操作数字的的方法可能只希望接受 Number 或者 Number 子类的实例。

要声明一个有界的类型参数，首先列出类型参数的名称，后跟 extends 关键字，最后紧跟它的上界。


 */