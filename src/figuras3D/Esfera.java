package figuras3D;

public class Esfera implements Figuras3D{
    private Ponto3D centro;
    private double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = new Ponto3D(centro.getX(), centro.getY(), centro.getZ());
        this.raio = raio;
    }

    public Ponto3D getCentro() {
        return new Ponto3D(centro.getX(), centro.getY(), centro.getZ());
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(raio, 3) /3);
    }

    @Override
    public double superficie() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }

    @Override
    public void moveZ(double dZ) {
        centro.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        centro.moveXZ(dX, dZ);

    }

    @Override
    public void moveYZ(double dY, double dZ) {
        centro.moveYZ(dY, dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        centro.moveXYZ(dX, dY, dZ);
    }

    @Override
    public String toString() {
        return "Esfera ( " + "centro: " + centro
                + "\n, " + "raio: " + raio
                + "\n, "+ "Volume" + volume()
                + "\n, "+ "Area da Superficie: " + superficie() + ')';
    }
}

