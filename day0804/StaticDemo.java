package day0804;

public class StaticDemo {

    static int value = 66;

    public static void main(String[] args) throws Exception{
        new StaticDemo().method();
    }

    private void method() {
        int value = 123;
        System.out.println(this.value);
    }
}
