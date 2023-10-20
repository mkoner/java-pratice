public class SelfReferential{
    static int isSelfReferential(int[] a){
        int[] times = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if(a[i] > a.length-1)
              return 0;
            int index = a[i];
            times[index]++;
        }
        for(int j = 0; j < a.length; j++){
            if(a[j] != times[j])
              return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 1, 0};
        int[] array2 = new int[]{2, 0, 2, 0};
        int[] array3 = new int[]{2, 1, 2, 0, 0};
        int[] array4 = new int[]{3, 2, 1, 1, 0, 0, 0};
        int[] array5 = new int[]{4, 2, 1, 0, 1, 0, 0, 0};
        int[] array6 = new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0};
        int[] array7 = new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0};
        int[] array8 = new int[]{6, 2, 1, 0, 0, 0, 1, 0, 5, 0};

        System.out.println(isSelfReferential(array1));
        System.out.println(isSelfReferential(array2));
        System.out.println(isSelfReferential(array3));
        System.out.println(isSelfReferential(array4));
       System.out.println(isSelfReferential(array5));
       System.out.println(isSelfReferential(array6));
       System.out.println(isSelfReferential(array7));
       System.out.println(isSelfReferential(array8));
    }
}