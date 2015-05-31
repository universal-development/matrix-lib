package com.unidev.lib.matrix;

import java.util.Arrays;

/**
 * Matrix representation
 */
public abstract class Matrix<T> {

    protected T matrix[][];
    protected Integer rows;
    protected Integer columns;

    /**
     * Create matrix object
     * @param rows Number of rows in matrix
     * @param columns Number of columns
     * @return 2d array of T
     */
    protected abstract T[][] createMatrix(Integer rows, Integer columns);

    /**
     * Create a square matrix
     * @param dimension
     */
    public Matrix(Integer dimension) {
        rows = columns = dimension;
        matrix = createMatrix(dimension, dimension);
    }

    /**
     * Create  matrix
     * @param rows
     * @param columns
     */
    public Matrix(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = createMatrix(rows, columns);
    }

    /**
     * Compare matrix
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Matrix)) {
            return false;
        }
        Matrix<T> otherMatrix = (Matrix<T>) object;
        if (getRows() != otherMatrix.getRows()) {
            return false;
        }
        if (getColumns() != otherMatrix.getColumns()) {
            return false;
        }

        for(int row = 0;row<=getRows();row++) {
            for(int column = 0;column<=getColumns();column++) {
                if (!matrix[row][column].equals(otherMatrix.matrix[row][column])) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }

    /**
     * Get value from coordinate
     * @param coordinate
     * @return
     */
    public T get(Coordinate coordinate) {
        return matrix[coordinate.getRow()][coordinate.getColumn()];
    }

    /**
     * Set value on specific coordinate
     * @param coordinate
     * @param value
     */
    public void set(Coordinate coordinate, T value) {
        matrix[coordinate.getRow()][coordinate.getColumn()] = value;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }
}
