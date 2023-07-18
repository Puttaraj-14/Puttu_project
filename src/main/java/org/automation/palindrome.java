package org.automation;

public class palindrome {

    public static void main(String[]args) {
        int rev = 0;
        int no = 454;
        int copy = no;
        while (no!=0) {

            int rem = no % 10;
            rev = rem * 10 + rem;
            no = no / 10;
        }
        if(rev==copy){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }

    //palindrome for string



}

