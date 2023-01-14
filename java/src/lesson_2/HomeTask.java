package lesson_2;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        convertString("Ckkdf");

    }
    public static String convertString(String words){


        if (Character.isUpperCase(words.charAt(0))){
            return words;
        }
        else if (words.isEmpty()){
            return "";
        }
        else{
            return "no";
        }
    }

}
