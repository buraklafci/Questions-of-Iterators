package day46_iteratorsSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03 {
    public static void main(String[] args) {
        /*
        Soru 5) (iterator ile index kullanimina ornek)
         Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
         Orn :  list : [2,13,56,23,45,14,40]
         artirilmasi istenen eleman sayisi : 3
         output: [7,18,61,23,45,14,40]
         */
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);
        int n=3;
        int i=1;
        ListIterator<Integer> obj= liste.listIterator();
        while (i<=n){  //dongu 3 defa calisacak
            Integer temp= obj.next()+5;
            obj.set(temp);
            i++;
        }
        System.out.println(liste);
    }
}
