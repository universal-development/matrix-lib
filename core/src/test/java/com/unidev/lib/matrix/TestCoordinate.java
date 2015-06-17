package com.unidev.lib.matrix;


import com.unidev.lib.matrix.model.Coordinate;
import org.junit.Test;


import static com.unidev.lib.matrix.model.Coordinate.coordinate;
import static com.unidev.lib.matrix.model.Coordinate.newInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsNot.not;


public class TestCoordinate {


    @Test
    public void testCoordinateCreation() {
        Coordinate coordinate = coordinate().withColumn(3).withRow(10);
        Coordinate sameCoordinate = coordinate().withColumn(3).withRow(10);
        Coordinate copyCoordinate = coordinate(coordinate);
        Coordinate otherCoordinate = coordinate().withColumn(1).withRow(4);

        assertThat(coordinate, is(not(nullValue())));
        assertThat(coordinate.getColumn(), is(3));
        assertThat(coordinate.getRow(), is(10));

        assertThat(coordinate, is(equalTo(sameCoordinate)));
        assertThat(coordinate, is(equalTo(copyCoordinate)));

        assertThat(copyCoordinate.getColumn(), is(3));
        assertThat(copyCoordinate.getRow(), is(10));


        assertThat(otherCoordinate, is(not(equalTo(coordinate))));

    }

}
