package lesson_8.Computer;

import java.util.Arrays;

public class Computer {
    private GraficCard graficCard;
    private double price;
    private Chip chip;
    private Memory[] memory;
    private SolidDrive solidDrive;

    public Computer(GraficCard graficCard, double price, Chip chip, Memory[] memory, SolidDrive solidDrive) {
        this.graficCard = graficCard;
        this.price = price;
        this.chip = chip;
        this.memory = memory;
        this.solidDrive = solidDrive;
    }

    public GraficCard getGraficCard() {
        return graficCard;
    }

    public void setGraficCard(GraficCard graficCard) {
        this.graficCard = graficCard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Memory[] getMemory() {
        return memory;
    }

    public void setMemory(Memory[] memory) {
        this.memory = memory;
    }

    public SolidDrive getSolidDrive() {
        return solidDrive;
    }

    public void setSolidDrive(SolidDrive solidDrive) {
        this.solidDrive = solidDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graficCard=" + graficCard +
                ", price=" + price +
                ", chip=" + chip +
                ", memory=" + Arrays.toString(memory) +
                ", solidDrive=" + solidDrive +
                '}';
    }
}
