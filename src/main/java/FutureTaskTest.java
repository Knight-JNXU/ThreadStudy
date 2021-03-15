import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTaskTest futureTaskTest = new FutureTaskTest();
        FutureTask<Integer> task = new FutureTask<Integer>(futureTaskTest);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("main running");
        Thread.sleep(3);
        Integer result = task.get();
        System.out.println("result:" + result);
    }
}
