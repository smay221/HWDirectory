package com.artem.geometry;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public double S(){
        double firstSt, secondSt, thirdSt;
        firstSt = first.distance(second);
        secondSt = second.distance(third);
        thirdSt = third.distance(first);
        double p =  (firstSt + secondSt + thirdSt) / 2;
        return Math.sqrt(p * (p - firstSt) * (p - secondSt) * (p - thirdSt));
    }
}
