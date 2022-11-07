import org.example.Calculdora_Area;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora_AreaTest {

    @Test
    public void caso1areaTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 3;
        int altura = 5;
        int area = cal.area(base,altura);
        assertEquals(15,area,"esta incorreto");
    }
    @Test
    public void caso1perTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 3;
        int altura = 5;
        int per = cal.perimetro(base,altura);
        assertEquals(16,per,"Errou");
    }
    @Test
    public void caso2areaTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 5;
        int altura = 8;
        int area = cal.area(base,altura);
        assertEquals(40,area,"esta incorreto");

    }
    @Test
    public void caso2perTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 5;
        int altura = 8;
        int per = cal.perimetro(base,altura);
        assertEquals(26,per,"Errou");
    }
    @Test
    public void caso3areaTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 2;
        int altura =4;
        int area = cal.area(base,altura);
        assertEquals(8,area,"esta incorreto");
    }
    @Test
    public void caso3perTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 2;
        int altura =4;
        int per = cal.perimetro(base,altura);
        assertEquals(12,per,"Errou");
    }

    @Test
    public void isTrianguloTest(){
        Calculdora_Area cal = new Calculdora_Area();
        int base = 5;
        int altura =4;
        int larg = 6;
        int triangulo =  cal.isTriangle(base,altura,larg);
        assertEquals(triangulo,1,"Não é possivel ser triangulo");
    }
}
