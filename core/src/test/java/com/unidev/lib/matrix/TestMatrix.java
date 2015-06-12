package com.unidev.lib.matrix;

import com.unidev.lib.matrix.utils.MatrixUtils;
import org.junit.Test;

import java.util.Random;

import static com.unidev.lib.matrix.model.Coordinate.coordinate;
import static com.unidev.lib.matrix.model.Coordinate.newInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNot.not;

public class TestMatrix {

    @Test
    public void testMatrixCreation() {

        DemoMatrix demoMatrix = new DemoMatrix(3);

        assertThat(demoMatrix.getRows(), is(3));
        assertThat(demoMatrix.getColumns(), is(3));

        demoMatrix = new DemoMatrix(4, 5);

        assertThat(demoMatrix.getRows(), is(4));
        assertThat(demoMatrix.getColumns(), is(5));

    }

    @Test
    public void testElementGetSet() {
        DemoMatrix demoMatrix = new DemoMatrix(3);

        demoMatrix.set(newInstance().withRow(0).withColumn(1), 666);

        Integer value = demoMatrix.get(newInstance().withRow(0).withColumn(1));
        assertThat(value, is(666));
    }

    @Test
    public void testMatrixComparasion() {
        DemoMatrix matrix = new DemoMatrix(3);
        DemoMatrix equalMatrix = new DemoMatrix(3);
        DemoMatrix differentSizeMatrix = new DemoMatrix(5,2);

        assertThat(matrix, equalTo(equalMatrix));
        assertThat(matrix, not(equalTo(differentSizeMatrix)));

        DemoMatrix equalSizeDifferentElement = new DemoMatrix(3);
        equalSizeDifferentElement.set(newInstance().withRow(1).withColumn(2), 120);

        assertThat(matrix, not(equalTo(equalSizeDifferentElement)));

    }

    @Test
    public void testMatrixClear() {
        DemoMatrix nullMatrix = new DemoMatrix(3);
        DemoMatrix dataMatrix = new DemoMatrix(3);

        dataMatrix.set(coordinate().withRow(2).withColumn(0), 400);
        assertThat(dataMatrix.get(coordinate().withRow(2).withColumn(0)), is(400));

        dataMatrix.clear();

        assertThat(dataMatrix.get(coordinate().withRow(2).withColumn(0)), is(nullValue()));

        assertThat(dataMatrix, equalTo(nullMatrix));
    }

    @Test
    public void testMatrixShuffle() {
        DemoMatrix matrix = new DemoMatrix(3);
        Random random = new Random();

        for(Integer row  = 0;row < 3;row++) {
            for(Integer column  = 0;column < 3;column++) {
                matrix.set(coordinate().withRow(row).withColumn(column), random.nextInt());
            }
        }
        DemoMatrix copyMatrix = new DemoMatrix(matrix);
        assertThat(matrix.equals(copyMatrix), is(true));

        MatrixUtils.shuffle(copyMatrix);
        assertThat(matrix.equals(copyMatrix), is(false));

    }



}
