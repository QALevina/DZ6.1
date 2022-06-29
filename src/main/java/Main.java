import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int miniRangeLimit = 200;
        int maxiRangeLimit = 300;
        int sqr = service.squareRootOfTheRange(miniRangeLimit, maxiRangeLimit);
        System.out.println("В указанном диапазоне " + sqr + " квадрата (ов) чисел");
    }
}
