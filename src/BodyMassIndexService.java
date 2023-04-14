public class BodyMassIndexService {

    public int bMINumber(int m, double h) {
        int result;
        result = (int) (m / (h * h));
        return (int) result;

    }
}
