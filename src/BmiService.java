public class BmiService {
    public int calculate(int weightInKg, double heightInCm) {

        double bmi = weightInKg / ((heightInCm * heightInCm) / 10_000);
        return (int) bmi;
    }
}
