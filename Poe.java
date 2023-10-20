public class Poe{

    public static int isPOE(int[] a){
        int size = a.length;
        
        for(int i=size-1; i>1; i--){
            int sum1 = 0, sum2 = 0;
            for(int j=size-1; j>=i; j--){
                sum1 += a[j];
            }
            for(int k=i-2; k>=0; k--){
                sum2 += a[k];
            }
            if (sum1 == sum2){
                return i - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(isPOE(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(isPOE(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(isPOE(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(isPOE(new int[]{1, 2, 3}));
        System.out.println(isPOE(new int[]{3, 4, 5, 10}));
        System.out.println(isPOE(new int[]{1, 2, 10, 3, 4}));

    }
}