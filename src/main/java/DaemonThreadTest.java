public class DaemonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setDaemon(true);
        myThread1.run();
        Thread.sleep(3);
        System.out.println("the end");
    }

}
