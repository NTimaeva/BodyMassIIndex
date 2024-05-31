public class BmiService {

    public double calculate(double heightInMeters, int weightInKg) {
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        return bmi;

    }
}

