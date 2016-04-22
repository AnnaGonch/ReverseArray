package it.sevenbits.packages.reverse;

import it.sevenbits.packages.generics.MyArrayGeneric;
import it.sevenbits.packages.myException.EmptyArrayException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class ReverseArrayTest {

    private ReverseArray tester;

    @Before
    public  void SetUp(){
        tester = new ReverseArray();
    }
    @Test
    public void testReverseArrayInteger() throws EmptyArrayException {
        Integer []intArray = new Integer[] { 1, 2, 3, 4, 5 };
        Integer []intArrayReverse = new Integer[]{ 5, 4, 3, 2, 1 };
        MyArrayGeneric<Integer> array = new MyArrayGeneric<Integer>(intArray);
        MyArrayGeneric<Integer> arrayReverse;


            arrayReverse=tester.reverseArray(array);

        Integer[] arrayTester = new Integer[arrayReverse.getLength()];
        for (int i=0; i < arrayTester.length; i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("Wrong reverse",intArrayReverse,arrayTester);
    }

    @Test
    public void testReverseArrayString() throws EmptyArrayException {
        String []strArray = new String[] { "1", "2", "3", "4", "5" };
        String []strArrayReverse = new String[]{ "5", "4", "3", "2", "1" };
        MyArrayGeneric<String> array = new MyArrayGeneric<String>(strArray);
        MyArrayGeneric<String> arrayReverse;

            arrayReverse=tester.reverseArray(array);

        String[] arrayTester = new String[arrayReverse.getLength()];
            for (int i=0;i<arrayTester.length;i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("wrong reverse",strArrayReverse,arrayTester);
    }

    @Test(expected = EmptyArrayException.class)
    public void testReverseEmptyArray() throws EmptyArrayException {
        String []strArray = new String[] {};
        String []strArrayReverse = new String[]{};
        MyArrayGeneric<String> array = new MyArrayGeneric<String>(strArray);
        MyArrayGeneric<String> arrayReverse;

            arrayReverse=tester.reverseArray(array);

        String[] arrayTester = new String[arrayReverse.getLength()];
        for (int i=0;i<arrayTester.length;i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("wrong reverse",strArrayReverse,arrayTester);
    }
}
