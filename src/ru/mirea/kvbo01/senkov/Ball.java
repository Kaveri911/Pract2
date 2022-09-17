package ru.mirea.kvbo01.senkov;

public class Ball
{
    private double x=0.0;
    private double y=0.0;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
public void Ball()
{
    System.out.println("Я шарик с координатами"+x+" "+y);
}
public void setXY(double x,double y)
{
    this.x=x;
    this.y=y;
}
public void move(double xDisp, double yDisp)
{
    System.out.println("Я шарик, я предвинулся с "+this.x+"  "+this.y+" НА "+xDisp+"  "+yDisp);
}
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
