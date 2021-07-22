package day0722_DuoXianCheng;

/*  通过继承 Thread 来创建线程
创建一个线程的第二种方法是创建一个新的类，该类继承 Thread 类，然后创建一个该类的实例。
继承类必须重写 run() 方法，该方法是新线程的入口点。他也必须调用 start() 方法才能执行。
 */

//通过继承 Thread 创建线程
public class NewThread2 extends Thread {
    NewThread2() {
        //创建第二个线程
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();    //开始线程
    }
    // 第二个线程入口
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
