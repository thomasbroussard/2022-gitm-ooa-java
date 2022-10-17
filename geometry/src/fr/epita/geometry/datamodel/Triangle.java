package fr.epita.geometry.datamodel;

public class Triangle {

   private float sideB;
   private float sideA;
   private float height;
   private float base;

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }


    public double getArea(){
        return this.base * this.height / 2;
    }


    public double getPerimeter(){
        return this.sideA + this.sideB + this.base;
    }
}
