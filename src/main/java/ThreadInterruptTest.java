public class ThreadInterruptTest {

    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        Thread.sleep(1);
        myThread2.interrupt();
    }

}
