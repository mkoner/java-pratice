public class EncodeNumber{
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0)
              return false;
        }
        return true;
    }

    public static int[] encodeNumber(int n){
        int result[] = n > 0 ? new int[n] : new int[-n];
        int size = 0;
        int m = n;
        if(n <= 1){
            return null;
        }

            
            for(int i = 2; i <= m; i++){
            while(m % i == 0 && isPrime(i)){
               // System.out.println(i);
               // System.out.println(m);
                result[size] = i;
                size++;
                m = m / i;
            }
            }
        

        int[] finalResult = new int[size];
        for(int j = 0; j<size; j++){
            finalResult[j] = result[j];
        }

        return finalResult;
        
    }

    private static void printArray(int[] a){
        System.out.println();
        if(a==null){
            System.out.println("null");
            return;
        }
          
        for(int i=0; i<a.length; i++){  
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //System.out.println(encodeNumber(2));
        //System.out.println(encodeNumber(6));
        //System.out.println(encodeNumber(14));
        //encodeNumber(1200);
        printArray(encodeNumber(2));
        printArray(encodeNumber(6));
        printArray(encodeNumber(14));
        printArray(encodeNumber(24));
        printArray(encodeNumber(1200));
        printArray(encodeNumber(1));
        printArray(encodeNumber(-18));
    }
}