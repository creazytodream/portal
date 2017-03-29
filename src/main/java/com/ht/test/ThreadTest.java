package com.ht.test;

/**
 * Created by Administrator on 2017/3/22.
 */

/**
 *
 *  四个线程a,b,c,d. 线程a,b对变量i加一.

 * 线程c,d对变量i减去一.四个线程顺序执行,

 * 每个线程每次只执行一次.i的初始值为0，

 * 打印结果0 1 2 1 0 1 2 1 0 1 2...
 *
 *
 */
public class ThreadTest {



    public   void  test(){

        RunableA runableA= new RunableA();

    }



    int  i=0;
    //线程A
    class  RunableA   implements  Runnable{


        @Override
        public void run() {
            i=i+1;
        }
    }


    class  RunableB implements  Runnable{
        @Override
        public void run() {
            i=i+1;
        }

    } class  RunableC implements  Runnable{
        @Override
        public void run() {
            i=i-1;
        }

    }
    class  RunableD implements  Runnable{
        @Override
        public void run() {
            i=i-1;
        }

    }




}
