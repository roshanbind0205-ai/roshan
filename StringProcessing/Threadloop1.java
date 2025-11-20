package com.roshan.StringProcessing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threadloop1 extends Thread {

    public Threadloop1(int interval) {
        this.interval = interval;
    }
    int interval;

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print(i);
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadedLoop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        try {
            ThreadedLoop t1 = new ThreadedLoop(100);
            ThreadedLoop t2 = new ThreadedLoop(500);
//       t1.run();
//       t2.run();
//
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("After Thread run is finished");
        } catch (InterruptedException ex) {
            Logger.getLogger(Threadloop1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
