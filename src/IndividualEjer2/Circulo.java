package IndividualEjer2;

public class Circulo extends FiguraGeometrica{

    private int radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio,2);
    }
}
