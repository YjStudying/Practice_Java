package day0715;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        //初始化 Date 对象
        Date date = new Date();

        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date：" + ft.format(date));


        //解析字符串为时间
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft1.parse(input);
            System.out.println(t);
        } catch (ParseException e ) {
            System.out.println("Unparseable using " + ft1);
        }
    }
}
