public class Threads {

    public static void main(String[] args){
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println(threadName);

        Thread executor = new Thread(new MyRunnable());
        executor.start();

        Thread executor1 = new Thread(() -> System.out.println("Hello World Thread!"));
        executor1.start();
    }
}
