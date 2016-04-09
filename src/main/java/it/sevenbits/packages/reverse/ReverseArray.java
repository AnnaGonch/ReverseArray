package it.sevenbits.packages.reverse;

import it.sevenbits.packages.generics.MyArrayGeneric;
import it.sevenbits.packages.interfaces.IReverseArrayInterface;
import it.sevenbits.packages.myException.EmptyArrayException;

/**
 * Provides reversing for array
 *
 */
 public class ReverseArray implements IReverseArrayInterface {
    /**
     * reverseArray method
     * @param array reverse
     * @param <T> type
     * @throws EmptyArrayException exception
     * @return array reverse
     */
     public <T> MyArrayGeneric<T> reverseArray(final MyArrayGeneric<T> array) throws EmptyArrayException  {
         if (array.isEmpty()) {
             throw new EmptyArrayException();
         }
        T tmp;
        for (int i = 0; i < array.getLength() / 2 ; ++i) {
            tmp = array.getElemArray(i);
            array.setElemArray(i, array.getElemArray(array.getLength() - i - 1));
            array.setElemArray(array.getLength() - i - 1, tmp);
        }
        return array;
    }
}
