public class Main{
    public static Double function(double x) {
        return x*x;
    }
    public static Double slope (double x){
        return 2*x;
    }
    public static void main (String[] args){
        double x = -6;
        System.out.printf("%-10s %-10s %-10s%n", "x", "f(x)", "Slope");
        System.out.println("------------------------------------");

        while (true) {
            System.out.printf("%-10.2f %-10.2f %-10.2f%n", x, function(x), slope(x));
            x++; // The less we add to the variable, the more slopes we have.
            if (x > 6) {
                break;
            }

        }
    }
}