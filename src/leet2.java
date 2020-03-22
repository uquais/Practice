import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;

public class leet2 {

    public static void main(String[] args) {
        LinkedList mylist1 = new LinkedList();
        LinkedList mylist2 = new LinkedList();

        mylist1.add(2);
        mylist1.add(4);
        mylist1.add(3);

        mylist2.add(5);
        mylist2.add(6);
        mylist2.add(4);

        System.out.println(mylist2.get(1));


    }
}
