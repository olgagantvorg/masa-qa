package lesson_5.HW;

import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {
        HashMap<String,String> listCountries = new HashMap<>();
        listCountries.put("Cambodia","Phnom Penh");
        listCountries.put("Chad","N'Djamena");
        listCountries.put("Colombia","Bogota");
        listCountries.put("Costa Rica","San Jose");
        listCountries.put("Luxembourg","Luxembourg");
        listCountries.put("Peru","Lima");
        listCountries.put("Serbia","Belgrade");
        listCountries.forEach((country,city)-> System.out.println(country));
        listCountries.forEach((country,city)-> System.out.println(city + " - " + country));
        System.out.println("listCountries contains key Peru - " + listCountries.containsKey("Peru"));
        System.out.println("listCountries contains key Russia - " + listCountries.containsKey("Russia"));
        System.out.println("listCountries contains value Belgrade - " + listCountries.containsValue("Belgrade"));
        System.out.println("listCountries contains value None - " + listCountries.containsValue("None"));


    }
}
