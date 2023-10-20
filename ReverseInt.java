public class ReverseInt{

    public static int reverse(int n){
        if (n < 0)
        return reverse(n*(-1)) * (-1);
        int rev=0, reminder = 0;
        while(n > 0){
            reminder = n % 10;
            rev = rev * 10 + reminder;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        System.out.println(reverse(1234));
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(1000));
        System.out.println(reverse(0));
        System.out.println(reverse(-12345));
    }
}