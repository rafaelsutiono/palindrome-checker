import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class palindromeOrNo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String in = scan.nextLine();

        if (palindrome(in)) {
            System.out.println("wahhh palindrome");
        } else {
            System.out.println("wahhh no palindrome no good");
        }
    }

    public static boolean palindrome(String input) {
        Stack<Character> s = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        String toString = input.replaceAll("\\s+", ""); // remove all spaces from input string

        // push each character onto stack and add to queue
        for (int i = 0; i < toString.length(); i++) {
            char c = toString.charAt(i);
            s.push(c);
            q.add(c);
        }

        // compare characters from both stack and queue
        while (!s.empty()) {
            char c1 = s.pop();
            char c2 = q.remove();
            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }
}