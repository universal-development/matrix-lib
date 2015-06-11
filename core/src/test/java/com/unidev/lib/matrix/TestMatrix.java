package com.unidev.lib.matrix;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestMatrix {

    @Test
    public void testMatrixCreation() {

        DemoMatrix demoMatrix = new DemoMatrix(3);

        assertThat(demoMatrix.getRows(), is(3));
        assertThat(demoMatrix.getColumns(), is(3));

    }



}
