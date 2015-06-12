package com.unidev.lib.matrix.utils;

import com.unidev.lib.matrix.model.Coordinate;
import com.unidev.lib.matrix.model.Matrix;

import java.util.Iterator;

/**
 * Iterator used to navigate through matrix.
 */
public class MatrixIterator<T> implements Iterator<T> {

    protected Coordinate position;
    protected Matrix<T> matrix;

    public MatrixIterator(Matrix<T> matrix) {
        this.position = new Coordinate(0,0);
        this.matrix = matrix;
    }


    @Override
    public boolean hasNext() {
        if ( (position.getRow() == matrix.getRows()-1)
            && (position.getColumn() == matrix.getColumns() -1 ) ) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        if ( (position.getRow() == matrix.getRows()-1)
                && (position.getColumn() == matrix.getColumns() -1 ) ) {
            throw new IndexOutOfBoundsException(position + " is outside of matrix range");
        }
        T element = matrix.get(position);

        position.withColumn(position.getColumn()+1);

        if ( (position.getRow() == matrix.getRows())) {
            position.withColumn(0).withRow(position.getRow()+1);
        }
        return element;
    }
}
