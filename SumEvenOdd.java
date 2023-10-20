public class SumEvenOdd{
    private static int sums(int[] array){
        int X = 0;
        int Y = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1)
            X += array[i];
            else
            Y += array[i];
        }
        return X - Y;
    }

    public static void main(String[] args){
        int[] array1 = {1};
        int[] array2 = {1, 2};
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {3, 3, 4, 4};
        int[] array6 = {3, 2, 3, 4};
        int[] array7 = {4, 1, 2, 3};
        int[] array8 = {1, 1};
        int[] array9 = {};

        System.out.println(sums(array1));
        System.out.println(sums(array2));
        System.out.println(sums(array3));
        System.out.println(sums(array4));
        System.out.println(sums(array5));
        System.out.println(sums(array6));
        System.out.println(sums(array7));
        System.out.println(sums(array8));
        System.out.println(sums(array9));
    }
}