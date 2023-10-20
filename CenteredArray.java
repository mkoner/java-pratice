public class CenteredArray {
    private static int isCentered(int[] array){
        int size = array.length;
        int mid = size / 2;
        if (size % 2 != 1){
            return 0;
        }
        for(int i = 0; i < size; i++){
            if (i == mid)
            continue;
            if(array[i] <= array[mid])
            return 0;
        }
        return 1;
    } 
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1, 4, 5};
        int[] array3 =  {3, 2, 1, 4, 1};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {};
        int[] array6 = {10};

        System.out.println(isCentered(array1));
        System.out.println(isCentered(array2));
        System.out.println(isCentered(array3));
        System.out.println(isCentered(array4));
        System.out.println(isCentered(array5));
        System.out.println(isCentered(array6));

    }
}