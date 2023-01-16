package lesson_8.Computer;

import java.util.ArrayList;
import java.util.Collections;

public class MyComputers {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        Chip chip = new Chip("Kazahi",155757575766L,5);
        GraficCard graficCard = new GraficCard(1575757575759L,"BigOne");
        Memory [] memory = {new Memory(20,"Super"),
                new Memory(20,"Super"),
                new Memory(20,"Super"),
                new Memory(20,"Super")
        };
        SolidDrive solidDrive = new SolidDrive("Neznaybrand",12);
        Computer computer = new Computer(graficCard,156.45,chip,memory,solidDrive);
        for (int i = 0; i < 3; i++) {
            computers.add(new Computer(new GraficCard(1575757575759L,"BigOne"),
                    196.50,
                    new Chip("Kazahi",155757575766L,5),
                    new Memory[]{new Memory(20,"Super"),
                            new Memory(20,"Super"),
                            new Memory(20,"Super"),
                            new Memory(20,"Super")
                    },new SolidDrive("Neznaybrand",12)));

        }

        computers.forEach(System.out::println);


    }
}
