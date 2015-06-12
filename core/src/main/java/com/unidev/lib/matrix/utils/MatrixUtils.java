package com.unidev.lib.matrix.utils;

import com.unidev.lib.matrix.model.Coordinate;
import com.unidev.lib.matrix.model.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Utils code to work with matrix instances
 */
public class MatrixUtils {

    public static <T> void shuffle(Matrix<T> matrix) {
        List<T> elements = new ArrayList<T>();
        Iterator<T> iterator = matrix.iterator();
        while(iterator.hasNext()) {
            elements.add(iterator.next());
        }
        Collections.shuffle(elements);

        int collectonIndex = 0;
        for(Integer row = 0;row < matrix.getRows();row++) {
            for(Integer col = 0;col < matrix.getColumns();col++) {
                T element = elements.get(collectonIndex++);
                matrix.set(Coordinate.coordinate().withRow(row).withColumn(col), element);
            }
        }

    }

}
