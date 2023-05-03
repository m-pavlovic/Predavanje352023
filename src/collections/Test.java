package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

    public static <E> void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(7);
        populateList(lst, 7);
        System.out.println(lst);
        lst.add("NOVI");
        lst.add("NOVI");
        System.out.println(lst);
        HashSet<String> set1 = new HashSet<>(lst);
        System.out.println(set1);
        for (Object element : set1) {
            System.out.println(element);
        }
        for (Object element : lst) {
            System.out.println(element);
        }
    }


//    private static void populateList(ArrayList<String>lst, int numElements) {
//        String base = "base";
//        for (int i = 0; i < numElements; i++) {
//            base+=i;
//            lst.add(base);
//        }
//    }

    private static <E> void populateList(ArrayList<E> list, int elements) {

        for (int i = 0; i < elements; i++) {
            E element = (E) new Object();
            System.out.println("Added new element: " + element);
            list.add(element);
        }

    }
}
