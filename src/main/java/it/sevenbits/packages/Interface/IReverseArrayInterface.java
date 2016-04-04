package it.sevenbits.packages.Interface;

import it.sevenbits.packages.Generics.MyArrayGeneric;

/**
 *Interface ReverseArray class
 */
public interface IReverseArrayInterface {
    /**
     *reverseArray method
     * @param array reverse
     * @return array
     */
    MyArrayGeneric<?> reverseArray(final MyArrayGeneric<?> array);
}
