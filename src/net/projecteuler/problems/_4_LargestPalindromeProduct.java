package net.projecteuler.problems;

public class _4_LargestPalindromeProduct {
    public static void main(String[] args) {
        int largest = 0;
        for(int i = 0; i < 1000; i++) {
            for(int j = 0; j < 1000; j++) {
                int check = i*j;

                String s = new StringBuilder(String.valueOf(check)).reverse().toString();
                if(String.valueOf(check).equals(s)) {
                    if(check > largest)
                        largest = check;
                }
            }
        }
        System.out.println(largest);
    }
}
