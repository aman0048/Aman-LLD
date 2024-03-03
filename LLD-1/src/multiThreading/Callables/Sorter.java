package multiThreading.Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> list;

    Sorter(List<Integer> list){
        this.list = list;
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

        Sorter leftSorter = new Sorter(leftList);
        Sorter rightSorter = new Sorter(rightList);

        leftList = leftSorter.call();
        rightList = rightSorter.call();

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
