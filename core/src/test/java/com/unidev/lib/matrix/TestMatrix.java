package com.unidev.lib.matrix;

import com.unidev.lib.matrix.model.Coordinate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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

        demoMatrix.set(Coordinate.newInstance().withRow(0).withColumn(1), 666);

        Integer value = demoMatrix.get(Coordinate.newInstance().withRow(0).withColumn(1));
        assertThat(value, is(666));
    }



}
