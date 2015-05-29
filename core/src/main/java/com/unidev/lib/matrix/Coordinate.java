package com.unidev.lib.matrix;

/**
 * Matrix position object
 */
public class Coordinate {

    private Integer line;
    private Integer column;

    public Coordinate() {

    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
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
                "line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (column != null ? !column.equals(that.column) : that.column != null) return false;
        if (line != null ? !line.equals(that.line) : that.line != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = line != null ? line.hashCode() : 0;
        result = 31 * result + (column != null ? column.hashCode() : 0);
        return result;
    }
}
