public class Numbers {
    public static void main(String[] args) {

        System.out.println(addNumbers(90,100));
        System.out.println(addNumber(90,100));
    }
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
