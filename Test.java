import java.util.ArrayList;
import java.util.Arrays;

public abstract class Test implements Comparable {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        MySortedList<Double> list = new MySortedList<> ( 10 );

        myList.insertAt ( 0,7 );
        myList.update ( 0,8 );
        myList.printAterInsert ();


        list.addAt ( 0, 50 );
        list.addAt ( 1, 44 );
        list.addAt ( 2, 410 );
        list.addAt ( 3, 49 );
        list.addAt ( 4, 101 );
        list.addAt ( 5, 404 );
        list.addAt ( 6, 34 );
        list.addAt ( 7, 4 );
        list.addAt ( 8, 14 );
        list.addAt ( 9, 84 );
        list.addAt ( 2,66 );
//        list.remove s( 101 );
        list.removeElementFromSortedList ( 4 );
//        System.out.println ("Array with Integer Type"+Arrays.toString ( list.array ));
        list.print ();
        System.out.println ("Declared Array UnSorted Array"+ Arrays.toString ( list.array ) );
        list.insertionSorting ( list.array );
        System.out.println ("Array with Integer Type After Sort");
        list.print ();
////        MySortedList.Sort ( list.array );
//        System.out.println ("Array with Generic Type"+Arrays.toString (list.array));
//        System.out.println (list.searchInSortedList ( 14 ));
        System.out.println ("Array After RemoveAll Method");
        list.removeAllInSortedList ();
//        System.out.println (list.print ());
        list.print ();
    }

}



        //        MySortedList.Sort(list.array);
//            ((MySortedList<Integer>) list).array.length;
//        MySortedList.Sort(((MySortedList<Integer>) list).array);
//        Integer[] integers = new Integer[10];
//MySortedList.bubbleSort(list.array);
//        Integer[] array = new Integer[10];
//        Integer[] inte =(Integer[]) list.array;


//        System.out.println(Arrays.toString(list.array));
//        Arrays.sort();

//        MySortedList.Sort(list.array);
        //        myList.insert("Element1");
//            myList.insert("Element2");
//        myList.insertAt(0,5);
//        myList.insertAt(1,80);
//        myList.insertAt(2,6);
//        myList.insertAt(3,90);
//        myList.insertAt(4,123);
//        myList.insertAt(5,1);
//        myList.insertAt(6,0);
//        myList.insertAt(7,3);
//        myList.insertAt(8,4);
//        myList.insertAt(9,7);


//        myList.insert("Element3");
//        myList.insert("Element4");
//        myList.insert("Element5");
//        myList.insert("Element6");
//        myList.insert("Element7");
//        myList.insert("Element8");
//        myList.insert("Element9");
////        System.out.println();
//        myList.print();

//

//list.print();
//        list.bubbleSort(list.array);
////        System.out.println(list.insertionSorting(list.array));
//        for (int i = 0; i < list.array.length; i++) {
//            System.out.println(list.array[i]);
//        }
//        list.insertionSorting(list.array);
//        int[] arra = null;
//        for (int i = 0; i < list.array.length; i++) {
//
//            arra[i] = Integer.parseInt(list.array[i]);
//        }

//        System.out.println(list[0]);
//        Integer.valueOf(myList);

//        int[] array=null;
//        for (int i = 0; i < myList.size() -1; i++) {
//         array[i] = myList[i];
//
//        }
//        int[] array = {1,5,2,8,4};
//        myList.insertionSorting(array);
////        System.out.println();
//        myList.update(3,"My New Element");
//        myList.insertAt(5,"Element5");
//        System.out.println(myList.isEmpty());

//        myList.insert("ElementTk");
//        myList.insert("ElementFl");
//        myList.insert("ElementFm");
//        System.out.println(myList.serch("Element3"));
                //        myList.remove("Element3");

//        System.out.println(myList.indexValue(0));

//        myList.printAterInsert();


