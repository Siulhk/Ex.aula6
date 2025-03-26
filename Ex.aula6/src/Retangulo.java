public class Retangulo {
    private double b,h;

    public Retangulo(){
        b = 1;
        h = 1;

    }

    public Retangulo(double b, double h){
        this.b=b;
        this.h=h;
    }
    public double getB(){ return b;}
    public double getH(){ return h;}
    public void setB(double b){ if(this.b >0 ){this.b = b;}
    else System.out.println("Número inserido é menor que zero");}
    public void setH(double h){ if(this.h >0 ){this.h = h;}
    else System.out.println("Número inserido é menor que zero");}

    public double calculaPerimetro(double b, double h){
        return (b + h) * 2;
    }
    public double calculaArea (double b, double h){
        return b * h;
    }
    public void imprimePerimetro(){
        System.out.println(calculaPerimetro(b,h));
    }
    public void imprimeArea(){
        System.out.println(calculaArea(b,h));
    }

    public String isQuadrado(double b,double h){
        if (b == h) return "É um retangulo quadrado";
        else return "Não é um retangulo quadrado";
    }

}
