/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package figuras3D;

import figuras2D.Objeto2D;

/**
 *
 * @author aluno
 */
public interface Objeto3D{
    void moveX(double dX);
    void moveY(double dY);
    void moveXY(double dX, double dY);
    void moveZ(double dZ);
    void moveXZ(double dX,double dZ);
    void moveYZ(double dY,double dZ);
    void moveXYZ(double dX, double dY, double dZ);
}
