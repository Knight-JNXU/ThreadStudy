public class Demo1 {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("1");
        // 变成守护线程（服务线程）
//        myThread1.setDaemon(true);

//        myThread1.interrupt();
//        System.out.println(myThread1.isInterrupted());
        System.out.println(myThread1.interrupted());
    }

}
