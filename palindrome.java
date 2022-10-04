public class Palindrome {

     public static boolean isPalindrome(int i, int j, String A)
    {
        
        if (i >= j) {
            return true;
        }
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }
        return isPalindrome(i + 1, j - 1, A);
    }
 
    public static boolean isPalindrome(String A)
    {
        return isPalindrome(0, A.length() - 1, A);
    }
 
    public static void main(String[] args)
    {
        
        String A = "Madam";
        A = A.toLowerCase();
        boolean str = isPalindrome(A);
        System.out.println(str);
    }
}
