import it.sevenbits.packages.generics.MyArrayGeneric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyArrayGenericTest {



    @Test
    public void getLengthArrayIntegerTest(){
        Integer[] array = new Integer[]{ 1, 2, 3};
        MyArrayGeneric<Integer> arrayTesting = new MyArrayGeneric<Integer>(array);
        assertEquals("Wrong return length",3 ,arrayTesting.getLength());
   }
    @Test
    public void getLengthArrayStringTest(){
        String[] array = new String[]{ "1", "2", "3"};
        MyArrayGeneric<String> arrayTesting = new MyArrayGeneric<String>(array);
        assertEquals("Wrong return length",3 ,arrayTesting.getLength());
    }

    @Test
    public void getElemArrayIntegerTest(){
        Integer[] array = new Integer[]{ 1, 2, 3};
        MyArrayGeneric<Integer> arrayTesting = new MyArrayGeneric<Integer>(array);
        for(int i = 0;i<arrayTesting.getLength();i++)
            assertEquals("Wrong return element array",array[i],arrayTesting.getElemArray(i));
    }

    @Test
    public void setElemArrayIntegerTest(){
        Integer[] array = new Integer[]{ 1, 2, 3};
        MyArrayGeneric<Integer> arrayTesting = new MyArrayGeneric<Integer>(array);
        int i = 1;
        Integer arg = 4;
        arrayTesting.setElemArray(i, arg);
        assertEquals("Wrong return element array", arg, arrayTesting.getElemArray(i));

    }

    @Test
    public void isEmptyArrayIntegerTest(){
        Integer[] arrayEmpty = new Integer[]{};
        MyArrayGeneric<Integer> arrayTesting = new MyArrayGeneric<Integer>(arrayEmpty);
        assertEquals("array not empty", true, arrayTesting.isEmpty());
       // assertTrue("",arrayTesting.isEmpty());
        Integer[] array = new Integer[]{1, 2, 3};
        MyArrayGeneric<Integer> arrayTesting_ = new MyArrayGeneric<Integer>(array);
       // assertTrue("",arrayTesting.isEmpty());
        assertEquals("array empty", false, arrayTesting_.isEmpty());
    }
}
