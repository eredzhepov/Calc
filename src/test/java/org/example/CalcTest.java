package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @BeforeAll
    public static void setUp(){
        System.out.println("Before all");
    }
    @BeforeEach
    public void beforeAll(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }


    @Test
    @DisplayName("Проверка суммы")
    @Tag("summ")
    @Timeout(10)
            void sum() {
        Calc calc = new Calc();
        int result = calc.summ(5, 6);
        Assertions.assertEquals(11, result,"Сумма не верна");
    }

    @ParameterizedTest
    @CsvSource({"0, 0, 0"})
    void sum2(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result,"Сумма не верна");
    }


    @ParameterizedTest(name = "#{index} - сложение  {0} с {1}, ожидаемый результат = {2}")
    @CsvSource({"0, 0, 0", "1, 1, 2"})
    @DisplayName("Проверка сложения параметризацией")
    @Tag("summ")
    void sumParam(int a, int b, int expResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expResult, result,"Сумма не верна");
    }
    @Test
    @DisplayName("Проверка вычитания")
    @Timeout(10)
    @Tag("minus")
    void minus() {
        Calc calc = new Calc();
        int result = calc.minus(5, 6);
        Assertions.assertEquals(-1, result,"Разность не верна");
    }

    @ParameterizedTest(name = "#{index} - вычитание из {0} - {1}, ожидаемый результат = {2}")
    @CsvSource({"1,5,-4","-4,2,-6","-2,-3,1"})

    void minusParam(int a, int b, int c) {
        Calc calc = new Calc();
        int result = calc.minus(a, b);
        Assertions.assertEquals(c, result,"Разность не верна");
    }

}