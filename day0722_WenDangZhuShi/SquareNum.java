package day0722_WenDangZhuShi;

import java.io.*;
import java.util.Stack;

/**
 * This class demonstrates documentation comments.
 * @author shili
 */
public class SquareNum {
    /**
     * This method returns the square of num.
     * This is a multiline description. You can use as many lines as you like.
     * @param num The value to be squared.
     * @return num squared.
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * This method inputs a number from the user.
     * @return The value input as a double.
     * @exception IOException On input error.
     * @see IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;
        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * This method demonstrates square().
     * @param args Unused.
     * @return Nothing.
     * @throws IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Squared value is " + val);
    }
}





//  Java 只有三种注释方式。前两种分别是 // 和 /* */，第三种被称作说明注释，它以/** 开始，以 */结束。

//  说明注释允许你在程序中嵌入关于程序的信息。

//  你可以使用 javadoc 工具软件来生成信息，并输出到 HTML 文件中。

/*  Javadoc 输出什么
javadoc 工具将你 Java 程序的源代码作为输入，输出一些包含你程序注释的 HTML 文件。

每一个类的信息将在独自的 HTML 文件里。 javadoc 也可以输出继承的树形结构和索引。

由于 javadoc 的实现不同，工作也可能不同，你需要检查你的Java开发系统的版本等细节，选择合适的Javadoc版本。

 */
