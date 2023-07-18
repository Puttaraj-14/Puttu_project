package NeetCode;

import javafx.beans.binding.Bindings;

import java.util.Arrays;
 class Anagram {
    public static boolean ana(String z1,String z2){
         if(z1.length()==z2.length()){
             return true;
         }
         return false;
     }
  public static void main(String[]args){
        String t1="listen";
        String t2="silent";
           char[]z1=t1.toCharArray();
           char[]z2=t2.toCharArray();
         Arrays.sort(z1);
         Arrays.sort(z2);
//         ana(z1.toString(),z2.toString());
System.out.println(ana(z1.toString(),z2.toString()));


  }
}


