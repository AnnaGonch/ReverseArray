package it.sevenbits.packages.reverse;

import it.sevenbits.packages.Generics.MyArrayGeneric;
import it.sevenbits.packages.Interface.IReverseArrayInterface;

/**
 * Provides reversing for array of integer
 *
 */
 public class ReverseArray implements IReverseArrayInterface {
    /**
     * Revers integer array
     * @param array of integer
     * @return reversed array of integer
     */
     public MyArrayGeneric<?> reverseArray(final MyArrayGeneric<?> array) {
        Object tmp;
        for (int i = 0; i < array.getSize() / 2 ; ++i) {
            tmp = array.getElemArray(i);
            array.setElemArray(i, array.getElemArray(array.getSize() - i - 1));
            array.setElemArray(array.getSize() - i - 1, tmp);
        }
        return array;
    }
}
