public class CommonArray{

    public static int[] commonElements(int[] first, int[] second){
        if(first == null || second == null){
            return null;
        }
        int[] a = first, b = second;
        int max, min;
        if(first.length <= second.length){
            min = first.length;
            max = second.length;

        }
        else {
            a = second;
            b = first;
            min = second.length;
            max = first.length;
        }
        int[] intermadiate = new int[min];
        int len = 0;
        for(int i = 0; i<min; i++){
            for(int j = 0; j<max; j++){

                if(a[i] == b[j]){     
                    intermadiate[len] = a[i];
                    len++;
                }
            }
        }
        int[] result = new int[len];
        for(int k = 0; k < len; k++){
            result[k] = intermadiate[k];
        }
        return result;
    }

    public static void printArray(int[] a){
        if(a==null){
            System.out.println("null");
            return;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

        printArray((commonElements(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
        printArray((commonElements(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})));
        printArray((commonElements(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3})));
        printArray((commonElements(new int[]{1, 2}, new int[]{3, 4})));
        printArray((commonElements(new int[]{}, new int[]{1, 2, 3})));

        printArray((commonElements(new int[]{1, 2}, new int[]{})));
        printArray((commonElements(new int[]{1, 2}, null)));
        printArray((commonElements(null, new int[]{})));


    }
}