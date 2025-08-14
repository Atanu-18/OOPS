public class test {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int num = 2; num <= 100; num++) {
            int count = 0; // count how many divisors

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // prime numbers have exactly 2 divisors (1 and itself)
                System.out.print(num + " ");
            }
        }
    }
}
