import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listing1501 {

    int size;


    static void fillList(List list) {
        for (int i = 0; i < 10; ++i) {
            Object o = new Object();
            list.add(o);
        }

        list.remove("1");
        list.remove(0);
    }

    static void printList(List list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.println((Object) list.get(i));
        }
        System.out.println("---");
    }

    public static void main(String[] args) {

        //Erzeugen der LinkedList
        LinkedList list1 = new LinkedList();
        fillList(list1);
        printList(list1);

        //Erzeugen der ArrayList
        ArrayList list2 = new ArrayList();
        fillList(list2);
        printList(list2);

        Object o = list1.get( 1 );
        System.out.println( o );

        //Test von removeAll
        list2.remove("9");
        list1.removeAll(list2);
        printList(list1);
    }



}

