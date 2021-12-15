package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    static int number = 0;

    public static void main( String[] args )
    {
        primitives();
        assignmentOperator();
    }

    public static int nextId(){
        return ++number;
    }



    public static void primitives(){
        byte b = 127;
        short s = 14000;
        int i = 64;
        long l = 42342342423434234L;
        float f = 10.0F;
        double d = 10.0;
        char c = '5';
        boolean yes = true;
    }

    public static void assignmentOperator(){
        int number = 100;
        int number2 = 10;
        int number3 = 5;

        int result = number3 = number2 = number;

        System.out.println(result);
    }

}
