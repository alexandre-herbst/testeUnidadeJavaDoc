package poo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestarTriangulo {

    @Test
    public void multiplicarPorZero(){
        // classe a ser testada

         Triangulo t = new Triangulo();

        //testes
        //(string, valor esperado, valor obtido
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(0,0,0));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(1,0,0));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(1,1,0));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(1,0,1));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(0,0,1));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(0,1,1));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(1,0,0));
        assertEquals("o valor do modulo", "Não é equilatero", t.verificarTipo(-1,-1,-1));

        assertEquals("o valor do modulo", "É equilatero", t.verificarTipo(1,1,1));


        assertEquals("verifica o triangulo", "É equilatero", t.verificarNovoTipo(1,1,1));
        assertEquals("verifica o triangulo", "É isósceles", t.verificarNovoTipo(1,1,2));
        assertEquals("verifica o triangulo", "É escaleno", t.verificarNovoTipo(1,2,3));
        assertEquals("verifica o triangulo", "Não é triangulo", t.verificarNovoTipo(3,-2,-1));


    }


}
