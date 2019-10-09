package com.company;

public class Main {

    public static void main(String[] args) {
        //Создаем новый массив со случайными целыми числами
	int [] NewArray = new int [30];
	for (int i=0; i<=NewArray.length-1; i++)
    {
        NewArray[i]= (int) ((Math.random()*15));
        System.out.print(NewArray[i]+" ");
    }
	    //Метод сортировки COMB SORT
	int c = NewArray.length;
	int d=c;
	int a,b;
	for (int x=1;d>=1;x++)
    {
        for (int i=0;i+d<=NewArray.length-1;i++)
        {
            if (NewArray[i]>NewArray[i+d])
            {
                a=NewArray[i];
                b=NewArray[i+d];
                NewArray[i]=b;
                NewArray[i+d]=a;
            }
        }
       d = (int) (c/(1.25*x));
    }
	    //Вывод отсортированного массива
        System.out.println(" ");
        for (int i=0; i<=NewArray.length-1; i++)
        {
            System.out.print(NewArray[i]+" ");
        }
    }
}