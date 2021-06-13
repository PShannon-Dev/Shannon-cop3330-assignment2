package ex24;

import java.util.Arrays;

public class AnagramChecker {
    private String anagram1;
    private String anagram2;

    public String getAnagram1() {
        return anagram1;
    }

    public void setAnagram1(String anagram1) {
        this.anagram1 = anagram1;
    }

    public String getAnagram2() {
        return anagram2;
    }

    public void setAnagram2(String anagram2) {
        this.anagram2 = anagram2;
    }

    public boolean isAnagram() {
        //if the strings are different lengths-can't be an anagram
        int l1 = anagram1.length();
        int l2 = anagram2.length();
        int flag = 0; // to be used to compare each char

        //determines if the two are equal in length, if not we already know it isn't an anagram
        if (l1 != l2) {
            return false;
        }

        /* after determining it is possible we will compare each individual letter by converting to array and using
        a for loop */
        else {
            char[] anaarr1 = anagram1.toCharArray();
            char[] anaarr2 = anagram2.toCharArray();

            Arrays.sort(anaarr1);
            Arrays.sort(anaarr2);

            for(int i = 0; i < l1; i ++){
                if(anaarr1[i] != anaarr2[i])
                    flag = 1;
            }
            if(flag == 0)
                return true;
            else
                return false;
        }
    }
}