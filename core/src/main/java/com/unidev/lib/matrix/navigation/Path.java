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
