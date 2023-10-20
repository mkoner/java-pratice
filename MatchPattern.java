public class MatchPattern{
 
 static int matchPattern(int[] a, int len, int[] pattern, int patternLen) { 
// len is the number of elements in the array a, patternLen is the number of elements in the pattern. 
 int i=0; // index into a 
 int k=0; // index into pattern 
 int matches = 0; // how many times current pattern character has been matched so far 
 for (i=0; i<len; i++) { 
 if (a[i] == pattern[k]) 
 matches++; // current pattern character was matched 
 else if (matches == 0 || k == patternLen-1) 
 return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
 else  {
    k++;
    matches = 0;
    if(a[i] != pattern[k])
      return 0;
    else 
      matches ++;
 } // end of else 
 } // end of for 
 // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1) 
 if (i==len && k==patternLen-1) return 1; else return 0; 
} 

public static void main(String[] args){
    int[] array1 = new int[]{1, 1, 1, 1, 1};
    int[] array2 = new int[]{1} ;
    int[] array3 = new int[]{1, 1, 2, 2, 2, 2} ;
    int[] array4 = new int[]{1, 2, 3};
    int[] array5 = new int[]{1, 2};
    int[] array6 = new int[]{1, 1, 2, 2, 2, 2, 3};
    int[] array7 = new int[]{1, 1, 1, 1} ;
    int[] array8 = new int[]{1, 1, 1, 1, 2, 2, 3, 3};
    int[] array9 = new int[]{1, 1, 10, 4, 4, 3};
    

    int[] pattern1 = new int[]{1};
    int[] pattern2 = new int[]{1};
    int[] pattern3 = new int[]{1, 2};
    int[] pattern4 = new int[]{1, 2};
    int[] pattern5 = new int[]{1, 2, 3};
    int[] pattern6 = new int[]{1, 3};
    int[] pattern7 = new int[]{1, 2};
    int[] pattern8 = new int[]{1, 2};
    int[] pattern9 = new int[]{1, 4, 3};

    System.out.println(matchPattern(array1, array1.length, pattern1, pattern1.length));
    System.out.println(matchPattern(array2, array2.length, pattern2, pattern2.length));
    System.out.println(matchPattern(array3, array3.length, pattern3, pattern3.length));
    System.out.println(matchPattern(array4, array4.length, pattern4, pattern4.length));
    System.out.println(matchPattern(array5, array5.length, pattern5, pattern5.length));
    System.out.println(matchPattern(array6, array6.length, pattern6, pattern6.length));
    System.out.println(matchPattern(array7, array7.length, pattern7, pattern7.length));
    System.out.println(matchPattern(array8, array8.length, pattern8, pattern8.length));
    System.out.println(matchPattern(array9, array9.length, pattern9, pattern9.length));
}


} 
