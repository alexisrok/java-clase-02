package IndividualEjer2;

public class MainFiguraGeometrica {

    public static void main(String[] args)
    {
        Circulo c = new Circulo(120);
        Rectangulo r = new Rectangulo(5,3);
        Triangulo t = new Triangulo(4,6);

        FiguraGeometrica[] arr={c,r,t};

        double x = FiguraUtil.areaPromedio(arr);
        System.out.println(x);
    }

}
