package day0719_ShuJuJieGou;


import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }

}



/*  字典（dictionary）

字典（Dictionary） 类是一个抽象类，它定义了键映射到值的数据结构。
当你想要通过特定的键而不是整数索引来访问数据的时候，这时候应该使用 Dictionary 。
由于Dictionary类是抽象类，所以它只提供了键映射到值的数据结构，而没有提供特定的实现。


    Java Dictionary 类

Dictionary 类是一个抽象类，用来存储键/值对，作用和Map类相似。
给出键和值，你就可以将值存储在Dictionary对象中。一旦该值被存储，就可以通过它的键来获取它。
所以和Map一样， Dictionary 也可以作为一个键/值对列表。

 */
// Dictionary 类已经过时了。在实际开发中，你可以实现 Map 接口来获取键/值的存储功能。

/*  Java Map 接口
Map接口中键和值一一映射. 可以通过键来获取值。
    给定一个键和一个值，你可以将该值存储在一个Map对象. 之后，你可以通过键来访问对应的值。
    当访问的值不存在的时候，方法就会抛出一个NoSuchElementException异常.
    当对象的类型和Map里元素类型不兼容的时候，就会抛出一个 ClassCastException异常。
    当在不允许使用Null对象的Map中使用Null对象，会抛出一个NullPointerException 异常。
    当尝试修改一个只读的Map时，会抛出一个UnsupportedOperationException异常。


 */