package com.unidev.lib.matrix;

import com.unidev.lib.matrix.model.Matrix;

/**
 * Basic class matrix class for testing purposes,
 * it will store Integer values.
 */
public class DemoMatrix extends Matrix<Integer> {

    public DemoMatrix(Integer dimension) {
        super(dimension);
    }

    public DemoMatrix(Integer rows, Integer columns) {
        super(rows, columns);
    }

    @Override
    protected Integer[][] createMatrix(Integer rows, Integer columns) {
        return new Integer[rows][columns];
    }


}
