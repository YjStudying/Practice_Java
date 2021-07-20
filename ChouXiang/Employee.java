package ChouXiang;

/*      Java 抽象类
    抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
    由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
    父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。
 */

public abstract class Employee {
    //包含3个成员变量、7个成员方法和1个构造方法
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number) {
        System.out.println("");
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}
