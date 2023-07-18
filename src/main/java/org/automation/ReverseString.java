package org.automation;

public class ReverseString {

    public static void main(String[]args){

        //***using string concator method

        String str="java";
        String rev="";
//        for(int i=str.length()-1; i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
//        System.out.println(rev);

        //**using character array
        String str1="foodhub";
        char[] z = str1.toCharArray();
        for(int i=z.length-1; i>=0; i--){
                rev=rev+z[i];
        }
        System.out.println(rev);

      //using string buffer class
//      String p="computer";
//        StringBuffer y = new StringBuffer(p);
//        System.out.println(y.reverse());

    }
}
