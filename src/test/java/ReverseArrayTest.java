import it.sevenbits.packages.generics.MyArrayGeneric;
import it.sevenbits.packages.myException.EmptyArrayException;
import it.sevenbits.packages.reverse.ReverseArray;
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
    public void testReverseArrayInteger() {
        Integer []intArray = new Integer[] { 1, 2, 3, 4, 5 };
        Integer []intArrayReverse = new Integer[]{ 5, 4, 3, 2, 1 };
        MyArrayGeneric<Integer> array = new MyArrayGeneric<Integer>(intArray);
        MyArrayGeneric<Integer> arrayReverse = new MyArrayGeneric<Integer>(intArray);
        try {
            arrayReverse=tester.reverseArray(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer[] arrayTester = new Integer[arrayReverse.getLength()];
        for (int i=0; i < arrayTester.length; i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("Wrong reverse",intArrayReverse,arrayTester);
    }

    @Test
    public void testReverseArrayString() {
        String []strArray = new String[] { "1", "2", "3", "4", "5" };
        String []strArrayReverse = new String[]{ "5", "4", "3", "2", "1" };
        MyArrayGeneric<String> array = new MyArrayGeneric<String>(strArray);
        MyArrayGeneric<String> arrayReverse = new MyArrayGeneric<String>(strArray);
        try {
            arrayReverse=tester.reverseArray(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] arrayTester = new String[arrayReverse.getLength()];
            for (int i=0;i<arrayTester.length;i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("wrong reverse",strArrayReverse,arrayTester);
    }

    @Test
    public void testReverseEmptyArray(){
        String []strArray = new String[] {};
        String []strArrayReverse = new String[]{};
        MyArrayGeneric<String> array = new MyArrayGeneric<String>(strArray);
        MyArrayGeneric<String> arrayReverse = new MyArrayGeneric<String>(strArrayReverse);

        try {
            arrayReverse=tester.reverseArray(array);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
        String[] arrayTester = new String[arrayReverse.getLength()];
        for (int i=0;i<arrayTester.length;i++)
            arrayTester[i] = arrayReverse.getElemArray(i);

        assertArrayEquals("wrong reverse",strArrayReverse,arrayTester);
    }
}
