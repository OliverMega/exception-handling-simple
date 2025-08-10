public class Main {
    public static void main(String[] args) {
        try {
            int result = MathUtil.divide(10, 0);
            System.out.println("結果: " + result);
        } catch (DivisionByZeroException e) {
            // TODO: handle exception
            System.out.println("發生錯誤: " + e.getMessage());
        }
    }
}
