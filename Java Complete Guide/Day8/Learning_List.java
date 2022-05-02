package Day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Learning_List {
    public static void main(String[] args) {
        List<String> mList = new ArrayList<>();
        mList.add("Ale");
        mList.add("Moi");
        mList.add("Isa");

       // System.out.println(mList);

        Iterator iterator = mList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String names: mList){
            System.out.println(mList);
            break;
        }


    }
}
