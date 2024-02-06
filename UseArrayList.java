import java.util.ArrayList; // arraylist package import in code

// import java.util.*; <- means sarv import kar as saa asto

public class UseArrayList {
    public static void main(String[] args) {
        // Part of Java Collection Frameworks
        // Classname objectName = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add operation 
        list.add(1);  // TC -> O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        list.add(0,9); // postion no.0 var 9 add kela bahi 

        System.out.println(list);

        // Get Operation
        int Element = list.get(2);
        System.out.println(Element);
        System.out.println(list.get(3));

        // Delete
        list.remove(2);
        System.out.println(list);

        // Set-Operation
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.set(3,11));
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));


    }    
}