package org.automation;

public class Reverse {

    public static void main(String[]args){
        String s="i want go somewhere";
//        String[] z=null;
        String[] z=s.split(" ");
        String revewrse1 = "want";
        String revewrse2 = "go";
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < z.length; i++) {
            if (z[i].equals(revewrse1)) {
                index1 = i;
            }
            if (z[i].equals(revewrse2)) {
                index2 = i;
            }
        }
     // Reverse the words using a loop
        String reverse1 = "";
        for (int i = revewrse1.length() - 1; i >= 0; i--) {
            reverse1 += revewrse1.charAt(i);
        }
        String reversedWord2 = "";
        for (int i = revewrse2.length() - 1; i >= 0; i--) {
            revewrse2 += revewrse2.charAt(i);
        }

        // Replace the original words with the reversed words
        z[index1] = reverse1;
        z[index2] = revewrse2;

// Join the array of words back into a sentence using the String.join() method
        String reversedSentence = String.join(" ", z);

        System.out.println(reversedSentence);
//             for(int i=0; i<z.length; i++) {
//                 System.out.print(" "+z[i]);
//
//             }
    }

}
