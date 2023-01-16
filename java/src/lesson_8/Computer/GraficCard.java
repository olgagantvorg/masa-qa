package lesson_8.Computer;

public class GraficCard {
    private long frequensy;
    private String brand;

    public GraficCard(long frequensy, String brand) {
        this.frequensy = frequensy;
        this.brand = brand;
    }

    public long getFrequensy() {
        return frequensy;
    }

    public void setFrequensy(long frequensy) {
        this.frequensy = frequensy;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "GraficCard{" +
                "frequensy=" + frequensy +
                ", brand='" + brand + '\'' +
                '}';
    }
}
