public class Rectangulo {
    private double alto;
    private double ancho;
    public Rectangulo(double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
    public Rectangulo(){
        this.alto=0;
        this.ancho=1;
    }
    public void setAlto(double n){
        this.alto=n;
    }
    public void setAncho(double n){
        this.ancho=n;
    }
    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + this.alto +
                ", ancho=" + this.ancho +
                '}';
    }
    public double getArea(){
        return this.alto*this.ancho;
    }
    public double getPerimetro(){
        return (this.alto+this.ancho)*2;
    }
}
