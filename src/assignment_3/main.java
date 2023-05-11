package assignment_3;
//•	Write a Program to demonstrate the use of Multithreading.

class thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 140; i++) {
            System.out.println("Thread 1 is running");
        }
    }
}

class thread2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<130;i++){
           System.out.println("Thread 2 is running");
        }
    }
}


public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread t3 = new Thread(t2);
        t1.start();
        t3.start();
    }
}
