public class SequencedArray{
    public static int isSequencedArray(int[ ] a, int m, int n){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                return 0;
            }
        }
        for(int k = m; k <= n; k++){
            int occurence = 0;
            for(int j = 0; j < a.length; j++){
            if(k == a[j]){
                occurence++;
            }
            }  
            if(occurence == 0){
                return 0;
            } 
        }

        for(int x = 0; x < a.length; x++){
            int occurence1 = 0;
            for(int y = m; y <= n; y++){
            if(y == a[x]){
                occurence1++;
            }
            }  
            if(occurence1 == 0){
                return 0;
            } 
        }
        

        return 1;
    } 

    public static void main(String[] argv){
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1,5 ));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1,5 ));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5} , 1,5 ));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4} , 1,5 ));
        System.out.println(isSequencedArray(new int[]{1, 2, 5} , 1,5 ));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1} , 1,5 ));
    }
}