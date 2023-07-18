package org.automation;

public class reversenumber {
   public static void main(String[]args) {
//      int no = 1234;
//      int rev = 0;
//      int r;
//
//
//         int z =no % 10;
//        int  rev2 = rev * 10 + z;
//         int num = no / 10;
//
//         System.out.println(rev2);

      String str="Automation";
      int vowelscount=0;
      int consnantscount=0;

      for(int i=0; i<str.length(); i++){
         if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
         {
            vowelscount++;

         }else if(str.charAt(i)>='a' && (str.charAt(i)<='z')){

            consnantscount++;
         }

      }
      System.out.println(vowelscount);

      System.out.println(consnantscount);
   }
   }


