package org.automation;

public class star2 {
    public static void main(String[]args){

        for(int i=1; i<=5; i++){
            for(int j=i; j<=5-1; j++){
                System.out.print("_");
            }
            for(int j=1; j<=i; j++){
                if(j==1){
                System.out.print("*");
                }
                else if(i==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=i-1; j++){
                if (j==i-1)
                System.out.print("*");
                else if(i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();


        }


    }

}
