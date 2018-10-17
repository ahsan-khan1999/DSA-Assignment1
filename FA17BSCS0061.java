import java.io.InvalidObjectException;

public class FA17BSCS0061 {
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

@SuppressWarnings("ALL")
class MyList<E> {

    int initialCapacity = 10;
    private E[] data;

    {
        data = (E[]) new Object[initialCapacity];
    }

    public int size()
    {
        return initialCapacity;
    }


    public void insertAt(int index , E element){
        if(index < 0 || index > size()){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        else{
            if(indexValue ( index ) == null){
                this.data[index] = element;
            }
            else {
                for (int i = index; i <this.data.length ; i++) {
                    if(indexValue ( index ) != null){
                        for (int j = index; j <this.data.length ; j++) {
                            this.data[index] = this.data[index-1];

                        }
                        this.data[index] =element;
                    }
                }
            }

//                this.data[index] = element;

        }
    }
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        else {
            return false;
        }
    }
//        this.data[i].equals(item)

    public void remove(Object item){
        for (int i = 0; i <this.data.length; i++) {

            if (this.data[i] == item) {
                data[i] = null;

//                E temp=null;
//                temp=data[i+1];
                for (data[i] = null; i < this.data.length - 1; i++) {

                    data[i] = data[i + 1];
//                    data[i-1];
                }
                initialCapacity--;

            }
            else {
                System.out.println("Sorry Given Item is not in our list!!");
            }

////                data[i] = data[i-1];
//                initialCapacity--;
        }

        System.out.println(size());
    }
    public void removeAll(E elements){
        for (int i = 0; i <this.data.length ; i++) {
            this.data[i] = null;
            initialCapacity=0;
        }

    }

    public void forSkip(){
        for (int i = 0; i <this.data.length -1; i++) {
            data[i]=data[i+1];
        }
//           data[i]

    }

    public int search(E item){
        for(int i = 0;i<this.data.length;i++) {
            if(this.data[i]==item){
                return 1;
            }
            else {
                return -1;
            }
        }
        return 0;
    }
    public void printAfterRemoving() {
        for (int i = 0; i < data.length-1; i++) {
            System.out.println(data[i]);
        }

    }
    public void printAterInsert(){
        for (int i = 0; i < this.data.length; i++) {
            System.out.println(data[i]);
        }
    }
    public void update(int index,E value){
        if(indexValue ( index ) == null){
            this.data[index] = value;
        }

        else {
            if(index == 0){
                this.data[index] = value;
            }
            else {

                for (int i = index; i < this.data.length; i++) {
                    if (indexValue ( index ) != null) {
                        for (int j = index; j < this.data.length; j++) {
                            this.data[index] = this.data[index - 1];

                        }
                        this.data[index] = value;
                    }
                }

            }
        }
    }
    public E indexValue(int index){

        return data[index];

    }


    public void insert(E element){
        data = (E[]) (new Object[initialCapacity]);
        int end = -1;
        if(end++ < initialCapacity){
            int i =0;
            for (i = 0; i < this.data.length-1; i++) {
                this.data[i]=this.data[i+1];
                end++;
            }
            this.data[end] = element;
//                for (int j = 0; j <this.data.length-1 ; j++) {
//                    end++;
//                }
        }
//        if(this.data[].s >)
    }
}
class MySortedList<E> extends MyList<E> implements Comparable {

    int size = 10;
    protected Integer[] array = new Integer[size];


//    E[] array = new Comparable;

    public void addAt(int index, Integer value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException ();
        } else {
//            array[index] = value;
            if (getValue ( index ) == null) {
                array[index] = value;
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


    public void insert(Integer element) {
        array = new Integer[size];
        int end = -1;
        if (end++ < size) {
            int i = 0;
            for (i = 0; i < this.array.length - 1; i++) {
                this.array[i] = this.array[i + 1];
                end++;
            }
            this.array[end] = element;
//                for (int j = 0; j <this.data.length-1 ; j++) {
//                    end++;
//                }
        }
    }

public <E extends Comparable>void sortWithGenerics(E[] array){

        array = (E[]) new Comparable[size];
        for (int k = 1; k < array.length - k; k++) {
//
            if (array[k].compareTo ( array[k++] ) > 0) {
                for (int i = 0; i < array.length - 1; i++) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
////
//                    }
            }
            else{
                array[k] =array[k];
            }
        }}

    public void update(int index, Integer value) {
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

    public Integer getValue(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException ( "Invalid Index" );
        } else {

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
    public static <E extends Comparable> void Sort(E[] array) throws Exception {
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
                } else if ((Float) array[i] > (Float) (array[i + 1])) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                } else if ((Double) array[i] > (Double) (array[i + 1])) {
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                } else {
                    System.out.println ( "Cannot Possible" );
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

    public void removeAllInSortedList() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = null;
            size = 0;
        }
    }

    public void removeElementFromSortedList(Integer item) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == item) {
                array[i] = null;

//                E temp=null;
//                temp=data[i+1];
                for (array[i] = null; i < this.array.length - 1; i++) {

                    array[i] = array[i + 1];
//                    data[i-1];
                }
                size--;

            } else {
                array[i] = array[i];
            }

        }


    }
}
class Numbers{
    public static int addNumbers(int start , int end){
        int k=0;
        for (int i = start; i <=end ; i++) {
            k=k+i;
        }
        return k;
    }
    //asymptotic complexity ====== is always because complexity depends on number of n O(n) for the worst case!!
//    Optimzation of alogorithm complexity from O(n) T0 <===>   O(1)

    public static int addNumber(int start , int end){

        int n = end - start +1;
        return n*(start + end)/2;
    }
}







//    public int[] insertionSorting(int[] array){
//
//        int key[]=null;
//                int temp;
//        int j;
//
//        for (int i = 0 ; i < this.data.length ; i++){
//
//            key[i] = array[i];
//            j=i-1;
//
//            while (j >=0 && key[i] < array[j]){
//                temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//                j--;
//            }
//        }
//        return array;
//    }


//    public void removeAll(E items){
//        int count = 0;
//        for (int i = 0; i <this.data.length-1 ; i++) {
////            if(this.data[i])
//        }

//    public void insert(E element) {
//        if (initialCapacity >=size()) {
//            E[] newData = (E[]) (new Object[initialCapacity * 2]);
//            for (int i = 0; i < this.data.length; i++) {
//                newData[i]=data[i];
//            }
//            newData[initialCapacity + 1] = element;
//        } else {
////            while (this.data != null){
//            for (int i = 0; i < this.data.length ;i++) {
//                if(this.data[i] == indexValue(i)){
//                    this.data[i] = element;
//                }
//
//            }
//            this.data[initialCapacity--] = element;
