package org.example._25_03_24;



import java.util.Arrays;

/*
1.Найдите сумму всех нечетных элементов массива.
2.Найдите максимальный элемент в массиве.
3: Проверьте, содержит ли массив заданный элемент.
4: Посчитайте, сколько раз заданный элемент встречается в массиве.
5: Инвертируйте элементы массива.

 */
public class Task_1 {
    public static void main(String[] args) {
        //int[] array2 = {-2, -100, -40, 23, 55, 23, 59};
        //int[] array = {5, 13, 22, 4, 9, 18};
        //System.out.println(findOddNumbers(new int[]{5, 13, 22, 4, 9, 18}));
        //System.out.println(findMaxElementInArray(new int[]{5, 13, 22, 4, 9, 18}));
        //System.out.println(findElement(array2,-2));
        //System.out.println(countElement(array2,23));
        //replaceElement(array2);
       // System.out.println(Arrays.toString(array2));
       // System.out.println(getOddElementsFromOddIndex(new int[]{2,5,5,-5}));
        //System.out.println(getEvenElementsFromOddIndex(new int[]{6,1,7,4,9}));
        //System.out.println(getSumOfOddElements(new int[]{1,2,3,2}));
       // System.out.println(findDifferenceInArray(new int[]{7,4,2,8,1}));
        System.out.println(findSumBetweenFirstAndLast(new int[]{1,2,3,2,4}));
    }

    public static int findOddNumbers(int[] array) {
        int sum = 0;
        for (int v : array) {
            if (v % 2 != 0)
                sum += v;
        }
        return sum;
    }

    public static int findMaxElementInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return element;
            }
        }
        return -1;
    }

    public static int countElement(int[] array, int element) {
        int counter = 0;
        for (int j : array) {
            if (j == element) {
                counter++;
            }
        }
        return counter;
    }

    public static int replaceElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        return array.length/2;
    }

    /*
    6: Найдите сумму всех нечетных элементов массива которые находятся на нечетных индексах.
7: Найдите сумму всех четных элементов массива которые находятся на нечетных индексах.
8: Найдите произведение всех нечетных элементов массива.
9: Найдите разность между максимальным и минимальным элементами массива.
10: Найдите сумму элементов массива, которые находятся между первым и последним положительными элементами.
     */
    public static int getOddElementsFromOddIndex(int[] array){
        int sumOddNum = 0;
        for (int i = 1; i < array.length; i += 2) {
            if(array[i] %2 != 0){
                sumOddNum += array[i];
            }
        }
        return sumOddNum;
    }

    public static int getEvenElementsFromOddIndex(int[] array){
        int sumEvenNum = 0;
        for (int i = 1; i < array.length; i += 2) {
            if(array[i] %2 == 0){
                sumEvenNum += array[i];
            }
        }
        return sumEvenNum;
    }

    public static int getSumOfOddElements(int[] array){
        int sum = 1;
        for (int i = 1 ; i < array.length ; i+=2) {
            sum *= array[i];
        }
        return sum;
    }

    public static int findDifferenceInArray(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        for (int j = 0; j <array.length ; j++) {
            if(array[j] > max){
                max= array[j];
            }
        }
        return max-min;
    }

    public static int findSumBetweenFirstAndLast(int[] array){
        int sum = 0;
        for (int i = 1; i < array.length -1; i++) {
            if (array[i] > 0){
                sum += array[i];
            }
        }
        return sum;
    }
    }


