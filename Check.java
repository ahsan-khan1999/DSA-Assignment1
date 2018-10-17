public class Check {
    public static void main(String[] args) {
        TestCompare<Integer> test = new TestCompare<Integer>();

        test.compare(1,2);
        test.compare(1,2);
    }
}

@SuppressWarnings("ALL")
class TestCompare<T extends Comparable> {
    public TestCompare() {

    }

    int compare(T data, T data2) {
        return data.compareTo(data2);
    }
}