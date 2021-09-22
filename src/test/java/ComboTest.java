import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboTest {
    @Test
    void deveRetornarPacote() {
        Passagem passagem1 = new Passagem(480f, "Rio de Janeiro");
        Hospedagem hospedagem1 = new Hospedagem(850f, "hotel 4 estrelas");

        float valorFinal = passagem1.getValor() + hospedagem1.getValorFinal();
        Combo combo = new Combo(valorFinal);

        assertEquals(1330f, combo.getValorFinal());


    }
}