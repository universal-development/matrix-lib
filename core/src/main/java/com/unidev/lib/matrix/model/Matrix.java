package com.unidev.lib.matrix.model;

import com.unidev.lib.matrix.utils.MatrixIterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Matrix representation
 */
public abstract class Matrix<T> implements Iterable<T>, Cloneable{

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
     * Constructor with Matrix argument
     * @param matrix
     */
    public Matrix(Matrix<T> matrix) {
        this.rows = matrix.rows;
        this.rows = matrix.rows;
        this.columns = matrix.columns;
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
        //TODO: deep equals maybe ?
        for(int row = 0;row<getRows();row++) {
            if (!Arrays.equals(matrix[row], otherMatrix.matrix[row])) {
                return false;
            }
        }
        return true;
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
    public Matrix set(Coordinate coordinate, T value) {
        matrix[coordinate.getRow()][coordinate.getColumn()] = value;
        return this;
    }

    /**
     * Find item in matrix
     * @param item Item to search, may be null value
     * @return return item coordinate or null if not found
     */
    public Coordinate positionOf(T item) {
        for(Integer row = 0;row < getRows();row++) {
            for(Integer column = 0;column < getColumns();column++) {
                if (item == null) {
                    if (matrix[row][column] == null) {
                        return Coordinate.newInstance().withRow(row).withColumn(column);
                    }
                } else {
                    if (item.equals(matrix[row][column])) {
                        return Coordinate.newInstance().withRow(row).withColumn(column);
                    }
                }
            }
        }
        return null;
    }

    /**
     * Clear matrix cells, set everything to null
     */
    public Matrix clear() {
        for(Integer row = 0;row < getRows();row++) {
            for(Integer column = 0;column < getColumns();column++) {
                matrix[row][column] = null;
            }
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return new MatrixIterator<T>(this);
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }
}
