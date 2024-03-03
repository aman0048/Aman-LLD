package multiThreading.Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class SorterCall implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService executorService;

    SorterCall(List<Integer> list, ExecutorService executorService){
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (list.size() <= 1){
            return list;
        }

        int n = list.size();
        int mid = n/2;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for (int i = 0; i<n; i++){
            if (i < mid){
                leftList.add(list.get(i));
            }else{
                rightList.add(list.get(i));
            }
        }

        SorterCall leftSorter = new SorterCall(leftList,executorService);
        SorterCall rightSorter = new SorterCall(rightList,executorService);

        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        leftList = leftFuture.get();
        rightList = rightFuture.get();

        List<Integer> output = new ArrayList<>();
        int i = 0, j = 0;

        while (i < leftList.size() && j < rightList.size()){
            if (leftList.get(i) < rightList.get(j)){
                output.add(leftList.get(i));
                i++;
            }
            else {
                output.add(rightList.get(j));
                j++;
            }
        }

        while (i < leftList.size()){
            output.add(leftList.get(i));
            i++;
        }

        while (j < rightList.size()){
            output.add(rightList.get(j));
            j++;
        }
        return output;
    }
}
