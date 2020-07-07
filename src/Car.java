public class Car {
    int mileage;
    int color;

    Car(int a, int b) {
        mileage = a;
        color = b;
    }

    boolean isMileageUnderLimit(int limit) {
        boolean result = mileage < limit;
        return result;
    }

    void increaseMileage(int x) {
        mileage = mileage + x;
        mileage += x;
    }
}
