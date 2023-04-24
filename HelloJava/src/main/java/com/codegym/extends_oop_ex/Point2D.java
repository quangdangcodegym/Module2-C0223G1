package com.codegym.extends_oop_ex;

public class Point2D{
    private float x;
    private float y;

    public Point2D(){
//        super();
    }
    public Point2D(float x, float y){
//        super();
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
//        float[] mang = new float[]{x, y};
//        float[] xy = new float[2];
//        xy[0] = x;
//        xy[1] = y;
        float[] xy = {x, y};
        return xy;

    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", this.x, this.y);
    }
}
