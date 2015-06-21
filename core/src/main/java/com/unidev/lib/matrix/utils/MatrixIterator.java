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

    public void reset() {
        this.position = new Coordinate(0, 0);
    }

    @Override
    public boolean hasNext() {
        if ( (position.getRow() < matrix.getRows())
            && (position.getColumn() < matrix.getColumns()) ) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if ( (position.getRow().equals(matrix.getRows()))
                && (position.getColumn().equals(matrix.getColumns())) ) {
            throw new IndexOutOfBoundsException(position + " is outside of matrix range");
        }
        T element = matrix.get(position);
        position.withColumn(position.getColumn()+1);
        if ( (position.getColumn().equals(matrix.getColumns()))) {
            position.withColumn(0).withRow(position.getRow()+1);
        }
        return element;
    }

    @Override
    public String toString() {
        return "MatrixIterator{" +
                "position=" + position +
                ", matrix=" + matrix +
                '}';
    }
}
