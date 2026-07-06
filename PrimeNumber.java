public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int i = 2; i < 100; i++) {
            if (i == 2)
                System.out.println("2 bir asal sayıdır");
            else {
                for (int j = 2; j <= i/2; j++) {
                    if (i%j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.println(i + " bir asal sayıdır");
            }
            isPrime = true;
        }
    }
}
