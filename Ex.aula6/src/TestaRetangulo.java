public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        System.out.println("Base: "+retangulo1.getB());
        System.out.println("Altura: "+retangulo1.getH());
        System.out.println(retangulo1.isQuadrado(retangulo1.getB(), retangulo1.getH()));
        System.out.println("Perimetro: "+ retangulo1.calculaPerimetro(retangulo1.getB(), retangulo1.getH()));
        System.out.println("Area: "+ retangulo1.calculaArea(retangulo1.getB(), retangulo1.getH()));
        System.out.println(" ");

        Retangulo retangulo2 = new Retangulo(2,4);
        System.out.println("Base: "+ retangulo2.getB());
        System.out.println("Altura: "+ retangulo2.getH());
        System.out.println(retangulo2.isQuadrado(retangulo2.getB(), retangulo2.getH()));
        retangulo2.isQuadrado(retangulo2.getB(), retangulo2.getH());
        System.out.println("Perimetro: "+ retangulo2.calculaPerimetro(retangulo2.getB(), retangulo2.getH()));
        System.out.println("Area: "+ retangulo2.calculaArea(retangulo2.getB(), retangulo2.getH()));
    }
}
