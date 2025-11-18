public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[n + 1];

        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }

        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        int k = 2;
        while (k <= n) {
            if (isPrime[k]) {
                System.out.println(k);
                count++;
            }
            k++;
        }

        double percentage = (100.0 * count) / (n - 1);

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + (int)percentage + "% are primes)");
    }
}
