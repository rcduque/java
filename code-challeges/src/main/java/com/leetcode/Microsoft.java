package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Microsoft {


    public static void main(String[] args){


    }

    public static int solution(int[] a, int k) {

        if(a.length>k) return -1;

        int total =-1;

        List<Integer> temporalList = new ArrayList<>(); //list to store temporal sum result
        //sum all of them as possible max value
        int maxNumber = Arrays.stream(a).sum();

        if((maxNumber / 2) == 0) return  maxNumber;
        int index = 1;

        //sum by big numbers first
        //the milit will be all possible combinations
        for (int i = 0; i < a.length; i++) {

            temporalList = new ArrayList<>();
            temporalList.add(a[i]);
            for (int j = 1; j < k; j++) {
//                temporalList.add()
            }
        }


        return 0;
    }

















    public static void main2(String[] args){

        System.out.println(solution("abccbd", new int[]{0,1,2,3,4,5}));
//        System.out.println(solution("aabbcc", new int[]{1,2,1,2,1,2}));
//        System.out.println(solution("aaaa", new int[]{3,4,5,6}));
//        System.out.println(solution("ababa", new int[]{10,5,10,5,10}));
//        System.out.println(solution("aaaa", new int[]{6,4,5,3}));
    }

    public static int solution(String s, int[] c){

        String[] letters = s.split("");
        Set<Integer> removedIndex = new HashSet<Integer>();

        int counter = 0;

        for(int i=0; i<s.length()-1;i++){

            for (int index = i+1; index < letters.length; index++) {

                if(removedIndex.contains(i)) continue;

                if(letters[i].equals(letters[index])){

                    if(removedIndex.contains(index)) continue;

                    if(c[i] < c[index ]){
                        counter += c[i];
                        removedIndex.add(i);
                    }else{
                        counter += c[index];
                        removedIndex.add(index);
                    }
                } else {
                    break;
                }
            }
        }

        return counter;
    }

}
