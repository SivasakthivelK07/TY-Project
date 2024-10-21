package com.te.true2dsa.interview.Ok;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter a word:");
        String input = scanner.nextLine();        
        StringBuilder result = new StringBuilder();        
        for (int i = 0; i < input.length(); i++) {
        	char ch = input.charAt(i);            
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        
        System.out.println("Toggled case: " + result.toString());
        
        scanner.close();
    }
}
