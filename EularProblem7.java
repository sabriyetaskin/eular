// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EularProblem7 {

    // What is the 10001st prime number?

    public static int findNthPrimative(int n){
        int countPrimitive = 0;
        int isPrimative = 1;
        while (countPrimitive < n) {
            isPrimative++;
            for (int i = 2; i < isPrimative + 1; i++) {
                int rest = isPrimative % i;
                if (rest == 0 && i != isPrimative) {
                    break;
                } else if (rest == 0 && i == isPrimative) {
                    countPrimitive++;
                }
            }
        }
        return isPrimative;
    }

    public static void main(String[] args) {
        System.out.println(findNthPrimative(10001));
    }
}
