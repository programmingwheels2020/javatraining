package com.epslion.thread;
/*
class Table{
	public void print(int n) {
		 for (int i=0;i<=5;i++) {
			 System.out.println(n*i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
	}
}
*/

/// counter =0 

class Counter {
	public int counter;

	public Counter(int counter) {
		this.counter = counter;
	}

	public void increment() {

		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("Current Thread is " + Thread.currentThread().getName());
				System.out.println("It is called" + this.counter);

				this.counter++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	public synchronized void decrement() {
		 for ( int i=0;i<3;i++) {
			 System.out.println("Current Thread is " + Thread.currentThread().getName());
			 this.counter--;
		 }
		 notifyAll();
	}
}

class CounterThread extends Thread {
	Counter counter;

	public CounterThread(Counter counter) {

		this.counter = counter;
	}

	public void run() {

		counter.increment();
		counter.decrement();

	}
}

public class ThreadSyncDemo {

	public static void main(String[] args) {
		Counter c = new Counter(0);
		CounterThread ct = new CounterThread(c);
		CounterThread ct1 = new CounterThread(c);
		
		ct.setName("Thread One");
		ct1.setName("Thread Two");
		ct.start();
		ct1.start();
		// c.increment();
		System.out.println(c.counter);

	}

}
