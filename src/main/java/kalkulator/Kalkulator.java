package kalkulator;

public class Kalkulator {
    public int kalkulator (Integer a, Integer b, String operacja) {
        if (isNull(a, b)) {
            if ("s".equals(operacja)) {
                return a + b;
            } else if ("r".equals(operacja)) {
                return a - b;
            } else if ("m".equals(operacja)) {
                return a * b;
            } else if ("d".equals(operacja)) {
                return a / b;
            } else {
                return 0;
            }
        }
        return 0;
    }

    private boolean isNull(Integer a, Integer b) {
        return a != null && b != null;
    }
}
