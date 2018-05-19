package javaTasks;

public class LargestPalindromeProduct {
	public static void main(String[] args) {
        int res = 0, num1 = 0, num2 = 0;
        String temp1 = "", temp2 ="", rev = "";
        for(int i = 100; i < 1000; i++) {
            for(int j = i; j < 1000; j++) {
                int prod = i * j;
                temp1 = Integer.toString(prod);
                temp2 = temp1;
                
                String reverse = new StringBuffer(temp1).
                reverse().toString();
                
                if(temp2.equals(reverse) && res < prod) {
                    res = prod;
                    num1 = i;
                    num2 = j;
                }      
            }
        }

        System.out.println("Palindrome is: " + res);
        System.out.println("Numbers are: " + num1 + " and " + num2);
        System.out.println(num1 + " * " + num2 + " = " + res);
    }
}
