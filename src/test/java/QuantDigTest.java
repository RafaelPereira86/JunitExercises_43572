import org.example.QuantDig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuantDigTest {

    static String txt;
    QuantDig num;
    @BeforeEach
    public void setup(){
        txt="1234";
        num = new QuantDig();
    }

    @Test
    public void calculartest(){
        int sum = num.calculo(txt);
        assertEquals(10,sum,"A soma não esta correta.");
    }

    @Test
    public void comprimentotest(){
        int comp = num.comprimento(txt);
        assertEquals(4,comp,"O comprimento nao esta correto");
    }
}
