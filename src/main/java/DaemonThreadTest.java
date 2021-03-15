public class DaemonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setDaemon(true);
        // sleep 1 毫秒，打印 running
        myThread1.start();
        Thread.sleep(3);
        System.out.println("the end");
    }

}
