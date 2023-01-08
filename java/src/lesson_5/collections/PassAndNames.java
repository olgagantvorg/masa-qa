package lesson_5.collections;

import java.util.HashMap;

public class PassAndNames {
    public static void main(String[] args) {
        HashMap< Integer, String> passAndNames = new HashMap<>();
        passAndNames.put(12431, "Alex");
        passAndNames.put(5454511, "Alex");
        passAndNames.put(852211, "Alex");
        passAndNames.put(11112424, "Alex");
        System.out.println(passAndNames);
//        System.out.println(passAndNames.get(12431));
//        System.out.println(passAndNames.get(1242333));
//        System.out.println(passAndNames.containsKey(11112424));
//        System.out.println(passAndNames.containsValue(" "));
//        System.out.println(passAndNames.containsValue("Alex"));

    }
}
