package it.sevenbits.packages.interfaces;

import it.sevenbits.packages.generics.MyArrayGeneric;

/**
 *interfaces ReverseArray class
 */
public interface IReverseArrayInterface {
    /**
     *reverseArray method
     * @param array reverse
     * @param <T> type
     * @return array
     */
   <T> MyArrayGeneric<T> reverseArray(final MyArrayGeneric<T> array);
}
