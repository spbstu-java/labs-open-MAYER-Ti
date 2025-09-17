package lab_2;

public class DemoService {
    public DemoService() {} // обязательный конструктор без аргументов

    // --- Публичные методы (для полноты задания, вызываться не будут) ---
    public void greet(String name) {
        System.out.println("public greet: Hello, " + name);
    }

    public int sum(int a, int b) {
        int r = a + b;
        System.out.println("public sum: " + a + " + " + b + " = " + r);
        return r;
    }

    // --- Защищённые методы (аннотированы) ---
    @Repeat(2)
    protected void logAction(String action, int code) {
        System.out.println("protected logAction: action=" + action + ", code=" + code);
    }

    @Repeat(3)
    protected int square(int x) {
        int r = x * x;
        System.out.println("protected square(" + x + ") = " + r);
        return r;
    }

    // --- Приватные методы (аннотированы) ---
    @Repeat(1)
    private String secretConcat(String a, String b, String c) {
        String r = a + b + c;
        System.out.println("private secretConcat -> \"" + r + "\"");
        return r;
    }

    @Repeat(4)
    private static void staticSecret(int n, boolean flag) {
        System.out.println("private staticSecret: n=" + n + ", flag=" + flag);
    }
}
