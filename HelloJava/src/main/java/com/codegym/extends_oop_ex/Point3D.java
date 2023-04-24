package com.codegym.extends_oop_ex;

public class Point3D extends Point2D{
    private float z;    // 0.0f

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super();
        this.z = z;

//        setX(x);
//        setY(y);

//        super.setX(x);
//        super.setY(y);
//        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
//        this.getX() = getX()e;
    }

    public float[] getXYZ() {
//        float[] xyz = {this.getX(), this.getY(), this.z};

        float[] xyz = {this.getX(), this.getY(), this.z};
        return xyz;
    }

    public String toString() {
        return String.format("(%s,%s)", super.toString(), this.z);
    }

}
