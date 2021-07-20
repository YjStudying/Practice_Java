package FengZhuang;

//  Java 封装
/*  在面向对象程式设计方法中，封装（英语：Encapsulation）是指一种将抽象性函式接口的实现细节部分包装、隐藏起来的方法。

    封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。

    要访问该类的代码和数据，必须通过严格的接口控制。

    封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

    适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。

 */

public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge( int newAge ) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}

/*  以上实例中 public 方法是外部类访问该类成员变量的入口
    通常情况下，这些方法被称为 getter 和 setter 方法。
    因此，任何要访问类中私有成员变量的类都要通过这些 getter 和 setter 方法。


    封装的步骤：
    1.修改属性的可见性来限制对属性的访问（一般限制为private）
    2.对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法，用于对私有属性的访问
    3.重写从父类Object继承下来的toString()方法，来输出自己想要的信息。
    4.重写从父类Object继承的hashCode()方法，计算hashCode值，hashCode值主要用来判断对象的属性是否相同，进行数组的排序。
    5.重写从父类Object继承的equals()方法，判断两个对象属性值是否完全相同。
 */