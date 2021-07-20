package day0719_ShuJuJieGou;

import java.util.Vector;
import java.util.Enumeration;

/*
    枚举（Enumeration）接口虽然它本身不属于数据结构,但它在其他数据结构的范畴里应用很广。
    枚举（The Enumeration）接口定义了一种从数据结构中取回连续元素的方式。
 */

public class EnumerationTester {

    public static void main(String args[]) {
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}

/*  在 Java 中的数据结构主要包括以下几种接口和类：
枚举（Enumeration）
位集合（BitSet）
向量（Vector）
栈（Stack）
字典（Dictionary）
哈希表（Hashtable）
属性（Properties）

以上这些类是传统遗留的，在 Java2 中引入了一种新的框架-集合框架（Collection）。

*/