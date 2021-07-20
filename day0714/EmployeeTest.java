package day0714;

import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        //使用构造器创建两个对象
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        //调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级软件工程师");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("软件工程师");
        empTwo.empSalary(500);
        empTwo.printEmployee();

    }
}
