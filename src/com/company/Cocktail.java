package com.company;

public class Cocktail {

    public static void main(String[] args) {
        //Создаем новый массив со случайными целыми числами
        int[] NewArray = new int [30];
        for (int i = 0; i <= NewArray.length - 1; i++) {
            NewArray[i] = (int) ((Math.random() * 15));
            System.out.print(NewArray[i] + " ");
        }
        //Метод сортировки COCKTAIL SORT
        int start=0;
        int end=NewArray.length;
        int a, b;
        for (int x = 1;x<NewArray.length/2+1; x++) {
            for (int i = 0; i + 1 <= end-1; i++) {
                if (NewArray[i] > NewArray[i + 1]) {
                    a = NewArray[i];
                    b = NewArray[i + 1];
                    NewArray[i] = b;
                    NewArray[i + 1] = a;
                }
            }
            end--;
            for (int i=NewArray.length - 1; i-1>=start; i--)
            {
                if (NewArray[i] < NewArray[i - 1]) {
                    a = NewArray[i];
                    b = NewArray[i - 1];
                    NewArray[i] = b;
                    NewArray[i - 1] = a;
                }
            }
            start++;
        }
        //Вывод отсортированного массива
        System.out.println(" ");
        for (int i = 0; i <= NewArray.length - 1; i++) {
            System.out.print(NewArray[i] + " ");
        }
    }
}