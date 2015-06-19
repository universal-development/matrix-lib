package com.unidev.lib.matrix.navigation;

import com.unidev.lib.matrix.model.Coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * Matrix path, collection of coordinates of path
 */
public class Path {

    protected List<Coordinate> path;

    public Path() {
        path = new ArrayList<Coordinate>();
    }

    public Path(List<Coordinate> path) {
        this.path = path;
    }

    public void add(Coordinate coordinate) {
        path.add(coordinate);
    }

    public List<Coordinate> getPath() {
        return path;
    }

    public void clear() {
        path.clear();
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + path +
                '}';
    }
}
