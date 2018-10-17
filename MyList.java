//imp ort java.util.Arrays;
@SuppressWarnings("ALL")
public class MyList<E> {

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