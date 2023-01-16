package lesson_8.Computer;

public class Chip {
    private String brand;
    private long frequence;
    private int generation;

    public Chip(String brand, long frequence, int generation) {
        this.brand = brand;
        this.frequence = frequence;
        this.generation = generation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getFrequence() {
        return frequence;
    }

    public void setFrequence(long frequence) {
        this.frequence = frequence;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "brand='" + brand + '\'' +
                ", frequence=" + frequence +
                ", generation=" + generation +
                '}';
    }
}
