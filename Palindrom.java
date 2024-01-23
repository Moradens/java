public class Palindrom {
    public static void main(String[] args) {
        int maxPalindrome = 0;
        int product = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int currentProduct = i * j;
                if (isPalindrome(currentProduct) && currentProduct > maxPalindrome) {
                    maxPalindrome = currentProduct;
                    product = i * j;
                }
            }
        }

        System.out.println("Největší číselný palindrom vzniklý součinem dvou trojciferných čísel je: " + maxPalindrome);
        System.out.println("Součin odpovídajících čísel: " + product);
    }

    private static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        String reversedStr = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(reversedStr);
    }
}
