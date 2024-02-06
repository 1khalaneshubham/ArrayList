import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListWithCollection {
    
    public static void Swap(ArrayList<Integer>list,int idx1,int idx2){

        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);   // ascending
        System.out.println(list);

        // Descending
        Collections.sort(list,Collections.reverseOrder());
        //Comparator -> Fnx Logic
        System.out.println(list);
    }
}
