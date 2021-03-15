public class MyThread2 extends Thread{

    @Override
    public void run() {
        while (!this.isInterrupted()){
            System.out.println("running");
        }
    }
}
