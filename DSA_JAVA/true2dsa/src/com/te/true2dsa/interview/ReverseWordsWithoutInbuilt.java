package com.te.true2dsa.interview;
public class ReverseWordsWithoutInbuilt {
    public static void main(String[] args) {
        String s = "I am ajit how are you";
        char[] charArray = s.toCharArray();  // step 1
        int n = charArray.length;   // step 2
        reverse(charArray, 0, n - 1);  // step 3
        int start = 0; // step 5
        for (int i = 0; i <= n; i++) { // step 6
            if (i == n || charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }
        System.out.println(new String(charArray)); // step 7
    }
    
    public static void reverse(char[] arr, int start, int end) {  // step 4  
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
