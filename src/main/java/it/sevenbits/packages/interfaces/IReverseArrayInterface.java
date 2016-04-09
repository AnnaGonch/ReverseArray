package it.sevenbits.packages.interfaces;

import it.sevenbits.packages.generics.MyArrayGeneric;
import it.sevenbits.packages.myException.EmptyArrayException;

/**
 *interfaces ReverseArray class
 */
public interface IReverseArrayInterface {
    /**
     *
     * @param array reverse
     * @param <T> type
     * @return array
     * @throws EmptyArrayException exception
     */
   <T> MyArrayGeneric<T> reverseArray(final MyArrayGeneric<T> array) throws EmptyArrayException ;
}
