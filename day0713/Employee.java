package day0713;

import java.io.*;
public class Employee {
    //salary 是静态的私有变量
    private static double salary;
    //DEPARTMENT 是一个常量
    public static final String DEPARTMENT = "开发部";
    public static void main(String args[]){
        salary = 1000;
        System.out.println(DEPARTMENT + "平均薪水：" + salary);
    }
}
