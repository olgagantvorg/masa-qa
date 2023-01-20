package lesson_2;

import org.jetbrains.annotations.NotNull;

public class hexlet {
    public static void main(String[] args) {
        bigLettersCount("RiVer");

    }

    public static int bigLettersCount(String val){
        var i = 0;
        var a = val.charAt(i);
        var b = Character.toUpperCase(a);
        var count = 0;
        while (i<= val.length()){
            if (a== b){
                count = count +1;
                i=i+1;


            }


        }
        return count;
    }
    }

