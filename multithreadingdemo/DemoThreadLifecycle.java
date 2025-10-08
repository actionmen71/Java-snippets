package com.krishna.multithreadingdemo;
public class DemoThreadLifecycle extends Thread{
    @Override
    public void run() {
        System.out.println("child Running");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie){}


    }

    public static void main(String[] args) throws InterruptedException{
        DemoThreadLifecycle thread = new DemoThreadLifecycle();
        thread.start();
        Thread.sleep(1000);
        thread.join();
        System.out.println("child thread "+ thread.getState());


    }
}


