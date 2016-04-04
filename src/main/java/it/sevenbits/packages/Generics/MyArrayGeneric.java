package it.sevenbits.packages.Generics;

/**
 *MyArrayGeneric class
 * @param <T> type
 */
public class MyArrayGeneric<T>  {

    private T[] elementData;
    private int size;

    /**
     *
     * @param c array
     * @param n length array
     */

    public MyArrayGeneric(final T[] c, final int n) {

        elementData = (T[]) new Object[n];
        elementData = c;
        size = n;
    }

    /**
     * method getSize
     * @return size array
     */
    public int getSize() {
        return size;
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
    public void setElemArray(final int i, final Object arg) {
        elementData[i] = (T)arg;
    }


}
