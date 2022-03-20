import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{"one", "two", "three", "four"};

        System.out.println(Arrays.toString(strings));
        swapElementsOfArray(strings, 1, 0);
        System.out.println(Arrays.toString(strings));

        arrayToArraylist(strings);
    }

    // 1
    public static Object[] swapElementsOfArray(Object[] array, int first, int second) {
        Object tmp;
        if (first < 0 || second < 0 || first >= array.length || second >= array.length) return array;
        else {
            tmp = array[first];
            array[first] = array[second];
            array[second] = tmp;

        }
        return array;
    }

// 2

    public static ArrayList<Object> arrayToArraylist(Object[] objects){
        ArrayList<Object> list = new ArrayList<>();
        list.addAll(Arrays.asList(objects));
        return list;
    }
}
