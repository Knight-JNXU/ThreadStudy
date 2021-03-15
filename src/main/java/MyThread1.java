public class MyThread1 extends Thread {

    public MyThread1(String name) {
        super(name);
    }

    public MyThread1() {
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running");
        }
    }
}
