public class Is123Array{
    static int is123Array(int[ ] a){
        if(a.length % 3 != 0 || a.length == 0)
          return 0;
        for(int i = 0; i < a.length; i++){
            if((i+1) % 3 == 1 && a[i] != 1)
              return 0;
            if((i+1) % 3 == 2 && a[i] != 2)
              return 0;
            if((i+1) % 3 == 0 && a[i] != 3)
              return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3, 3, 2, 1};
        int[] array2 = new int[]{0, 1, 2, 3, 1, 2, 3};
        int[] array3 = new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3};
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{};

        System.out.println(is123Array(array1));
        System.out.println(is123Array(array2));
        System.out.println(is123Array(array3));
        System.out.println(is123Array(array4));
       System.out.println(is123Array(array5));
        
    }
}