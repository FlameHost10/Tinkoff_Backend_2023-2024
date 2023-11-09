package edu.project2;

import java.util.List;

public class Maze {
    private static final String COLOR_GREEN = "\u001B[32m";

    private int width;
    private int height;
    private Point[][] maze;
    private Point entrance;
    private Point exit;
    private List<Point> decision = null;

    public Maze(int width, int height, GeneratorType type){
        switch (type){
            case PERFECT_GENERATOR -> perfectGenerator(width, height);
        }
    }
    public enum GeneratorType{
        PERFECT_GENERATOR
    }

    //Print
    public String toStringWithDecision(){
        if(decision == null){
            return COLOR_GREEN + "there is no solution yet";
        }
        StringBuilder mazeString = new StringBuilder();
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(decision.contains(new Point(i, j, Point.PointType.PASSAGE))){
                    mazeString.append(COLOR_GREEN + "+");
                }
                else{
                    mazeString.append(maze[i][j].type());
                }
            }
            mazeString.append("\n");
        }
        return mazeString.toString();
    }
    public String toString(){
        StringBuilder mazeString = new StringBuilder();
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mazeString.append(maze[i][j].type());
            }
            mazeString.append("\n");
        }
        return mazeString.toString();
    }

    //Setters and getters
    public Point[][] getMaze() {
        return maze;
    }
    public Point getEntrance() {
        return entrance;
    }
    public Point getExit() {
        return exit;
    }
    public void setDecision(List<Point> decision) {
        this.decision = decision;
    }




    //auxiliary functions
    public boolean suitableCoordinate(int x, int y){
        return (this.height > x && x >= 0) && (this.width > y && y >= 0);
    }
    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    private boolean putPassage(int i, int j){
        return (maze[i - 1][j - 1].type() == Point.PointType.WALL && maze[i - 1][j + 1].type() == Point.PointType.WALL && maze[i - 1][j].type() == Point.PointType.PASSAGE) ||
            (maze[i][j - 1].type() == Point.PointType.WALL && maze[i - 1][j].type() == Point.PointType.WALL) ||
            (maze[i][j - 1].type() == Point.PointType.WALL && maze[i - 1][j + 1].type() == Point.PointType.WALL);
    }
    private boolean putPassagePenultimateRow(int i, int j){
        return (maze[i - 1][j - 1].type() == Point.PointType.WALL || maze[i - 1][j].type() == Point.PointType.WALL
            || maze[i - 1][j + 1].type() == Point.PointType.WALL || maze[i + 1][j].type() == Point.PointType.PASSAGE);
    }
    private void perfectGenerator(int width, int height){
        this.width = width;
        this.height = height;
        this.maze = new Point[height][width];

        //filling of external walls
        for(int j = 0; j < width; j++){
            maze[0][j] = new Point(0, j, Point.PointType.WALL);
            maze[height - 1][j] = new Point(height - 1, j, Point.PointType.WALL);
        }
        for(int i = 0; i < height; i++){
            maze[i][0] = new Point(i, 0, Point.PointType.WALL);
            maze[i][width - 1] = new Point(i, width - 1, Point.PointType.WALL);
        }

        //pinning out the input and output
        int entryIndex = rnd(1, width - 2); //the entrance to the maze will always be on the upper side. entryIndex - the index of the entry point on the upper side of the maze.
        maze[0][entryIndex] = new Point(0, entryIndex, Point.PointType.PASSAGE);
        entrance = maze[0][entryIndex];

        int outputIndex = rnd(1, width - 2);
        maze[height - 1][outputIndex] = new Point(height - 1,outputIndex, Point.PointType.PASSAGE);
        exit = maze[height - 1][outputIndex];


        //other points
        for(int i = 1; i < height - 1; i++){
            for(int j = 1; j < width - 1; j++){
                if(putPassage(i, j)){
                    maze[i][j] = new Point(i, j, Point.PointType.PASSAGE);
                }
                else if((i == height - 2) && putPassagePenultimateRow(i, j)){
                    maze[i][j] = new Point(i, j, Point.PointType.PASSAGE);
                }
                else{
                    int isWall = rnd(0, 1);
                    if(isWall == 0){
                        maze[i][j] = new Point(i, j, Point.PointType.PASSAGE);
                    }
                    else{
                        maze[i][j] = new Point(i, j, Point.PointType.WALL);
                    }
                }
            }
        }
    }

}
