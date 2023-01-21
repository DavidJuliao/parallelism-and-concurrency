import java.util.ArrayList;
import java.util.List;

public class Collections {
    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        list = java.util.Collections.synchronizedList(list);
        MyRunnable myRunnable = new MyRunnable();
        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(list);

    }
    public static  class  MyRunnable implements Runnable{

        @Override
        public void run() {
            list.add("Test");
            System.out.println(String.format("%s inseriu na lista", Thread.currentThread().getName()));
        }
    }
}
