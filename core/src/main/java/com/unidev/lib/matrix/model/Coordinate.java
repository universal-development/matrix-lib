/**
 * Copyright (c) 2015 Denis O <denis@universal-development.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unidev.lib.matrix.model;

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
    public static Coordinate newInstance() {
        return new Coordinate();
    }

    /**
     * New coordinate instance
     * @return new coordinate instance
     */
    public static Coordinate coordinate() {
        return new Coordinate();
    }

    public static Coordinate coordinate(Coordinate coordinate) {
        return new Coordinate(coordinate);
    }

    public Coordinate() {
        row = column = null;
    }

    public Coordinate(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Coordinate(Coordinate coordinate) {
        this.row = coordinate.row;
        this.column = coordinate.column;
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
