package org.HW3.Counter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Getter
public class Counter {

    Lock lock = new ReentrantLock();

    private int max = 200_000;
    private int value;
    private int threadLimit = 5;

    public void increment() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i<threadLimit; i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i< max / threadLimit; i++){
                        lock.lock();
                        value++;
                        lock.unlock();
                    }
                }
            });
            threads.add(t);
        }
        for (Thread t: threads){
            t.start();
        }
        for (Thread t: threads) {
            t.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getValue());
    }

}
