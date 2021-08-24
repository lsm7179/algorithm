package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2750 {
    static int[] array;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        array=new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i]=Integer.parseInt(br.readLine());
        }
        selectionSort();
        printArray();
    }
    private static void selectionSort() {
        for (int i = 0; i < array.length-1; i++) {
            int minIndex=i;
            for (int j = i; j < array.length; j++) {
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }

    private static void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }




}