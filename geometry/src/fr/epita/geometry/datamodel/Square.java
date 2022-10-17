package fr.epita.geometry.datamodel;

public class Square {

    private Rectangle rectangle;

    public Square(double side) {
        this.rectangle = new Rectangle(side, side);
    }

    public double getSide(){
        return this.rectangle.getHeight();
    }

    public void setSide(double side){
        this.rectangle.setWidth(side);
        this.rectangle.setHeight(side);
    }

    public double getArea(){
        return this.rectangle.getArea();
    }

    public double getPerimeter(){
        return this.rectangle.getPerimeter();
    }


}
