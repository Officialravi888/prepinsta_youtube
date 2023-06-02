package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_toString_Method {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
     //  String result=arrayList.toString();
     //   System.out.println(":"+result);
//        LinkedList<Integer>list=new LinkedList<>();
//        list.add(23);
//        list.add(56);
//        list.add(56);
//        list.remove(1);
//        System.out.println(list);
        //Iterator iterator=arrayList.iterator();
        Iterator<Integer> iterate = arrayList.iterator();

        int number = iterate.next();
        iterate.remove();
        System.out.println(number);
        while (iterate.hasNext()){
            iterate.forEachRemaining(value-> System.out.println(value));
        }

        List<Integer>list=new ArrayList<>();
    }
}
