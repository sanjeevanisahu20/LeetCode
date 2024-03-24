package LeetCode; /**
 *
 *Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 Example 1:

 Input: s = "III"
 Output: 3
 Explanation: III = 3.
 Example 2:

 Input: s = "LVIII"
 Output: 58
 Explanation: L = 50, V= 5, III = 3.
 */
import java.util.*;
public class LeetCodeRomanToInt {
    public static void main(String[] args) {
        HashMap<String,Integer> mapRoman = new HashMap<String,Integer>();
        mapRoman.put("I",1);
        mapRoman.put("V",5);
        mapRoman.put("X",10);
        mapRoman.put("L",50);
        mapRoman.put("C",100);
        mapRoman.put("D",500);
        mapRoman.put("M",1000);

        String str = "LVIII";
        String str1 = "MCMXCIV" ;//1994
       // 1000+900+90+4
        char[] charArr = str1.toCharArray();
        int sum=0;
        int nextVal=0;
        int currentVal=0;
        for(int i=0;i<charArr.length ; i++){
            if(i<charArr.length-1){
                nextVal =  mapRoman.get(String.valueOf(charArr[i+1]));
            }


            currentVal =  mapRoman.get(String.valueOf(charArr[i]));
           if(currentVal<nextVal){
               sum=sum-currentVal;
           }else{
               sum=sum+currentVal;
           }

        }

        System.out.println(sum);
    }
}
