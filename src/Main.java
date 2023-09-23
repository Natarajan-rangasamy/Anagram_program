import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anagram_checker........!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string.......");
        String s2 = sc.nextLine();
        System.out.println("checking");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("It's not an anagram");
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2) == true){
            System.out.println("It's an Anagram..........");
        }
        else{
            System.out.println("It's not an Anagram......");
        }
    }
}