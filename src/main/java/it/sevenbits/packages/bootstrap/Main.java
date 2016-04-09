/**
 * Bootstrap
 */
package it.sevenbits.packages.bootstrap;


import it.sevenbits.packages.generics.MyArrayGeneric;
import it.sevenbits.packages.myException.EmptyArrayException;
import it.sevenbits.packages.reverse.ReverseArray;

/**
 * Main Class
 * Entry Point
 */
final class Main {
    /**
     * Default constructor
     */
    private Main(){
    }
    /**
     * main method
     * @param args incoming argument
     * @throws EmptyArrayException hh
     */
    public static void main(final String[] args) throws EmptyArrayException {

        //Integer []intArray = new Integer[] { 1, 2, 3, 4, 5 };
        String []stringArray = new String[]{"1", "2", "3" , "4", "5"};
        //String []stringArray = new String[]{};
        MyArrayGeneric<String> array = new MyArrayGeneric<String>(stringArray);
        try {
            if (array.isEmpty()) {
                throw new EmptyArrayException();
            }
            for (int i = 0; i < array.getLength(); i++) {
                System.out.println(array.getElemArray(i));
            }
            ReverseArray object = new ReverseArray();


            object.reverseArray(array);
            for (int i = 0; i < array.getLength(); i++) {
                System.out.println(array.getElemArray(i));
            }
        } catch (EmptyArrayException ex) {
            System.out.println("Empty array");
            }

    }
}
