package com.unidev.lib.matrix;

/**
 * Matrix representation
 */
public abstract class Matrix<T> {

    private T matrix[][];
    private Integer rows;
    private Integer columns;

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
