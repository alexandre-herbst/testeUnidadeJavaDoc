package poo;

public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo() {

    }

    public String verificarTipo(int a, int b, int c){
        if((a == b && b == c) && (a > 0)){
            return "É equilatero";
        }
        else return "Não é equilatero";
    }


    public String verificarNovoTipo(int a, int b, int c){
        if((a == b && b == c) && (a > 0)){
            return "É equilatero";
        }

        else if((a == b && b != c) && (a > 0 && c > 0)){
            return "É isósceles";
        }

        else if((a != b && b != c && c != a) && (a > 0 && b > 0 && c > 0)){
            return "É escaleno";
        }

        else return "Não é triangulo";

    }



}
