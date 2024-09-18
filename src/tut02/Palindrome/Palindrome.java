package tut02.Palindrome;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    static int n;
    static int[] a;
    static boolean check = false;

    static void display(List<String> palindromicStrings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(a[i]);
        }
        String palindromicString = sb.toString();
        System.out.println(palindromicString);
        palindromicStrings.add(palindromicString);
    }

    static void nextString() {
        int i = n;
        while (a[i] == 1 && i > 0) {
            i--;
        }
        if (i == 0) {
            check = true;
        } else {
            a[i] = 1;
            for (int j = i + 1; j <= n; j++) {
                a[j] = 0;

            }
        }

    }

    public static boolean isPalindrome(int[] a) {
        int left = 1;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] != a[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai day nhi phan: ");
        n = sc.nextInt();
        a = new int[n + 1];

        List<String> palindromicStrings = new ArrayList<>();
        // Tao nhung gia tri dau tien la so 0,// Generate binary strings and check for palindromes
        while (!check) {
            if (isPalindrome(a) == true) {
                display( palindromicStrings);
            }
            nextString();

            // Writing the palindromic strings to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JavaSD\\JSD\\src\\tut02\\Palindrome\\result.out"))) {
                for (String palindromicString : palindromicStrings) {
                    writer.write(palindromicString);
                    writer.newLine();
                }

            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

            sc.close();

        }
    }
}
