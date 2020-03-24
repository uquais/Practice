import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;

public class leet2 {


    public static void main(String[] args) {
        String fList= "";
        String sList= "";
        LinkedList addTwoNumbers = new LinkedList();
        String res;
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);


        for (int i =l1.size()-1 ; i >=0 ; i--) {

            fList = fList+l1.get(i);

        }
        for (int i =l2.size()-1 ; i >=0 ; i--) {

            sList = sList+l2.get(i);

        }
//        System.out.println("my fList id: "+fList);
//        System.out.println("my slist id: "+sList);

        int Sum = Integer.parseInt(fList)+Integer.parseInt(sList);
//        System.out.println("Sum is: "+Sum);
        res = Integer.toString(Sum);

        for (int i = res.length()-1; i >=0 ; i--) {
            addTwoNumbers.add(res.charAt(i));
        }
        for (int i = 0; i < addTwoNumbers.size(); i++) {

            System.out.println(addTwoNumbers.get(i));
        }
}
}
