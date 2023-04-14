public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int m = 98;
        double h = 1.87;
        int bMI = service.bMINumber(m, h);

        System.out.println(bMI);
    }
}