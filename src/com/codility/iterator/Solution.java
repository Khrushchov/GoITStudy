package com.codility.iterator;

public class Solution {
    public static void main(String[] args) {

        System.out.println("\n" + solution(64));
    }

    public static int solution(int n){
        int lengthMaxSequence = 0;
        int lengthSequence = 0;
        String binary = Integer.toBinaryString(n);
        char[] chars = binary.toCharArray();
        for (int i = 0; i < chars.length; i++){
          if( chars[i] == '0'){
            lengthSequence++;
          } else {
              if (lengthSequence > lengthMaxSequence){
                  lengthMaxSequence = lengthSequence;
              }
              lengthSequence = 0;
          }
            System.out.print(chars[i]);
        }
        return lengthMaxSequence;
    }

}
