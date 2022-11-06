package ee.secretagency.homework;

public class ExceptionBreakConsoleProgram {

    public static void main(String[] args) {

        System.out.println("I'm Maniek");
        if (true) {
            System.out.println("here");
            String name = null;
            name.toString();
        }
        System.out.println("what now??");
    }
}
