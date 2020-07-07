public class Main {
    public static void main(String[] args) {
        char a = 36;
        char b = 0x24;
        char c = 0b100100;

        Car myCar = new Car(10000, 530);
        System.out.println(myCar.isMileageUnderLimit(15000));
    }
}
