package day0722_DuoXianCheng;

/*  创建一个线程
Java 提供了两种创建线程的方法：
    通过实现 Runnable 接口；
    通过继承 Thread 类本身。

 */

// 创建一个新的线程
public class NewThread implements Runnable {
    Thread t;
    NewThread() {
        //创建第二个线程
        t = new Thread(this, "Demo Thrad");
        System.out.println("Child thread: " + t);
        t.start();      // 开始线程
    }

    //第二个线程入口
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                //暂停线程
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

/*  Java 多线程编程
进程：一个进程包括由操作系统分配的内存空间，包含一个或多个线程。
一个线程不能独立的存在，它必须是进程的一部分。
一个进程一直运行，直到所有的非守候线程都结束运行后才能结束。

    一个线程的生命周期
新建状态: 一个新产生的线程从新状态开始了它的生命周期。它保持这个状态直到程序start这个线程。

运行状态:当一个新状态的线程被start以后，线程就变成可运行状态，一个线程在此状态下被认为是开始执行其任务

就绪状态:当一个线程等待另外一个线程执行一个任务的时候，该线程就进入就绪状态。
当另一个线程给就绪状态的线程发送信号时，该线程才重新切换到运行状态。

终止状态：一个运行状态的线程完成任务或者其他终止条件发生，该线程就切换到终止状态。
 */


