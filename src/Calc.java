import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double licz1;
        double licz2;
        String znak;

        System.out.println("wprowadź liczbę");
        Scanner wej = new Scanner(System.in);

        licz1 = wej.nextDouble();
        System.out.println("wprowadź drugą liczbę");

        licz2 = wej.nextDouble();

        System.out.println("jakie działanie");

        znak = wej. next();

        switch(znak) {

            case "+":

                System.out.println(licz1 + licz2);
                break;

            case "-":
                System.out.println(licz1 - licz2);
                break;

            case "*":

                System.out.println(licz1 * licz2);
                break;

            case "/":

                if (licz2 == 0.0) {

                    System.out.println("nie dzielimy przez 0");
                }
                System.out.println(licz1 / licz2);
                break;
        }
    }
}
