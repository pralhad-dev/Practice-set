package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for (Integer i : list) {
            System.out.print(i+" ");
        }

        System.out.println();
        int max = list.get(0);

        for (int i=0;i<list.size();i++){
            if (list.get(i) >max) {
                max =list.get(i);
            }
        }
        System.out.println("Max:"+max);


        //remove even
        for (int i=0;i<list.size();i++){
            if (list.get(i) %2 ==0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Odd:"+list);

        //print reverse

        int  i=0, j=list.size()-1;

        while (i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println("REVERSE:"+list);

        list.add(5);
        list.add(5);
        list.add(2);
        //remove duplicates
        ArrayList<Integer> removeDuplicates = new ArrayList<>();

        for (int x : list) {
            if (!removeDuplicates.contains(x)) {
                removeDuplicates.add(x);
            }
        }
        System.out.println("After Remove:"+removeDuplicates);

        // frequency count
        ArrayList<Integer> visited = new ArrayList<>();

        for (int m = 0; m < list.size(); m++) {
            int current = list.get(i);

            if (visited.contains(current)) {
                continue;
            }

            int count = 0;
            for (int n = 0; n < list.size(); n++) {
                if (list.get(j) == current) {
                    count++;
                }
            }

            visited.add(current);
            System.out.println(current + " -> " + count);
        }
    }
}
