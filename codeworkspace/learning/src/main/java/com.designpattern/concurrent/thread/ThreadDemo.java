package com.designpattern.concurrent.thread;

/**继承thread
 *
 * 我们new了3个Thread对象，即三个线程分别执行三个对象中的代码，因此便是三个线程去独立地完成卖票的任务
 *
 * Created by wei on 2017/4/19 0019.
 */
public class ThreadDemo extends Thread{

    private int ticket=5;
    private int no=0;

    public void run(){
        for(int i=0;i<10;i++){
            if(ticket>0){
                System.out.println("ThreadDemo ticket = "+ThreadDemo.currentThread()+ticket--);
            }
//            System.out.println("ThreadDemo no = "+ThreadDemo.currentThread().getName()+ ++no);
        }

    }

    public static void main(String[] args){
        new ThreadDemo().start();
        new ThreadDemo().start();
        new ThreadDemo().start();
    }
}
