package org.automation;

public class MaxMinValue {

    public static void main(String[]args){
        int a[]={223,12,90,56,10,99,300};
        int min=a[0];// we consider a[0]=223=min and all numbers compare with a[0] then update the value
        int max=a[0]; // a[0]=223=min
        for(int i=0; i<a.length; i++){
            if(a[i]>max)
                max=a[i];

            if(a[i]<min)
                min = a[i];

        }
  System.out.println(max);
        System.out.println(min);

    }
}
