package com.designpattern.concurrent.thread;

/**
 * Created by zhu wei on 2017/6/2 0002.
 */
public class JoinTest implements Runnable {

    public static int count = 0;

    public void run() {
        for (int i = 0; i < 5; i++) {
            count = count + 1;
        }
    }

    /**
     * 方法join()则是主线程等待子线程完成，再往下执行
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Thread thread1= new Thread(new JoinTest());
        Thread thread2= new Thread(new JoinTest());
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
//        thread.join();////加入join()
//        for(int i=0;i<1000;i++){
//            System.out.print(i);
//        }
//        Thread.sleep(1000);
        System.out.println("thread1:"+thread1.getName());
        System.out.println("thread2:"+thread2.getName());
        System.out.println("count:"+count);
    }
}
