/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3D;

/**
 *
 * @author aluno
 */
public class Ponto3D implements Objeto3D {

    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    @Override
    public void moveZ(double dZ) {
        z += dZ;
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        x += dX;
        z += dZ;
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        y += dZ;
        z += dY;
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        y += dY;
        z += dZ;
        x += dX;
    }

    @Override
    public String toString() {
        return "Ponto3D(" + x + " " + y +" "+ z + ')';
    }

    @Override
    public void moveX(double dX) {
       x = x+dX;
    }

    @Override
    public void moveY(double dY) {
        y = y+dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x+=dX;
        y+=dY;
    }
   
    
    
}
