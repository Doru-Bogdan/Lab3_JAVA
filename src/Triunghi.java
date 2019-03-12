import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triunghi {
    private double latura1;
    private double latura2;
    private double latura3;

    public Triunghi(double latura1, double latura2, double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public double getLatura1() {
        return latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public double getLatura3() {
        return latura3;
    }

    public double perimetru() {
        return latura1 + latura2 + latura3;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
    }

    public String toString() {
        if (latura1 == latura2 || latura1 == latura3 || latura2 == latura3)
            return "isoscel." ;
        if (latura1 == latura2 && latura2 == latura3)
            return "dreptunghic";
        if (latura1 * latura1 + latura2 * latura2 == latura3 * latura3 || latura1 * latura1 + latura3 * latura3 == latura2 * latura2 || latura2 * latura2 + latura3 * latura3 == latura1 * latura1)
            return "dreptunghic";
        return "oarecare";
    }

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scan = new Scanner(System.in);
//        double l1, l2, l3;
//        l1 = scan.nextDouble();
//        l2 = scan.nextDouble();
//        l3 = scan.nextDouble();
//        Triunghi t1 = new Triunghi(l1,l2,l3);
//        System.out.println("Triunghiul t1 are perimetrul = " + t1.perimetru());
//        System.out.println("Triunghiul este " + t1.toString());
        citireFisier();
    }

    public static void citireFisier() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/dorumancila/Desktop/Lab3_JAVA/src/data_in.txt"));
        Triunghi t1 = new Triunghi(0,0,0);
        while (scan.hasNext()) {
            double l1, l2, l3;
            l1 = scan.nextDouble();
            l2 = scan.nextDouble();
            l3 = scan.nextDouble();
            t1.setLatura1(l1);
            t1.setLatura2(l2);
            t1.setLatura3(l3);
            System.out.println("Triunghiul este " + t1.toString());
        }
        scan.close();
    }
}
