/**
 * Bootstrap
 */
package it.sevenbits.packages.bootstrap;


import it.sevenbits.packages.Generics.MyArrayGeneric;
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
     */
    public static void main(final String[] args) {

        //Integer []intArray = new Integer[] { 1, 2, 3, 4, 5 };
        String []stringArray = new String[]{"1", "2", "3" , "4", "5"};

        MyArrayGeneric<String> array = new MyArrayGeneric<String>(stringArray, stringArray.length);

        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.getElemArray(i));
        }

        ReverseArray object = new ReverseArray();

        object.reverseArray(array);
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.getElemArray(i));
        }
    }
}
