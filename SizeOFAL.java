import java.util.ArrayList;

public class SizeOFAL {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Add operation 
        list.add(1);  // TC -> O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Size of given ArrayList is "+list.size()+" aahe"); // <- hi methed aahe bhava

        // Print the ArrayList
        for(int i = 0; i<list.size(); i++){
            System.out.print(+list.get(i)+" ");
        }
        System.out.println(" ");
    }
}
