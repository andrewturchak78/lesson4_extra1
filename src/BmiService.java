public class BmiService {

    public double calculate(double growth, double weight) {
        double index = weight / (growth * growth);
        return index;
    }
}
