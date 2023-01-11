import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial1() {
        Factorial factorial = new Factorial(3);
        assertEquals(6,factorial.Factorial1());
    }

    @org.junit.jupiter.api.Test
    void factorial2() {
        Factorial factorial = new Factorial(3);
        int[]array = new int[4];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        array[3] = 6;
        int[]array_e = factorial.Factorial2();
        for(int i = 0; i < 4; i++) {
            assertEquals(array[i], array_e[i]);
        }
    }
}