public class LargestPrimeFactor{
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int largestPrimeFactor(int n){
        if(n<=1){
            return 0;
        }
        for(int i = n - 1; i > 0; i--){
            if(n % i == 0){
                if(isPrime(i))
                  return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(45));
    }

}