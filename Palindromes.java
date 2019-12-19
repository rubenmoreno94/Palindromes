import java.util.Scanner;

public class Palindromes {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String word = input.nextLine();
        if(isPalindrome(word)){
            System.out.println("The string "+word+" is palindrome");
        }
        else
        {
            System.out.println("The string "+word+" is not palindrome");
        }
    }

    /**
     * Method to determine if a string is palindrome
     * @param word string to check
     * @return boolean determining if 'word' is palindrome
     */
    public static boolean isPalindrome(String word){
        boolean isPalindrome = true;
        int right = word.length();

        for (int left = 0 ;left < (word.length()); left++){
            if (word.substring(left, left+1).equalsIgnoreCase(word.substring(right - 1, right)) == false ) {
                isPalindrome = false;
                break;
            }
            right--;
        }
        return isPalindrome;
    }
}
