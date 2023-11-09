package edu.project2;

import java.util.Objects;

public record Point(int height, int width, PointType type) {
    private static final String COLOR_RED = "\u001B[31m";
    private static final String COLOR_BLUE = "\u001B[34m";

    public enum PointType{
        PASSAGE(COLOR_BLUE + "."),
        WALL(COLOR_RED + "#");

        private String displaySymbol;

        PointType(String displaySymbol){
            this.displaySymbol = displaySymbol;
        }

        @Override
        public String toString() {
            return displaySymbol;
        }
    }




    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return height == point.height && width == point.width && type == point.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, type);
    }
}
