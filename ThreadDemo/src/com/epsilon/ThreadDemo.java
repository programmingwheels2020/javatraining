package com.epsilon;

//creating thread by extending Thread Class
class PrinterThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("This is printed from thread "+i);	
		}
		
	}
}

//two ways, extending Thread class and Implementing Runnable interface


//Creating a thread by implementing Runnable interface


class EditorThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("This is printed from Runnable Thread "+i);	
		}
		
	}
	
}

//Thread Scheduler

// Preempive Scheduling , time slicing


public class ThreadDemo {

	public static void main(String[] args) {
		
		PrinterThread pt = new PrinterThread();
		pt.setPriority(Thread.MIN_PRIORITY);
		EditorThread et = new EditorThread();
		
		Thread t = new Thread(new EditorThread());
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		pt.start();
		System.out.println("This is thread priority for printrer thread"+pt.getPriority());
		System.out.println("This is thread priority for editor thread"+t.getPriority());
		
		
		/*for(int i=0;i<10;i++) {
			System.out.println("This is printed from Main  "+i);	
		}*/

	}
	
	

}
