package collections;

public class ArrayUtils implements IArrayUtils {


    @Override
    public int sum(int[] numbers) {

//        int [] suma = new int[] {1, 3, 7, 4, 1, 8};
        int sum = 0;

        for (int i=0; i<numbers.length; i = i + 1){

            sum = sum + numbers[i];

//            System.out.println(sum);
        }

        int[] intArray = new int[3];
        intArray[0] = 5;
        intArray[1] = -2;
        intArray[2] = 145;

        for (int i=0; i<intArray.length; i++ ){

            System.out.println(numbers[i]);
        }

        return sum;

        //sum=sum +suma[i];

        //int [] tablica = new int [1];
//        int [] tablica1 = new int [3];
        //int [] tablica2 = new int [7];
        //int [] tablica3 = new int [4];
        //int [] tablica4 = new int [1];
        //int [] tablica5 = new int [8];
    }

    @Override
    public int findLargestNumber(int[] numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        //new int[] {-10, -6, -3}
        int largestNumber = numbers [0];

        for (int number:numbers){
            if (number>largestNumber) {

                largestNumber = number;
            }

        }

        return largestNumber;
    }

    @Override
    public double calculateAverage(double[] numbers) {

        double sum = 0;

        for (int i=0; i<numbers.length; i++) {

            sum = sum + numbers[i];
        }

        double avg = sum / numbers.length;

        return avg;
    }

    @Override
    public String join(String[] texts) {

        String s1 = texts [0];
        String s2 = texts [1];
        String s3 = texts [2];

        String join = s1+s2+s3;

        return join;
    }

    @Override
    public int[] takeFirstTwoNumbers(int[] numbers) {

        int [] firstNumbers = new int [2];

        int num1 = numbers [0];
        int num2 = numbers [1];

        firstNumbers [0]= num1;
        firstNumbers [1] = num2;


        return firstNumbers;
    }
}
