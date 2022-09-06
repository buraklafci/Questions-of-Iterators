package day46_iteratorsSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02 {
    public static void main(String[] args) {
// Soru 4) Bir listedeki elementleri iterator kullanarak
        // sondan basa dogru yazdirin

        List<Integer> liste = new ArrayList<Integer>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);  //[2, 13, 56, 23, 45, 14, 40]

        ListIterator<Integer> obj= liste.listIterator();
        while (obj.hasNext()){
            obj.next();
        }
        while (obj.hasPrevious()){
            System.out.print(obj.previous()+" ");
        }
        System.out.println(" ");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Berk");
        liste2.add("Burak");
        System.out.println(liste2);

        ListIterator<String>obj2 = liste2.listIterator();
        while (obj2.hasNext()){
            obj2.next();
        }
        while (obj2.hasPrevious()){
            System.out.print(obj2.previous()+" ");
        }


    }
}
