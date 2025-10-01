package sample.cafekiosk.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {
    @Test
    void add() {
        //given
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());

        System.out.println(">>> 담긴 음료 수 : " + cafeKiosk.getBeverages().size());
        System.out.println(">>> 담긴 음료 : " + cafeKiosk.getBeverages().get(0).getName());

        /*이 테스트의 문제
        *
        * 1. Console에 찍어서 사람이 확인한다.
        * 2. 타인이 보면 어떤 것을 검증해야 하는지 확인하기 어렵다.
        * 3. White case에 대한 검증만 존재한다.
        * */
    }
}