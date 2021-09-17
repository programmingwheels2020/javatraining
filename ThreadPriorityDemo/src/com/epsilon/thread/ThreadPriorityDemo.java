package com.epsilon.thread;


class A extends Thread {
	public void run() {
		System.out.println("Thread A Running");
		for (int i = 0; i < 5; i++) {
			
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Thread B Running");
		for (int j = 0; j < 5; j++) {
			System.out.println("B " + j);
			
		}
	}
}

class C extends Thread {
	public void run() {
		System.out.println("Thread C Running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for (int k = 0; k < 5; k++) {
			System.out.println("C " + k);
		}
	}
}

public class ThreadPriorityDemo {
 
  
   public static void main(String args[]) {
	   A aThread = new A();
	   A a1Thread = new A();
	   A a2Thread = new A();
	   aThread.setName("ONE");
	   a1Thread.setName("TWO");
	   a2Thread.setName("THREE");
	   
	   aThread.start();
	   a1Thread.start();
	   a2Thread.start();
	   /*B bThread = new B();
	   C cThread = new C();
	   aThread.setPriority(Thread.MIN_PRIORITY);
	   bThread.setPriority(Thread.NORM_PRIORITY);
	   cThread.setPriority(Thread.MAX_PRIORITY);
	   aThread.setName("Lenin");
	   System.out.println("Thread A Started and the name is "+ aThread.getName());
	   aThread.start();
	   System.out.println("Thread B Started and the name is "+bThread.getName());
	   bThread.start();
	   System.out.println("Thread C Started"+ cThread.getName());
	   cThread.start();
	   System.out.println("A thread priority"+aThread.getPriority());
	   System.out.println("B thread priority"+bThread.getPriority());
	   System.out.println("C thread priority"+ cThread.getPriority());*/
	   
   }

}
