import java.util.Arrays;

public class ArrayTestClass {
    public static void main(String[] args) {
        int [] arrInt = new int[10];
        int [] arrNewInt = { 1, 2, 3, 4, 10 };
//        int arr[] = new int[10];
//        for (int i = 0; i < arrInt.length; i++) {
//            System.out.println(i + " - " + arrInt[i]);
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arrInt));

        for (int i = 0; i < arrNewInt.length; i++) {
            arrNewInt[i] = i + 1;
        }
//        System.out.println();
//        System.out.println(Arrays.toString(arrNewInt));

//        arrInt[10] = 100;
//        arrNewInt[10] = 100;
        System.out.println(arrNewInt[0]);

    }
}
