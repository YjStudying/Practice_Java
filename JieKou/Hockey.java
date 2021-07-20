package JieKou;

/*
Hockey 接口自己声明了四个方法，从 Sports 接口继承了两个方法，这样，实现 Hockey 接口的类需要实现六个方法。
*/

public interface Hockey extends Sports {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}


/*  在 Java 中，累的多重继承是不合法的，但接口允许多重继承。
在接口的多重继承中 extends 关键字只需要使用一次，在其后跟着继承接口。如下：
    public interface Hockey extends Sports, Event

以上的程序片段是合法定义的子接口，与类不同的是，接口允许多重继承，而 Sports 及 Event 可能定义或是继承相同的方法


        标记接口
最常用的继承接口是没有包含任何方法的接口。
标识接口是没有任何方法和属性的接口.它仅仅表明它的类属于一个特定的类型,供其他代码来测试允许做一些事情。

*/