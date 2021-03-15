public class MyThread1 extends Thread {

    public MyThread1(String name) {
        super(name);
    }

    public MyThread1() {
    }

    @Override
    public void run() {
        while (true){
            System.out.println("running");
        }
    }
}
