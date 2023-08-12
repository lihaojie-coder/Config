package com.example.mybatisplus.study;

import java.util.Date;

public class MyRunnable implements Runnable{
    private String command;
    public MyRunnable(String s){
        this.command = s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Strat.Time = "+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+"End.Time = "+new Date());

    }

    private void processCommand(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public String toString(){
        return this.command;
    }
}
