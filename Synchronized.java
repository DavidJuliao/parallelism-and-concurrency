public class Synchronized {
    public static int num = -1;
    public static void main(String [] args) {

        MyRunnableTwo myRunnable = new MyRunnableTwo();
        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        Thread t4 = new Thread(myRunnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    public static  class  MyRunnableTwo implements Runnable{

        @Override
        public synchronized void run() {
            num++;
            System.out.println(Thread.currentThread().getName() + " " + num);
        }
    }

}
