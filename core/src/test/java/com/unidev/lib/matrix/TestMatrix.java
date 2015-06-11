package com.unidev.lib.matrix;

import com.unidev.lib.matrix.model.Matrix;

/**
 * Basic class matrix class for testing purposes,
 * it will store Integer values.
 */
public class TestMatrix extends Matrix<Integer> {

    public TestMatrix(Integer dimension) {
        super(dimension);
    }

    public TestMatrix(Integer rows, Integer columns) {
        super(rows, columns);
    }

    @Override
    protected Integer[][] createMatrix(Integer rows, Integer columns) {
        return new Integer[rows][columns];
    }


}
