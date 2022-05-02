package Day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Learning_List2 {
    public static void main(String[] args) {
        List<Integer> nList = new ArrayList<>();

        nList.add(1);
        nList.add(2);
        nList.add(3);

        List<Character> mList = new ArrayList<>();

        mList.add('A');
        mList.add('B');
        mList.add('C');

        Iterator iterator2 = mList.iterator();

        Iterator iterator = nList.iterator();

        while (iterator.hasNext() && iterator2.hasNext()){

            System.out.println(iterator.next() + " "  + iterator2.next());

        }

    }
}
