package it.sevenbits.packages.generics;

import it.sevenbits.packages.interfaces.IArrayGenericInterface;

/**
 *MyArrayGeneric class
 * @param <T> type
 */
public class MyArrayGeneric<T> implements IArrayGenericInterface <T> {

    private T[] elementData;

    /**
     *MyArrayGeneric constructor
     * @param c array
     */

    public  MyArrayGeneric(final T[] c) {

       // elementData = (T[]) new Object[n];
        elementData = c;
    }

    /**
     * method getSize
     * @return size array
     */
    public int getLength() {

        return elementData.length;
    }

    /**
     * method getElemArray return element  position of i
     * @param i position
     * @return element array
     */
    public T getElemArray(final int i) {
        return elementData[i];
    }

    /**
     * setElemArray method set new element position of i
     * @param i position
     * @param arg new element
     */
    public void setElemArray(final int i, final T arg) {
        elementData[i] = arg;
    }

    /**
     * isEmpty method
     * @return true or false
     */
    public boolean isEmpty() {
        return elementData.length == 0;
    }


}
