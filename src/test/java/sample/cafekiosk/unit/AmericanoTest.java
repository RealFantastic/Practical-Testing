package sample.cafekiosk.unit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {
    @Test
    void getName() throws Exception {
        //given
        Americano americano = new Americano();
        //when
        String name = americano.getName();

        //then
        //Junit 5
        assertEquals("아메리카노", name);
        //AssertJ
        assertThat(name).isEqualTo("아메리카노");

    }

    @Test
    void getPrice() throws Exception {
        //given
        Americano americano = new Americano();

        //when
        int price = americano.getPrice();

        //then
        assertThat(price).isEqualTo(4000);
    }
}