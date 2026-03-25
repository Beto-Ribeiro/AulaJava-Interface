package figuras3D;

import java.lang.Math;

public class Cubo implements Figuras3D{
    private Ponto3D p0;
    private double lado;

    public Cubo(Ponto3D p0, double lado) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.lado = lado;
    }

    public Ponto3D getP0() {
        return new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
    }

    public Ponto3D Calp1() {

        return new Ponto3D(p0.getX() + lado, p0.getY(), p0.getZ());
    }

    public Ponto3D Calp2() {

        return new Ponto3D(p0.getX() + lado, p0.getY()+ lado, p0.getZ());
    }

    public Ponto3D Calp3() {
        return new Ponto3D(p0.getX() + lado, p0.getY(), p0.getZ() + lado);}

    public Ponto3D Calp4() {

        return new Ponto3D(p0.getX(), p0.getY() + lado, p0.getZ());
    }

    public Ponto3D Calp5() {

        return new Ponto3D(p0.getX(), p0.getY() + lado, p0.getZ() + lado);
    }

    public Ponto3D Calp6() {

        return new Ponto3D(p0.getX(), p0.getY(), p0.getZ() + lado);
    }

    public Ponto3D Calp7() {

        return new Ponto3D(p0.getX() + lado, p0.getY() + lado, p0.getZ() + lado);
    }

    @Override
    public double volume() {
        return Math.pow(lado, 3);
    }

    @Override
    public double superficie() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    @Override
    public void moveZ(double dZ) {
        p0.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        p0.moveXZ(dX, dZ);

    }

    @Override
    public void moveYZ(double dY, double dZ) {
        p0.moveYZ(dY, dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        p0.moveXYZ(dX, dY, dZ);
    }

    @Override
    public String toString() {
        return "Cubo {" +
                " p0= " + p0 +
                " p1= " + Calp1() +
                "\n" + " p2= " + Calp2() +
                "\n" + " p3= " + Calp3() +
                "\n" +" p4= " + Calp4() +
                "\n" +" p5= " + Calp5() +
                "\n" +" p6= " + Calp6() +
                "\n" +" p7= " + Calp7() +
                "\n" +", lado = " + lado +
                "\n" +", volume = " + volume() +
                "\n" +", superficie = " + superficie() +
                '}';
    }
}
