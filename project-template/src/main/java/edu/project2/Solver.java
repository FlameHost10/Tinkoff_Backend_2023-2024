package edu.project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solver {

    private static final int[][] possibleDirections = {
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0}
    };


    public static List<Point> solver(Maze maze) {
        List<Point> path = new ArrayList<>();
        Point entrance = maze.getEntrance();
        if(findingPath(maze, path, entrance.height(), entrance.width())){
            return path;
        }
        return Collections.emptyList();
    }
    private static boolean findingPath(Maze maze, List<Point> path, int nowHeight, int nowWidth) {
        Point[][] mazePoint = maze.getMaze();
        Point nowPoint = new Point(nowHeight, nowWidth, Point.PointType.PASSAGE);
        if (!maze.suitableCoordinate(nowHeight, nowWidth)
            || mazePoint[nowHeight][nowWidth].type() == Point.PointType.WALL
            || path.contains(nowPoint)) {
            return false;
        }

        path.add(nowPoint);

        if (nowPoint.equals(maze.getExit())) {
            return true;
        }

        for (int[] direction : possibleDirections) {
            if (findingPath(maze, path, nowHeight + direction[0], nowWidth + direction[1])) {
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }

}
