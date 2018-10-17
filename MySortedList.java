import java.io.Flushable;
import java.io.InvalidObjectException;
import java.util.*;

@SuppressWarnings("ALL")
public  class MySortedList<E> implements Comparable<MySortedList> {

    int size = 10;
    protected Integer[] array = new Integer[size];


//    E[] array = new Comparable;

    public void addAt(int index, Integer value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException ();
        } else {
//            array[index] = value;
            if(getValue (index) == null){
                array[index] =  value;
            }
            else {

                for (int i = index; i <this.array.length ; i++) {
                    if(getValue ( index ) != null){
                        for (int j = index; j <this.array.length ; j++) {
                            this.array[index] = this.array[index-1];

                        }
                        this.array[index] =value;
                    }
                }
            }
        }
    }

    public void insert(Integer element){
        array = new Integer[size];
        int end = -1;
        if(end++ < size){
            int i =0;
            for (i = 0; i < this.array.length-1; i++) {
                this.array[i]=this.array[i+1];
                end++;
            }
            this.array[end] = element;
//                for (int j = 0; j <this.data.length-1 ; j++) {
//                    end++;
//                }
        }}

    @Override
    public int compareTo(MySortedList o) {
        return 0;
    }

    private int x;


    public void update(int index,Integer value) {
        if (getValue ( index ) == null) {
            this.array[index] = value;
        } else {
            if (index == 0) {
                this.array[index] = value;
            } else {

                for (int i = index; i < this.array.length; i++) {
                    if (getValue ( index ) != null) {
                        for (int j = index; j < this.array.length; j++) {
                            this.array[index] = this.array[index - 1];

                        }
                        this.array[index] = value;
                    }
                }

            }
        }

    }
    public Integer getValue(int index){
        if(index < 0 || index >=size){
            throw new ArrayIndexOutOfBoundsException ( "Invalid Index" );
        }
        else{

            return array[index];
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println ( array[i] );
        }
    }

//    @Override

    //    public int size() {
    public <T> Integer[] insertionSorting(Integer[] list) {

        int j = 0;
        int alpha = 0;
        int temp = 0;

        for (int i = j; i < list.length; i++) {

            alpha = list[i];
            j = i - 1;

            while (j >= 0 && alpha < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
        return list;
    }
    //    }

    //        return this.size;
    public static <E extends Comparable> void Sort(E[] array) throws Exception  {
//        array= new Integer[10];
//            array = new Object[20];
//        E[] obj;

        for (int k = 1; k < array.length - k; k++) {
//
            for (int i = 0; i < array.length - 1; i++) {
                if ((Integer) array[i] > (Integer) (array[i + 1])) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
////
//                    }
                }
                else if((Float) array[i] > (Float) (array[i + 1])) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }
                else if((Double) array[i] > (Double) (array[i + 1])){
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }
                else{
                    System.out.println ("Cannot Possible");
                    throw new InvalidObjectException ( "Give a Possible Type Integer Float || Double" );
                }
            }
        }
    }

   protected boolean searchInSortedList(E item) {
       int i = 0;
       for (i = 0; i <= this.array.length; i++) {
           if (this.array[i] == item)
               return true;
           else
               return false;
       }
       return true;
   }

   public void removeAllInSortedList(){
       for (int i = 0; i <this.array.length; i++) {
           this.array[i] = null;
           size=0;
       }
   }

    public void removeElementFromSortedList(Integer item){
       for (int i = 0; i <this.array.length; i++) {
           if (this.array[i] == item) {
               array[i] = null;

//                E temp=null;
//                temp=data[i+1];
               for (array[i] = null; i < this.array.length - 1; i++) {

                   array[i] = array[i + 1];
//                    data[i-1];
               }
               size--;

           }
           else {
               array[i]=array[i];
           }

       }


}



}
//        System.out.println(mySortedList.array.length);

    //        Arrays.sort(arra);

    //        System.out.println(Arrays.toString(arra));

    //    }

    //        }

    //

    //        }}
//            }
//                return Integer.valueOf(list1[i]).compareTo(list1[i++]);
//                }
//                    return Integer.valueOf(list1[i]).compareTo(list1[i++]);
//
//                for (int i = 0; i < list1.size(); i++) {
//            public int compare(T o1, T o2) {
//            @Override
//        Collections.sort(list1, new Comparator<T>() {
//
//    public <T> void sorting(ArrayList<T> list1){
//    }
//            }
//                }
//
//                }
//                    array[j + 1] = array[j];
//                    if (c.compare(array[j],v) <= 0){ break;
//                for(j=i-1 ; j>= 0 ;j--) {
//                int j;
//                T v =array[i];
//            for (int i = 0; i < array.length; i++) {
//        public static <T extends Integer> void insertionSort(T[] array ,Comparator<? super MyList> c){
//    }
//        }
//
//                int tmp = array[i-1].compareTo(array[i]);
//
//        for (int i = 0; i < this.array.length; i++) {
//
//        E temp=null;
//    public void sorting(){
//            }
//                array[j+1] = v;
//                }
//                    }
//                        array[j+1] = array[j];
//                    else {
//                    }
//                        break;
//                    if(c.compare(this.array[i] , v) <= 0){
//                for(j = i-1 ;j>=0;j--){
//                int j=0;
//                E v = array[i];
//            for (int i = 0; i < array.length -1; i++) {
////            c.
//            Comparator c =null;
//            array = (E[]) new Object[size];
////            T[] array=  (T[]) new Object[size];
//    public void insertion(){
//        }
//            }
//
//            if(indexValue(i) == indexValue(i++)){
//        for (int i = 0 ;i < this.array.length ; i++){
//    public void insertionSort(){
//    MySortedList(int input) {
//        x = input;
//    }
    //    @Override
//    public void insert(Object element) {
//        super.insert(element);
//    }
///
//    @Override
//    public boolean isEmpty() {
//        return super.isEmpty();
//    }

//
//            }
//