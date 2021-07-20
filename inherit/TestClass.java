package inherit;

public class TestClass {

    /*  此时，在SubClass类的对象身上会有两个叫num的属性。
    来自父类的存放在父类对象部分，来自子类的存放在子类特有部分。
        这个时候如果用子类引用调用num属性，是操作的子类中的字符串num；
    用父类引用调用num属性，操作的是从父类继承而来的整型num。
     */

    public static void main(String[] args) {
        SubClass sub = new SubClass();      //子类引用指向子类对象
        System.out.println(sub.num);    //打印：hello

        SuperClass sup = (SuperClass)sub;   //父类引用指向同一个子类对象
        System.out.println(sup.num);    //打印：10
    }
}
    /*  子类可以拥有和父类同名方法，复合重写规范的话会发生覆盖。
    方法重写的规范包括：
        1.方法名相同；
        2.参数列表相同（包括参数个数、类型、顺序三者都相同）；
        3.返回类型相同；
        4.子类方法的访问修饰符不能小于父类方法的访问修饰符；
        5.子类方法的方法声明不能比父类方法的方法声明抛出更多的异常。

        只有这5点都满足的情况下，才会发生重写；否则会报错或两个方法共存（重载）。
     */