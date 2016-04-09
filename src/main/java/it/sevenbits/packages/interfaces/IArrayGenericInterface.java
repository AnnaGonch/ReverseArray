package it.sevenbits.packages.interfaces;

/**
 * Interface MyArrayGeneric class
 * @param <T> type generic
 */
public interface IArrayGenericInterface <T> {
    /**
     * getLength method
     * @return length array
     */
    int getLength();

    /**
     *getElemArray method
     * @param i index in array
     * @return element array index i
     */
    T getElemArray(final int i);

    /**
     *setElemArray method set new element arg
     * @param i index
     * @param arg new element
     */
    void setElemArray(final int i, final T arg);

    /**
     * isEmpty method
     * @return true or false
     */
    boolean isEmpty();


}
