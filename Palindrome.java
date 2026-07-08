public class PalindromeNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (isPalindrome(i))
                System.out.println(i + " bir Palindrom sayıdır.");
        }
    }
    public static boolean isPalindrome(int number) {
        int reverseNumber = 0, lastNumber, temp = number;
        while(temp != 0) {
            lastNumber = temp % 10;
            temp /= 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
        }
        return (reverseNumber == number);
    }
}
