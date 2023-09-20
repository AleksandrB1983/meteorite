public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 74;
        int height = 179;

        int bmi = service.calculate(weight , height);

        System.out.println(bmi + " Индекс массы тела");
        System.out.println( " Индекс массы тела норма у мужчины < 25 ");
    }
}