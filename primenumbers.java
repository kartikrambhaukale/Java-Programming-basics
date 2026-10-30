package operator;

public class primenumbers {

    public static void main(String[] args) {

        int num = 17;
        boolean isPrime = num > 1;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}