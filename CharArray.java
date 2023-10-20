public class CharArray{
    private static char[] chars(char[] array, int start, int len){
        if(len > array.length - start || start < 0 || start >= array.length)
        return null;
        char[] result = new char[len];
        for(int i = 0, j = start; j < len; i++, j++){
            result[i] = array[j];
        }
        return result;
    }

    public static void main(String[] args){
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {};

        System.out.println(chars(array1, 0, 4)==null);
        System.out.println(chars(array1, 0, 3)==null);
        System.out.println(chars(array1, 0, 2)==null);
        System.out.println(chars(array1, 0, 1)==null);
        System.out.println(chars(array1, 1, 3)==null);
        System.out.println(chars(array1, 1, 2)==null);
        System.out.println(chars(array1, 1, 1)==null);
        System.out.println(chars(array1, 2, 2)==null);
        System.out.println(chars(array1, 2, 1)==null);
        System.out.println(chars(array1, 3, 1)==null);
        System.out.println(chars(array1, 1, 0)==null);
        System.out.println(chars(array1, -1, 2)==null);
        System.out.println(chars(array1, -1, -2)==null);
        System.out.println(chars(array2, 0, 1)==null);
        
    }
}