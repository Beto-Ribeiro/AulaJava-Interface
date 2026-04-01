/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02interface;

import figuras3D.Cubo;
import figuras3D.Esfera;
import figuras3D.Ponto3D;
import figuras3D.SegReta3D;

/*
IMPORTS DAS FIGURAS 2D 
import figuras2D.Ponto2D;
import figuras2D.Quadrado;
import figuras2D.Retangulo;
import figuras2D.SegReta2D;
import figuras2D.Circulo;
import figuras2D.Triangulo;
*/


public class main {


    public static void main(String[] args) {
        /*
        MAIN DAS FIGURAS
        Ponto2D pA = new Ponto2D(0, 0);
        Quadrado q01 = new Quadrado(pA, 2);
        System.out.println(q01);
        Ponto2D pB = new Ponto2D(1, 1);
        Retangulo r01 = new Retangulo(pB, 2, 3);
        System.out.println(r01);
        Circulo c01 = new Circulo(pB, 2);
        System.out.println(c01);
        Triangulo t01 = new Triangulo(pB, 2, 3);
        System.out.println(t01);

        
        Ponto3D p0 = new Ponto3D(2, 3, 4);
        Ponto3D p1 = new Ponto3D(4, 6, 8);
        SegReta3D sr01 = new SegReta3D(p0, p1);
        System.out.println(sr01);


        Ponto3D p0 = new Ponto3D(0,0,0);
        Cubo cb1 = new Cubo(p0, 3);

        System.out.println(cb1);

        for(int i = 0; i < 10; i++){
            cb1.moveXYZ(1, 1, 1);
            System.out.println(cb1);
        }

        System.out.println(cb1);
        System.out.println("Humberto Araujo Ribeiro Neto"); */

        Ponto3D centro = new Ponto3D(0,0,0);
        Esfera esfera01 = new Esfera(centro, 3);

        System.out.println(esfera01);

        for(int i = 0; i < 10; i++){
            esfera01.moveXYZ(1, 1, 1);
            System.out.println(esfera01);
        }

        System.out.println(esfera01);
        System.out.println("Humberto Araujo Ribeiro Neto");
    }
    
}
