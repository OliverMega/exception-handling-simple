

public class MathUtil {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("除數不可為0");
        }
        return a / b;
    }
}
