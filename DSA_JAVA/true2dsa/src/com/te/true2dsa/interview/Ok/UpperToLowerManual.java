package com.te.true2dsa.interview.Ok;
public class UpperToLowerManual {
    public static void main(String[] args) {
        String upperCaseStr = "HELLO JAVA";  
        String lowerCaseStr = "";  

        for (int i = 0; i < upperCaseStr.length(); i++) {
            char currentChar = upperCaseStr.charAt(i);
            
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowerCaseStr += (char) (currentChar + 32);
            } else {
                lowerCaseStr += currentChar;
            }
        }

        System.out.println("Lowercase String: " + lowerCaseStr);
    }
}
