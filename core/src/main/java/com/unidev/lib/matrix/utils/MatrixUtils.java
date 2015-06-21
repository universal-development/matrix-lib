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
