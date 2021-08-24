package com.artem.geometry;

import java.util.Scanner;
import java.math.*;

public class Point {
    private int x, y, z;

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Point plus(Point second){
        return new Point(second.x + x, second.y + y, second.z + z);
    }
    public  Point minus(Point second){
        return  new Point(x - second.x, y - second.y, z - second.z);
    }
    public double distance(Point second){
        return Math.sqrt(Math.pow(second.x - x, 2) + Math.pow(second.y - y, 2) + Math.pow(second.z - z, 2));
    }
}