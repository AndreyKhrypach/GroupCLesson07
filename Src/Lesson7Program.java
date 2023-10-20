import java.util.Arrays;
import java.util.Random;

public class Lesson7Program {

//    public final double PI = 3.14;
//    public double pi = 3.14;

    static int test3;
    public static void main(String[] args) {
        Person person = new Person();

        Person.personInfoStatic("Andrey", "Khrypach", "Lviv", 123456);
        person.personInfo("Andrey", "Khrypach", "Lviv", 123456);

        int a = 0;
        Integer a1 = a;
        byte b = 0;
        Byte b1 = b;
        short s = 0;
        Short s1 = s;
        long l = 0;
        Long l1 = l;
        boolean bool = true;
        Boolean bool1 = bool;
        char c = 'A';
        Character c1 = c;

        Integer temp = new Integer(5);

        Integer test = 2;
        int test2 = test;
        System.out.println(test2);
        int abc = 0;
        System.out.println(abc);

        System.out.println(test3);
//        System.out.println(a1);
//        System.out.println(a);



//        Lesson7Program program = new Lesson7Program();
//        double pi = 3.14;
//        double radius1 = 9 / (2 * program.pi);
//        double radius2 = 9 / (2 * pi);

//        double radius1 = 9 / (2 * program.PI);
//        double radius2 = program.calculateRadius(9);
//        System.out.println(radius1);
//        System.out.println(radius2);

//        Random rnd = new Random();
//        int[] arr1 = initializeArray(new int[6]);
//        int[] arr2 = initializeArray(new int[9]);
//        int[] arr3 = initializeArray(15);
//        int[] arr1 = new int[6];
//        int[] arr2 = new int[9];
//
//        arr1 = initializeArray(arr1);
//        arr2 = initializeArray(arr2);

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        for (int index = 0; index < arr1.length; index++) {
//            arr1[index] = rnd.nextInt();
//        }
//
//        for (int index = 0; index < arr2.length; index++) {
//            arr2[index] = rnd.nextInt();
//        }

    }

    public static int[] initializeArray(int[] array) {
        Random rnd = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = rnd.nextInt();
        }
        return array;
    }

    public static int[] initializeArray(int lengthArray) {
        Random rnd = new Random();
        int[] array = new int[lengthArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = rnd.nextInt();
        }
        return array;
    }

//    public double calculateRadius(int lengthCircle) {
//        return lengthCircle / (2 * PI);
//    }
}
