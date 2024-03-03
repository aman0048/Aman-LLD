package multiThreading.Callables;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
//        List<Integer> list = List.of(7,3,1,2,4,6,17,12);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Sorter sorter = new Sorter(list);
        // This will not create a multiple threads, only a single thread object, So may need to pass executorService object, to start multiple threads
//        List<Integer> output = executorService.submit(sorter).get();
        //sout(output)



        List<Integer> list = List.of(7,3,1,2,4,6,17,12);
        ExecutorService executorService = Executors.newCachedThreadPool();
        SorterCall sorter = new SorterCall(list, executorService);
        Future<List<Integer>> output = executorService.submit(sorter);
        System.out.println("Some Unrelated work");

        System.out.println(output.get());
        executorService.shutdown();
    }


}
