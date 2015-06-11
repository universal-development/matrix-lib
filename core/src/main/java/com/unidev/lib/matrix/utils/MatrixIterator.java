package com.unidev.lib.matrix.utils;

import com.unidev.lib.matrix.model.Coordinate;
import com.unidev.lib.matrix.model.Matrix;

import java.util.Iterator;

/**
 * Iterator used to navigate through matrix.
 */
public class MatrixIterator<T> implements Iterator<T> {


    protected Coordinate position;

    public MatrixIterator(Matrix<T> matrix) {
        position = new Coordinate(0,0);
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
