package org.automation;

public class CountDuplicateByhashmap  {

    public static void main(String[]args) {
//        String s="java";
//        char[] z =s.toCharArray();
//        HashMap<Character,Integer> map= new HashMap<Character, Integer>();
//        for(int i=0; i<z.length;i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)+1);
//            } else{
//                map.put(ch,1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            System.out.println("key : " + entry.getKey()+"  "+"value : "+entry.getValue());
//        }








//        int [] a={1,2,3,4,6};
//        int [] b={1,2,3,4,5,6};
//        int sumA=0;
//        int sumB=0;
//
//        for(int i=0; i<a.length; i++){
//            sumA=sumA+a[i];
//        }
//        for(int j=0; j<b.length; j++){
//            sumB=sumB+b[j];
//        }
//        int sumtotal=sumB-sumA;
//        System.out.println(sumtotal);







        int [] a={7,2,7,5,4,3,4,9,4,3};
        for(int i=0; i<=a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);

                }
            }


        }













    }

}
