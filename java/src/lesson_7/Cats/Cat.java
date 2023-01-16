package lesson_7.Cats;

import java.util.Scanner;

public class Cat {

    Scanner input = new Scanner(System.in);
    private String name;
    private String colour;
    private int age;


    public Cat(String name,String colour,int age){
        this.name = name;
        this.colour= colour;
        this.age = age;
        while (age<0 || age >30){
            System.out.println("Add real cat " + name + " age: ");
            age = input.nextInt();
        }
    }
    public void sayMeow() {

        System.out.println("Cat " + name + " says 'Meow'!");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age<0 || age >30){
            System.out.println("Add real cat's age: ");
            age = input.nextInt();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
