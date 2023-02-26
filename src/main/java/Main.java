import ru.netology.javaqa.javaqamvn.services.SQRservice;

public class Main {

    public static void main(String[] args) {
        SQRservice service = new SQRservice();
        int result = service.calcSqrt(300, 600);
        System.out.println("Количество корней " + result);
    }
}
