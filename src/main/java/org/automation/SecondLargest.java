package org.automation;

public class SecondLargest {
    public static void main(String[]args) {
//
//        int[] a={0,9,2,6,3,1};
//        Arrays.sort(a); //first it is sorting for array
//        int second=a[a.length-2]; // anyway Seconds largests means in an array 2n element from last digit or element That's why
//        // a.length-2  or if ask third largest a.length-3
//        System.out.println(second);


        String s = "Java,puyo,hjoh,jhioh";
        for (int i = 0; i <= 3; i++) {
            String a = s.split(",")[i];
            System.out.println(a);

        }
        String i ="order id: 906396".replaceAll("[^0-9]", "");
        String a=i.replaceAll("[^0-9]", "");
        System.out.println(i);

//        PriorityQueue toDo= new PriorityQueue();
//        toDo.add("dishes");
//        toDo.add("laundry");
//        toDo.add("bills");
//        toDo.offer("bills");
//        System.out.println(toDo.size() +" " +toDo.poll());
//        System.out.println(" "+toDo.peek() + " "+toDo.poll());
//        System.out.println(" "+ toDo.poll()+  " "+ toDo.poll());



    }}
