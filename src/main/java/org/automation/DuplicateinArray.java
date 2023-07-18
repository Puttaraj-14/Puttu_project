package org.automation;

public class DuplicateinArray {

    public static void main(String[]args){
        int[] array= new int[]{8,3,8,1,2,0,2,1,4};
        for(int i=0;i<array.length;i++) //this loop for index and each index compare ex; i=0 &j=i+1=0+1=1 a[i]=a[j]
                        //a[0]=a[1]  8=3 this is not equal its not enter the loop then go out of loop agian compare
        {
          for(int j=i+1; j<array.length; j++)
          {
             if(array[i]==array[j])
             {
                 System.out.print(array[j]);
             }
          }
        }

    }
}
