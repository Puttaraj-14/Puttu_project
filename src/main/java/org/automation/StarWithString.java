package org.automation;

public class StarWithString {
    public static void main(String[]args) {
        String s = "selenium";
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i++) {
                char z = s.charAt(i);
            String star[] =new String[i+2] ;
            star[0]="*";
            for (int j = 0; j <i; j++) {
                star[j+1]=star[j]+"*";
            }

            System.out.print(z+" "+star[i]+"   ");


            }
//int c=5;
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < c-i; j++) {
//                System.out.print("-");
//            }
//            for (int j = 0; j < i; j++) {
//                if(j==0){
//                System.out.print("&");
//                }else if(i==c-1){
//                    System.out.print("&");
//                }
//                else{
//                    System.out.print("-");
//                }
//            }
//            for (int j = 0; j <= i-1; j++) {
//                if(j==i-1-1){
//                    System.out.print("&");
//                }
//                else if(i==c-1){
//                    System.out.print("&");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//
//            System.out.println();
//
//        }



        }



    }

