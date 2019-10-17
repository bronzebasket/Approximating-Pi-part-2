import java.util.Random;

class Pi {
    public static void main(String[] args) {
        System.out.println(approx(10e6));
    }
    public static double approx(double runs){
        Random random = new Random();
        long inside = 0;
        double approxPi = 0;
        for (long i = 0; i < runs; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            if ((x * x + y * y <= 1)){
                inside ++;
            }
            approxPi = 4 * ((double) inside / (double) (i));
        }
        return approxPi;
    }
}

