package org.automation;

public class Sum {

    public static void main(String[] args) {


//        for(int i=1; i<7; i++){
//            for(int j=1; j<7; j++){
//                if(j==1){
//                    System.out.println("*");

//        String word = "abcd";
//        String rev = "";
//        char[] ch = word.toCharArray();
//        for (int i = ch.length - 1; i >= 0; i--) {
//
//            rev = rev + ch[i];
//        }
//        System.out.println(rev);


//        String s= "my name is java";
//        String []arr=s.split(" ");
//        List<String> listed= Arrays.asList(arr);
//        Collections.reverse(listed);
//        listed.toArray(arr);
//        for(String word:listed){
//            System.out.println(word);


        int no=123;
        int num=0;
        int count=0;
        while(no!=0){
            num=no%10;
            no=no/10;
            count++;
        }
        System.out.println(count);



    }












      /*  int num = 1234;
        int sum = 0;
        for (int i=0; i<4;i++) {
             sum = sum+num % 10;
            num= num/10;


        }
        System.out.println(sum);
    }

}
 */




    }
