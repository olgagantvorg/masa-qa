package lesson_12;

public class InterfaceClass extends ClassForInheritate implements BasicInterface, AnotherInterface{
    @Override
    public void sayHello() {

    }

    @Override
    public int printDef(int a, int b) {
        return a + b * 2;
    }
}
