public class IsRapidlyIncreasing{
    static int isRapidlyIncreasing(int[] a){
        
        if(a.length == 1)
          return 1;

        int sum = a[0];
        for(int i = 1; i < a.length; i++){
           if(sum * 2 >= a[i])
              return 0;

            sum += a[i];
        }

        return 1;  

    }

    public static void main(String[] args){
        int[] array1 = new int[]{1, 3, 9, 27};
        int[] array2 = new int[]{1, 3, 200, 500};
        int[] array3 = new int[]{1};
        int[] array4 = new int[]{1, 3, 9, 26};
        int[] array5 = new int[]{1, 3, 7, 26};
        int[] array6 = new int[]{1, 3, 8, 26};

System.out.println(isRapidlyIncreasing(array1));
        System.out.println(isRapidlyIncreasing(array2));
        System.out.println(isRapidlyIncreasing(array3));
        System.out.println(isRapidlyIncreasing(array4));
       System.out.println(isRapidlyIncreasing(array5));
       System.out.println(isRapidlyIncreasing(array6));
    }
}