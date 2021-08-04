package day0804;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {

    //声明为 private 避免调用默认构造方法创建对象
    private Singleton() {
    }

    //声明为 private 表明该静态内部类只能在该 Singleton 类中被访问
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/*
    当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用
getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。

    这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */

