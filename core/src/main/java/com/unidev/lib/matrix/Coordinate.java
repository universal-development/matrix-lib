package com.unidev.lib.matrix;

/**
 * Matrix position object. <br/>
 * Holds inside row, column for item inside of matrix. <br/>
 */
public class Coordinate {

    private Integer row;
    private Integer column;

    /**
     * New coordinate instance
     * @return new coordinate instance
     */
    public Coordinate newInstance() {
        return new Coordinate();
    }

    public Coordinate() {
        row = column = null;
    }

    public Coordinate withRow(Integer row) {
        setRow(row);
        return this;
    }

    public Coordinate withColumn(Integer column) {
        setColumn(column);
        return this;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (column != null ? !column.equals(that.column) : that.column != null) return false;
        if (row != null ? !row.equals(that.row) : that.row != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = row != null ? row.hashCode() : 0;
        result = 31 * result + (column != null ? column.hashCode() : 0);
        return result;
    }
}