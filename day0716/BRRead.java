package day0716;
//使用 BufferedReader 在控制台读取字符

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        /*  Java 的控制台输入由 System.in 完成。
            为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader
        对象中来创建一个字符流。
            BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用
        readLine() 方法读取一个字符串。
         */
        //使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        //读取字符
        do {
            c = (char)br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}
