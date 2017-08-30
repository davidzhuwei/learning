package com.designpattern.concurrent.thread;

/**实现runnable接口
 * 我们同样也new了3个Thread对象，但只有一个Runnable对象，3个Thread对象共享这个Runnable对象中的代码，
 * 因此，便会出现3个线程共同完成卖票任务的结果。如果我们new出3个Runnable对象，作为参数分别传入3个
 * Thread对象中，那么3个线程便会独立执行各自Runnable对象中的代码，即3个线程各自卖5张票。
 * Created by wei on 2017/4/21 0021.
 */
public class RunnableDemo implements Runnable{

    private int ticket=5;
    private int no=0;
    public void run() {
        for(int i=0;i<10;i++){
            if(ticket>0){
                System.out.println("RunnableDemo ticket = "+ ticket--);
            }
//            System.out.println("RunnableDemo no = "+no++);
        }

    }

    public static void main(String[] args){
        RunnableDemo runnableDemo=new RunnableDemo();
        new Thread(runnableDemo).start();
        new Thread(runnableDemo).start();
        new Thread(runnableDemo).start();
    }
}
