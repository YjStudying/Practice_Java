package day0714;

public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        //这个构造器只有一个参数：name
        System.out.println("名字是：" + name);
    }

    public void setAge(int age ) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("年龄是：" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args) {
        //创建一个 Puppy 对象
        Puppy myPuppy = new Puppy("tommy");
        //通过方法来设定age
        myPuppy.setAge(5);
        //调用另一个方法来获取age
        myPuppy.getAge();
        //通过下面的方法来访问成员变量
        System.out.println("成员变量：" + myPuppy.puppyAge);
    }
}
