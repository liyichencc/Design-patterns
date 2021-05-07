import java.util.Random;
import java.util.concurrent.*;


/**
 * @Description
 * @Author v_liyichen
 * @date 2020.12.16 11:32
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService se
                = new ThreadPoolExecutor(5,10,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(6));

       final Random r = new Random();
        for (int i = 0; i < 50; i ++) {
            se.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        long l = r.nextInt(1000);
                        System.out.println(l);
                        Thread.sleep(l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        Thread.sleep(10000000000L);
    }
}
