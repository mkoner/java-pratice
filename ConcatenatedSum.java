public class ConcatenatedSum {
    public static int checkConcatenatedSum(int n, int catlen){
        int originalNumber = n, sum = 0;
        while(n>0){
            int digit = n % 10, sum1 = 0;
            for(int i=0; i < catlen; i++){
                sum1 = sum1 * 10 + digit;
            }
            sum += sum1;
            n = n/10;
            sum1 = 0;
        }
        return originalNumber == sum ? 1 : 0;
    }
    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}