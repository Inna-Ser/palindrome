package org.example;

public class Main {
    public static boolean isPalindrome(String str) {
        if (str.replaceAll("\\p{Punct} |\\s", "")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\p{Punct} |\\s", ""))
                        .reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String a = "А роза упала на лапу Азора";
        String b = "Ночевала тучка золотая";

        System.out.println(isPalindrome(b));
    }
}