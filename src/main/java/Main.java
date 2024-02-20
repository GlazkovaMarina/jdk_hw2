import java.util.Objects;

public class Main {
    /*
    2 Напишите обобщенный метод compareArrays(),
    который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
    Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
     */
    public static <T> boolean compareArrays(T[] arrayFirst, T[] arraySecond){
        if (arrayFirst == null) {
            throw new NullPointerException("arrayFirst");
        }
        if (arraySecond == null) {
            throw new NullPointerException("arraySecond");
        }
        if (arrayFirst.length == arraySecond.length){
            for (int i = 0; i < arrayFirst.length; i++) {
                if (!Objects.equals(arrayFirst[i], arraySecond[i]))
                    return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 1
        Integer first = 9;
        Long second = 10l;
        Double third = 5.4;
        Float fourth = 3.14f;
        System.out.println(Calculator.sum(first, second).intValue());
        System.out.println(Calculator.subtract(first, third).doubleValue());
        System.out.println(Calculator.divide(first, fourth).floatValue());
        System.out.println(Calculator.multiply(first, first).intValue());

        // 2
        Integer[] array1 = {1, 2, 3, 4, 5};
        Long[] array2 = {1l, 2l, 3l, 4l, 5l};
        Integer[] array3 = {1, 2, 3, 4, 5, 6};
        Double[] array4 = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array1, array4));

        // 3
        Pair<Integer, String> pair = new Pair<>(3, "three");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

        Pair<Double, String> pair2 = new Pair<>(3.0, "three");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2);
    }
}
