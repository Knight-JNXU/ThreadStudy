public class Demo3 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        }){
            public void run(){
                System.out.println("sub");
            }
        }.start();
    }

}
